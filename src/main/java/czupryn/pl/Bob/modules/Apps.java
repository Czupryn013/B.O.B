package czupryn.pl.Bob.modules;

import java.io.IOException;

public class Apps {
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
    public void bobOpenDC() throws IOException {
        Runtime.getRuntime().exec("cmd.exe /c start C:\\Users\\piotr\\" +
                "AppData\\Local\\Discord\\app-1.0.9003\\Discord.exe");
    }
    public void bobCloseDC() throws IOException {
        Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM Discord.exe");
    }
}
