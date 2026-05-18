package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();

    public String getArtist() {
        return artist;
    }

    public CompactDisc(String title) {
        super(title);
    }

    public CompactDisc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public CompactDisc(String title, String category, String director, float cost) {
        super(title, category, director, cost);
    }

    public CompactDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
    }

    public CompactDisc(String title, String category, String director, int length, float cost, String artist) {
        super(title, category, director, length, cost);
        this.artist = artist;
    }

    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
            System.out.println("Track " + track.getTitle() + " has been added to CD.");
        } else {
            System.out.println("Track " + track.getTitle() + " is already in the CD.");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track " + track.getTitle() + " has been removed from CD.");
        } else {
            System.out.println("Track " + track.getTitle() + " is not in the CD.");
        }
    }

    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    public void play() {
        System.out.println("Playing CD (Artist: " + this.getArtist() + ")");
        System.out.println("CD total length: " + this.getLength());
        for (Track track : tracks) {
            track.play();
        }
    }

    @Override
    public String toString() {
        return "CD - [" + getTitle() + "] - [" + getCategory() + "] - [" + getDirector() + "] - [" + artist + "] - [" + getLength() + "]: [" + getCost() + "] $";
    }
}
