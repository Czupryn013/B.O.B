package czupryn.pl.Bob.modules;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Jokes {
    public void tellRandomJoke() {
        Random random = new Random();
        int jokeNumber = random.nextInt(8);
        File file = new File("src/main/resources/voice/Jokes/joke_"+ jokeNumber+".wav");
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            System.out.println("Żart numer: " + jokeNumber);
        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
            e.printStackTrace();
        }
    }
}
