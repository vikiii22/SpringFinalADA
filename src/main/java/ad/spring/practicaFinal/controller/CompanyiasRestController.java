package ad.spring.practicaFinal.controller;

import ad.spring.practicaFinal.domain.Companyias;
import ad.spring.practicaFinal.domain.Videojuegos;
import ad.spring.practicaFinal.repository.CompanyiasRepository;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompanyiasRestController {
    private final Log log= LogFactory.getLog(VideojuegosRestController.class);
    private final CompanyiasRepository companyiasRepository;

    public CompanyiasRestController(CompanyiasRepository companyiasRepository) {
        this.companyiasRepository = companyiasRepository;
    }

    @GetMapping("/companyias")
    List<Companyias> getAll(){
        return (List<Companyias>) companyiasRepository.findAll();
    }

    @GetMapping("/companyias/{id}")
    Companyias one(@PathVariable Long id){
        return companyiasRepository.findById(Math.toIntExact(id)).orElseThrow(() -> new RuntimeException(String.valueOf(id)));
    }
}
