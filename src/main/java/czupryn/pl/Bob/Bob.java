package czupryn.pl.Bob;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;

import java.io.IOException;

public class Bob {

    public void startBob() {
        Configuration config = new Configuration();
        config.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
        config.setDictionaryPath("src/main/resources/9357.dic");
        config.setLanguageModelPath("src/main/resources/9357.lm");

        try {
            LiveSpeechRecognizer recognizer = new LiveSpeechRecognizer(config);
            recognizer.startRecognition(false);
            SpeechResult speechResult = null;

            while ((speechResult = recognizer.getResult()) != null) {
                String voiceCommand = speechResult.getHypothesis();
                System.out.println(voiceCommand);

                if (voiceCommand.equalsIgnoreCase("bob open youtube")) {
                    Runtime.getRuntime().exec("cmd.exe /c start chrome www.youtube.com");
                }
                else if (voiceCommand.equalsIgnoreCase("bob close youtube")) {
                    Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM chrome.exe");
                }
                else if (voiceCommand.equalsIgnoreCase("bob open chrome")) {
                    Runtime.getRuntime().exec("cmd.exe /c start chrome");
                }
                else if (voiceCommand.equalsIgnoreCase("bob close chrome")) {
                    Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM chrome.exe");
                }
                else if (voiceCommand.equalsIgnoreCase("bob open steam")) {
                    Runtime.getRuntime().exec("cmd.exe /c start steam://open/console");
                }
                else if (voiceCommand.equalsIgnoreCase("bob close steam")) {
                    Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM steam.exe");
                }
                else if (voiceCommand.equalsIgnoreCase("bob play music")) {
                    Runtime.getRuntime().exec("cmd.exe /c start chrome www.youtube.com/" +
                            "watch?v=9TjXanLjpTU&list=PLFfBRrg7B3ACrxzSqtEgRM4h115jHGmi4&index=1");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void introductionOfBob() {
        System.out.println("Witaj jestem B.O.B - Bardzo Okrutny Bydgoszczanin!");
    }
}
