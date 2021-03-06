package Playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songList;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songList = new SongList();
    }

    public boolean addSong(String title, double duration) {
        if (songList.findSong(title) == null) {
            this.songList.addSong(title, duration);
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        return songList.findSong(title);
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;
        if (index >= 0 && index < songList.size()) {
            playList.add(songList.getSongs().get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playList) {
        Song checkedSong = findSong(title);
        if (checkedSong == null) {
            return false;
        }
        playList.add(checkedSong);
        return true;
    }

    private class SongList {
        private ArrayList<Song> songs;

        public void addSong(String title, double duration) {
            this.songs.add(new Song(title, duration));
        }

        public Song findSong(String title) {
            for (Song checkedSong : songs) {
                if (checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }

        public int size() {
            return songs.size();
        }

        public ArrayList<Song> getSongs() {
            return songs;
        }
    }

}
