package com.example.akc;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.Api;
import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Api(value = "图书Controller",tags = {"图书操作接口"})
@RestController
@SpringBootApplication
public class SwaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerApplication.class, args);
    }

    @GetMapping("/book/{id}")
    public Book book(){
        Book book = new Book();
        book.setAuther("罗贯中");
        book.setName("三国演义");
        book.setPrice(30f);
        book.setPublicationDate(new Date());
        return book;
    }

    @PostMapping("/add")
    public Boolean addBook(){
        return true;
    }

    @PutMapping("/update")
    public Boolean updateBook(){
        return true;
    }

    @DeleteMapping("/delete")
    public Boolean deleteBook(){
        return true;
    }

}

@Data
class Book{
    private String name;
    private String auther;
    @JsonIgnore
    private Float price;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date publicationDate;
}