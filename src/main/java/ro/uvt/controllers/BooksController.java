package ro.uvt.controllers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.uvt.models.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/carte")
public class BooksController {
    private final JpaRepository<Carte, Integer> booksRepository;



    @Autowired
    public BooksController(JpaRepository<Carte, Integer> booksRepository) {
        this.booksRepository = booksRepository;
    }

    @PostMapping
    public int saveCarteToDB(){
        Carte carte = createCarte();
        carte = booksRepository.save(carte);
        return carte.getIdCarte();
    }

    private Carte createCarte(){
        List<Autor> autori = Arrays.asList(new Autor("George Mart"), new Autor("NotGeorge Mart"));

        Carte c = new Carte(autori, "Cartea");
        c.add(new Paragraf("aa"));
        Section s1 = new Section("bb");
        s1.add(new Imagine("cc"));
        c.add(s1);

        return c;
    }

    @GetMapping("/{id}")
    public Carte getCarteToDB(int id){
        Carte carte = booksRepository.getOne(id);
        return carte;
    }

    @GetMapping
    public String getAll(){
        return "string";
    }

    @SneakyThrows
    @GetMapping("/{id}")
    public ResponseEntity<Element> getBook(@PathVariable Integer id) {
        Carte carte = booksRepository.getOne(id);
        return new ResponseEntity<>(carte, HttpStatus.OK);
    }
}
