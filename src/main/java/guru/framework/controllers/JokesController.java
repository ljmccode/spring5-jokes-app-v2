package guru.framework.controllers;

import guru.framework.services.RandomQuoteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final RandomQuoteService randomQuoteService;

    public JokesController(RandomQuoteService randomQuoteService) {
        this.randomQuoteService = randomQuoteService;
    }

    @RequestMapping(value={"/", ""})
    public String showJoke(Model model) {
        model.addAttribute("joke", randomQuoteService.getJoke());
        return "index";
    }
}
