package com.example.JoJoLedo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JoJoLedoController {

    @GetMapping("/OpenTheGame")
    public String theGame(){

        return "index";
    }
}
