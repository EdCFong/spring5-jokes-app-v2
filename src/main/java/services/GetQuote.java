package services;


public class GetQuote {

    public String GetJokeQuote()
    {
        var chuck = new guru.springframework.norris.chuck.ChuckNorrisQuotes();
        String quote = chuck.getRandomQuote();
        return quote;
    }
}
