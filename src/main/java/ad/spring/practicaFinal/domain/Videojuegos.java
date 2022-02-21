package ad.spring.practicaFinal.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Videojuegos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_videojuegos;
    private String nombre;

    @ManyToMany
    @JoinTable(name = "videojuegos_has_companyias", joinColumns = @JoinColumn(name = "videojuegos_id_videojuegos"),
    inverseJoinColumns = @JoinColumn(name = "companyias_id_companyias"))
    private Set<Companyias>companyias=new HashSet<>();

    @ManyToMany(mappedBy = "videojuegos")
    private Set<Consumidor>consumidores=new HashSet<>();

    public Videojuegos() {
    }

    public Videojuegos(String nombre) {
        this.nombre = nombre;
    }

    public Videojuegos(int id, String nombre, Set<Companyias> companyias) {
        this.id_videojuegos = id;
        this.nombre = nombre;
        this.companyias = companyias;
    }

    public int getId_videojuegos() {
        return id_videojuegos;
    }

    public void setId_videojuegos(int id_videojuegos) {
        this.id_videojuegos = id_videojuegos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Companyias> getCompanyias() {
        return companyias;
    }

    public void setCompanyias(Set<Companyias> companyias) {
        this.companyias = companyias;
    }

    @Override
    public String toString() {
        return "Videojuegos{" +
                "id=" + id_videojuegos +
                ", nombre='" + nombre + '\'' +
                ", companyias=" + companyias +
                '}';
    }
}
