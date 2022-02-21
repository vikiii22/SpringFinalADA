package ad.spring.practicaFinal.bootstrap;

import ad.spring.practicaFinal.domain.Videojuegos;
import ad.spring.practicaFinal.repository.CompanyiasRepository;
import ad.spring.practicaFinal.repository.ConsumidorRepository;
import ad.spring.practicaFinal.repository.VideojuegosRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class BootStrapData implements CommandLineRunner {
    private final VideojuegosRepository videojuegosRepository;
    private final CompanyiasRepository companyiasRepository;
    private final ConsumidorRepository consumidorRepository;

    public BootStrapData(VideojuegosRepository videojuegosRepository, CompanyiasRepository companyiasRepository, ConsumidorRepository consumidorRepository) {
        this.videojuegosRepository = videojuegosRepository;
        this.companyiasRepository = companyiasRepository;
        this.consumidorRepository = consumidorRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un juego nuevo: ");
        String juego=sc.nextLine();
        Videojuegos videojuegos=new Videojuegos(juego);
        //videojuegosRepository.save(videojuegos);
        videojuegosRepository.delete(videojuegos);*/
        System.out.println("Tenemos " + videojuegosRepository.count() + " juego/s y tenemos " + companyiasRepository.count()
        + " compañia/s");
        System.out.println("Total de consumidores: " + consumidorRepository.count());
    }
}
