package ro.uvt;

//package ro.uvt.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ro.uvt.controllers.BooksController;
import ro.uvt.models.Carte;
import ro.uvt.models.Section;
import ro.uvt.spring.ClientComponent;
import ro.uvt.spring.SingletonComponent;
import ro.uvt.spring.TransientComponent;

@SpringBootApplication
public class MySpringApplicationLab11 {
    public static void main(String[] args) {
        SpringApplication.run(MySpringApplicationLab11.class, args);
    }
}