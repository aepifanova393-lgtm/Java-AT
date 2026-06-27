package player;

import java.util.ArrayList;

public class Playlist {
    private String playlistName;
    private ArrayList<String> songs = new ArrayList<>();

    //методы и конструкторы
    public Playlist(String playlistName){
        this.playlistName = playlistName;
    }

    public void addSong(String song) {
        songs.add(song);
        System.out.println("Добавлена песня " + song);
    }

    public void deleteSong(int index) {
        String removedSong = songs.remove(index);
        System.out.println("Удалена песня " + removedSong);
    }

    public void updateSong(int index, String song) {
        songs.set(index, song);
        System.out.println("Обновлена песня " + song + " на позиции " + index);

    }
    public void getSong(int index) {
        String song = songs.get(index);
        System.out.println("Получена песня " + song);
    }

    @Override
    public String toString() {
        return "Playlist \n" +
                "name: " + playlistName + "\n" +
                "songs: " + songs;
    }

}