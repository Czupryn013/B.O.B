package czupryn.pl.Bob.modules;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Play {
    public void bobPLayMusic() throws IOException {
        Runtime.getRuntime().exec("cmd.exe /c start chrome www.youtube.com/" +
                "playlist?list=PLFfBRrg7B3ACrxzSqtEgRM4h115jHGmi4");
    }
    public void bobPlaySabaton() throws IOException {
        Runtime.getRuntime().exec("cmd.exe /c start chrome www.youtube.com/" +
                "watch?v=FvHQ2UxwoEk&list=PLFfBRrg7B3ACrxzSqtEgRM4h115jHGmi4&index=7");
    }
    public void bobBydgoszcz() throws IOException {
        Runtime.getRuntime().exec("cmd.exe /c start chrome www.youtube.com/channel/" +
                "UCN4gObcIL3MKzAoe6INB93Q");
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
    public void bobLaugh() {
        File file = new File("src/main/resources/voice/jp2_hehehe.wav");
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
            e.printStackTrace();
        }
    }
    public void bobNo() {
        File file = new File("src/main/resources/voice/jp2_nie.wav");
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
            e.printStackTrace();
        }
    }
    public void bobEnough() {
        File file = new File("src/main/resources/voice/jp2_dosc.wav");
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
            e.printStackTrace();
        }
    }
    public void bobSingsSuperIdol() {
        File file = new File("src/main/resources/voice/super_idol_.wav");
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
