package ad.spring.practicaFinal.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Companyias {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_companyias;
    private String nombre;

    @ManyToMany(mappedBy = "companyias")
    private Set<Videojuegos> videojuegos=new HashSet<>();

    public Companyias() {
    }

    public Companyias(String nombre) {
        this.nombre = nombre;
    }

    public Companyias(int id, String nombre, Set<Videojuegos> videojuegos) {
        this.id_companyias = id;
        this.nombre = nombre;
        this.videojuegos = videojuegos;
    }

    public int getId_companyias() {
        return id_companyias;
    }

    @Override
    public String toString() {
        return "Companyias{" +
                "id=" + id_companyias +
                ", nombre='" + nombre + '\'' +
                ", videojuegos=" + videojuegos +
                '}';
    }

    public void setId_companyias(int id_companyias) {
        this.id_companyias = id_companyias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
