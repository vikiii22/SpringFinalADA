package ad.spring.practicaFinal.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Consumidor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id_consumidor;
    String nombre;

    @ManyToMany
    @JoinTable(name = "videojuegos_has_consumidores", joinColumns = @JoinColumn(name = "consumidor_id_consumidor"),
            inverseJoinColumns = @JoinColumn(name = "videojuegos_id_videojuegos"))
    private Set<Videojuegos>videojuegos=new HashSet<>();

    public Consumidor() {
    }

    public Consumidor(int id_consumidor, String nombre) {
        this.id_consumidor = id_consumidor;
        this.nombre = nombre;
    }

    public int getId_consumidor() {
        return id_consumidor;
    }

    public void setId_consumidor(int id_consumidor) {
        this.id_consumidor = id_consumidor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Videojuegos> getVideojuegos() {
        return videojuegos;
    }

    public void setVideojuegos(Set<Videojuegos> videojuegos) {
        this.videojuegos = videojuegos;
    }

    @Override
    public String toString() {
        return "Consumidor{" +
                "id_consumidor=" + id_consumidor +
                ", nombre='" + nombre + '\'' +
                ", videojuegos=" + videojuegos +
                '}';
    }
}
