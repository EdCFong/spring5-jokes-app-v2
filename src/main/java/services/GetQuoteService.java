package services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class GetQuoteService implements IGetQuoteService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public GetQuoteService() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String GetJokeQuote()
    {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
