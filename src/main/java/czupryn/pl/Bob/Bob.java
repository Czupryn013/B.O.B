package czupryn.pl.Bob;

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

        try {
            LiveSpeechRecognizer recognizer = new LiveSpeechRecognizer(config);
            recognizer.startRecognition(false);
            SpeechResult speechResult = null;

            while ((speechResult = recognizer.getResult()) != null) {
                String vCommand = speechResult.getHypothesis();
                System.out.println(vCommand);

                if (vCommand.equalsIgnoreCase("bob open youtube")) {
                    bobOpenYT();
                }
                else if (vCommand.equalsIgnoreCase("bob close youtube")) {
                    bobCloseYT();
                }
                else if (vCommand.equalsIgnoreCase("bob open internet")) {
                    bobOpenInternet();
                }
                else if (vCommand.equalsIgnoreCase("bob open new tab")) {
                    bobOpenNewTab();
                }
                else if (vCommand.equalsIgnoreCase("bob close internet")) {
                    bobCloseInternet();
                }
                else if (vCommand.equalsIgnoreCase("bob open steam")) {
                    bobOpenSteam();
                }
                else if (vCommand.equalsIgnoreCase("bob close steam")) {
                    bobCloseSteam();
                }
                else if (vCommand.equalsIgnoreCase("bob open teams")) {
                    bobOpenTeams();
                }
                else if (vCommand.equals("BOB PLAY MUSIC") || vCommand.equals("BOB OPEN MUSIC")) {
                    Runtime.getRuntime().exec("cmd.exe /c start chrome www.youtube.com/" +
                            "playlist?list=PLFfBRrg7B3ACrxzSqtEgRM4h115jHGmi4");
                }
                else if (vCommand.equals("BOB PLAY SABATON") || vCommand.equals("BOB OPEN SABATON")) {
                    Runtime.getRuntime().exec("cmd.exe /c start chrome www.youtube.com/" +
                            "watch?v=FvHQ2UxwoEk&list=PLFfBRrg7B3ACrxzSqtEgRM4h115jHGmi4&index=7");
                }
                else if (vCommand.equalsIgnoreCase("bob open DC")) {
                    Runtime.getRuntime().exec("cmd.exe /c start C:\\Users\\piotr\\" +
                            "AppData\\Local\\Discord\\app-1.0.9003\\Discord.exe");
                }
                else if (vCommand.equalsIgnoreCase("bob close DC")) {
                    Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM Discord.exe");
                }
                else if (vCommand.equalsIgnoreCase("bob say Bydgoszcz")) {
                    Runtime.getRuntime().exec("cmd.exe /c start chrome www.youtube.com/channel/" +
                            "UCN4gObcIL3MKzAoe6INB93Q");
                }
                else if (vCommand.equalsIgnoreCase("bob prank")) {
                    bobRickRoll();
                }
                else if (vCommand.equalsIgnoreCase("bob play laugh")) {
                    File file = new File("src/main/resources/voice/jp2_hehehe.wav");
                    try {
                        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
                        Clip clip = AudioSystem.getClip();
                        clip.open(audioInputStream);
                        clip.start();
                    } catch (UnsupportedAudioFileException | LineUnavailableException e) {
                        e.printStackTrace();
                    }

                }
                else if (vCommand.equalsIgnoreCase("bob play no")) {
                    File file = new File("src/main/resources/voice/jp2_nie.wav");
                    try {
                        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
                        Clip clip = AudioSystem.getClip();
                        clip.open(audioInputStream);
                        clip.start();
                    } catch (UnsupportedAudioFileException | LineUnavailableException e) {
                        e.printStackTrace();
                    }

                }
                else if (vCommand.equalsIgnoreCase("bob play enough")) {
                    File file = new File("src/main/resources/voice/jp2_dosc.wav");
                    try {
                        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
                        Clip clip = AudioSystem.getClip();
                        clip.open(audioInputStream);
                        clip.start();
                    } catch (UnsupportedAudioFileException | LineUnavailableException e) {
                        e.printStackTrace();
                    }

                }
                else if (vCommand.equals("BOB PLAY SUPER IDOL") || vCommand.equals("BOB OPEN SUPER IDOL")) {
                    File file = new File("src/main/resources/voice/super_idol_.wav");
                    try {
                        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
                        Clip clip = AudioSystem.getClip();
                        clip.open(audioInputStream);
                        clip.start();
                    } catch (UnsupportedAudioFileException | LineUnavailableException e) {
                        e.printStackTrace();
                    }

                }
                else if (vCommand.equalsIgnoreCase("bob introduce yourself")) {
                        introductionOfBob();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void bobOpenYT() throws IOException {
        Runtime.getRuntime().exec("cmd.exe /c start chrome www.youtube.com");
    }
    public void bobCloseYT() throws IOException {
        Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM chrome.exe");
    }
    public void bobOpenInternet() throws IOException {
        Runtime.getRuntime().exec("cmd.exe /c start chrome");
    }
    public void bobCloseInternet() throws IOException {
        Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM chrome.exe");
    }
    public void bobOpenNewTab() throws IOException {
        Runtime.getRuntime().exec("cmd.exe /c start chrome www.google.pl");
    }
    public void bobOpenSteam() throws IOException {
        Runtime.getRuntime().exec("cmd.exe /c start steam://open/console");
    }
    public void bobCloseSteam() throws IOException {
        Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM steam.exe");
    }
    public void bobOpenTeams() throws IOException {
        Runtime.getRuntime().exec("cmd.exe /c start chrome teams.microsoft.com/_?culture=pl" +
                "-pl&country=PL&lm=deeplink&lmsrc=homePageWeb&cmpid=WebSignIn#/calendarv2");
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
    public void bobRickRoll() throws IOException {
        Runtime.getRuntime().exec("cmd.exe /c start chrome www.youtube.com/watch?v=iik25wqIuFo");
        File file = new File("src/main/resources/voice/bob_rick_roll_haha.wav");
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
