package course.sf.sfg_jokes_app.controllers;

import course.sf.sfg_jokes_app.services.JokeGeneratorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GenerateJokeController {
    private JokeGeneratorService service;

    public GenerateJokeController(JokeGeneratorService service) {
        this.service = service;
    }

    @RequestMapping("/")
    public String getJoke(Model model) {

        model.addAttribute("joke", service.getNewJoke());

        return "index";
    }
}
