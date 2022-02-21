package ad.spring.practicaFinal.controller;

import ad.spring.practicaFinal.domain.Videojuegos;
import ad.spring.practicaFinal.repository.VideojuegosRepository;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VideojuegosRestController {
    private final Log log= LogFactory.getLog(VideojuegosRestController.class);
    private final VideojuegosRepository videojuegosRepository;

    public VideojuegosRestController(VideojuegosRepository videojuegosRepository) {
        this.videojuegosRepository = videojuegosRepository;
    }

    @GetMapping("/videojuegos")
    List<Videojuegos> getAll(){
        return (List<Videojuegos>) videojuegosRepository.findAll();
    }

    @GetMapping("/videojuegos/{id}")
    Videojuegos one(@PathVariable Long id){
        return videojuegosRepository.findById(Math.toIntExact(id)).orElseThrow(() -> new RuntimeException(String.valueOf(id)));
    }

    @PostMapping("/videojuegosi")
    Videojuegos newVideojuego(@RequestBody Videojuegos newVideojuego){
        log.info("newVideojuego");
        return videojuegosRepository.save(newVideojuego);
    }

    @PutMapping("/videojuegos-replace/{id}")
    Videojuegos replaceVideojuego(@RequestBody Videojuegos newVideojuego, @PathVariable Long id){
        return videojuegosRepository.findById(Math.toIntExact(id))
                .map(videojuegos -> {
                    videojuegos.setNombre(newVideojuego.getNombre());
                    return videojuegosRepository.save(videojuegos);
                })
                .orElseGet(()->{
                    newVideojuego.setId_videojuegos(Math.toIntExact(id));
                    return videojuegosRepository.save(newVideojuego);
                });
    }
}
