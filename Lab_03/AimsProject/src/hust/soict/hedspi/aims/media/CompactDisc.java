package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();

    public String getArtist() {
        return artist;
    }

    public CompactDisc() {
        super();
    }

    public CompactDisc(int length, String director, String artist) {
        super(length, director);
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
}
