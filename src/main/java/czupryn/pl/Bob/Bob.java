package czupryn.pl.Bob;

import edu.cmu.sphinx.api.Configuration;

public class Bob {

    public void startBob() {
        Configuration config = new Configuration();
        config.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
        config.setDictionaryPath("");
        config.setLanguageModelPath("");

    }

    public void introductionOfBob() {
        System.out.println("Witaj jestem B.O.B - Bardzo Okrutny Bydgoszczanin!");
    }
}
