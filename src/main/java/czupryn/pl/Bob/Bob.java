package czupryn.pl.Bob;

import czupryn.pl.Bob.modules.Apps;
import czupryn.pl.Bob.modules.Jokes;
import czupryn.pl.Bob.modules.Play;
import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Bob {

    public void startBob() {
        Configuration config = new Configuration();
        config.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
        config.setDictionaryPath("src/main/resources/9357.dic");
        config.setLanguageModelPath("src/main/resources/9357.lm");
        Play play = new Play();
        Apps apps = new Apps();
        Jokes jokes = new Jokes();

        try {
            LiveSpeechRecognizer recognizer = new LiveSpeechRecognizer(config);
            recognizer.startRecognition(false);
            SpeechResult speechResult = null;

            while ((speechResult = recognizer.getResult()) != null) {
                String vCommand = speechResult.getHypothesis();
                System.out.println(vCommand);

                if (vCommand.equals("BOB OPEN YOUTUBE")) {
                    apps.bobOpenYT();
                }
                else if (vCommand.equals("BOB CLOSE YOUTUBE")) {
                    apps.bobCloseYT();
                }
                else if (vCommand.equals("BOB OPEN INTERNET") || vCommand.equals("OPEN INTERNET")) {
                    apps.bobOpenInternet();
                }
                else if (vCommand.equals("BOB OPEN NEW TAB") || vCommand.equals("OPEN NEW TAB")) {
                    apps.bobOpenNewTab();
                }
                else if (vCommand.equals("BOB CLOSE INTERNET")) {
                    apps.bobCloseInternet();
                }
                else if (vCommand.equals("BOB OPEN STEAM") || vCommand.equals("OPEN STEAM")) {
                    apps.bobOpenSteam();
                }
                else if (vCommand.equals("BOB CLOSE STEAM")) {
                    apps.bobCloseSteam();
                }
                else if (vCommand.equals("BOB OPEN TEAMS")) {
                    apps.bobOpenTeams();
                }
                else if (vCommand.equals("BOB OPEN DC") || vCommand.equals("OPEN DC")) {
                    apps.bobOpenDC();
                }
                else if (vCommand.equals("BOB CLOSE DC")) {
                    apps.bobCloseDC();
                }
                else if (vCommand.equals("BOB PLAY MUSIC") || vCommand.equals("BOB OPEN MUSIC")) {
                    play.bobPLayMusic();
                }
                else if (vCommand.equals("BOB PLAY SABATON") || vCommand.equals("BOB OPEN SABATON")) {
                    play.bobPlaySabaton();
                }
                else if (vCommand.equals("BOB SAY BYDGOSZCZ") || vCommand.equals("SAY BYDGOSZCZ")) {
                    play.bobBydgoszcz();
                }
                else if (vCommand.equals("BOB PRANK")) {
                    play.bobRickRoll();
                }
                else if (vCommand.equals("BOB PLAY LAUGH") || vCommand.equals("PLAY LAUGH")) {
                    play.bobLaugh();
                }
                else if (vCommand.equals("BOB PLAY NO") || vCommand.equals("PLAY NO")) {
                    play.bobNo();
                }
                else if (vCommand.equals("BOB PLAY ENOUGH") || vCommand.equals("PLAY ENOUGH")) {
                    play.bobEnough();
                }
                else if (vCommand.equals("BOB PLAY SUPER IDOL") || vCommand.equals("BOB OPEN SUPER IDOL")) {
                    play.bobSingsSuperIdol();
                }
                else if (vCommand.equals("BOB INTRODUCE YOURSELF") || vCommand.equals("BOB WHO ARE YOU") ||
                        vCommand.equals("INTRODUCE YOURSELF") || vCommand.equals("WHO ARE YOU")) {
                        introductionOfBob();
                }
                else if (vCommand.equals("BOB OPEN RANDOM JOKE") || vCommand.equals("BOB PLAY RANDOM JOKE") ||
                        vCommand.equals("PLAY RANDOM JOKE") || vCommand.equals("OPEN RANDOM JOKE") ||
                        vCommand.equals("SAY RANDOM JOKE") || vCommand.equals("BOB SAY RANDOM JOKE")) {
                    jokes.tellRandomJoke();
                }
                else if (vCommand.equals("BOB STOP") || vCommand.equals("STOP")) {
                    System.exit(0);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void introductionOfBob() {
        File file = new File("src/main/resources/voice/kim_jest_bob.wav");
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
            e.printStackTrace();
        }
    }
}
