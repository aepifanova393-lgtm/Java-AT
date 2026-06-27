package player;

public class Winamp {
    public static void main(String[] args) {
        Playlist p = new Playlist("В качалочку");
        p.addSong("Отпустиииии и забуууудь!");
        p.addSong("Dream On");
        p.addSong("Coming Undone");
        p.deleteSong(0);
        p.updateSong(0,"Ели мясо мужики");
        p.getSong(0);

        System.out.println(p);

    }
}