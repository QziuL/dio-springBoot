package qziul_web_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// anotação que este é um componente rest controller
// e seus métodos serão recursos HTTP (através do mapeamento)
@RestController
public class WelcomeController {
    @GetMapping
    public String welcome() {
        return "<h1 style='color: red; width: 520px; margin: auto; text-align: center'>" +
                    "Welcome to Qziul Web API" +
                "</h1>" +
                "<p style='color: red; width: 520px; margin: auto; text-align: center'center>" +
                    "SCRAKE SCRAKE" +
                "</p>";
    }
}
