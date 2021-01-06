package ro.uvt.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idAutor;
    private String nume;
    public Autor(String nume) {
        this.nume=nume;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public Autor() {}

    @Override
    public String toString() {
        return "Autor{" +
                "nume='" + nume + '\'' +
                '}';
    }
}
