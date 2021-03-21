import java.util.ArrayList;
import java.util.Objects;

public class Album {

    private String name;
    private ArrayList<Objects> songs;

    public Album(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Objects> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Objects> songs) {
        this.songs = songs;
    }

    public void printTrackLists() {

    }

}
