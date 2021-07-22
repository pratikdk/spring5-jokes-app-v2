package course.sf.sfg_jokes_app.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokeService implements JokeGeneratorService {
    ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

    @Override
    public String getNewJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
