package guru.framework.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class RandomQuoteServiceImpl implements RandomQuoteService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public RandomQuoteServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
