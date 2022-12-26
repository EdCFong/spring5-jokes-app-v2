package sfgjokesapp.springjokesapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sfgjokesapp.springjokesapp.services.GetQuoteService;

@Controller
public class JokeController {

    private final GetQuoteService jokeQuote;

    public JokeController(GetQuoteService jokeQuote) {
        this.jokeQuote = jokeQuote;
    }

    @RequestMapping({"/",""})
    public String showJoke(Model model){

        model.addAttribute("joke", jokeQuote.getJokeQuote());
        return "index";
    }
}
