package guru.springframework.spring5jokesappv2.controllers;/* 23/10/2022" "17:07" "Julian */

import guru.springframework.spring5jokesappv2.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;

   // @Autowired usuwamy to poniewaz do konstruktora jest wstawiany automatycznie
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public  String showJoke(Model model) {
        model.addAttribute("joke", jokeService.getJoke());
        return "index";
    }
}
