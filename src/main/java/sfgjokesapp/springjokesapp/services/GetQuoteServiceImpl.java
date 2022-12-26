package sfgjokesapp.springjokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class GetQuoteServiceImpl implements GetQuoteService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public GetQuoteServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }
    @Override
    public String getJokeQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
