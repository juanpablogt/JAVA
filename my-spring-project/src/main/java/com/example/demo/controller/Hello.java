package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/hello")
    public String hello() {
        return "Hallo,Ich bin Juan Pablo Gonzalez Trejos, Ich komme aus kolumbien,ich bin 24 Jahre alt, ich bin student an der Hochschule Bonn-Rhein-Sieg, ich studiere Informatik und ich bin im 5. Semester. Ich spreche Spanisch, Englisch und Deutsch. Ich bin ein sehr freundlicher und fleißiger Mensch. Ich bin sehr interessiert an der Technologie und ich bin sehr motiviert, um in der Zukunft ein guter Informatiker zu werden. Ich bin sehr glücklich. Vielen Dank.";
    }
}
