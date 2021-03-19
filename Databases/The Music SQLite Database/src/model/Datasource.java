package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Datasource {
    public static final String DB_NAME = "music.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:DB\\" + DB_NAME;

    public static final String TABLE_ALBUMS = "albums";
    public static final String COLUMN_ALBUMS_ID = "_id";
    public static final String COLUMN_ALBUMS_NAME = "name";
    public static final String COLUMN_ALBUMS_ARTIST = "artist";

    public static final String TABLE_ARTISTS = "artists";
    public static final String TABLE_ARTISTS_ID = "_id";
    public static final String TABLE_ARTISTS_NAME = "name";

    public static final String TABLE_SONGS = "songs";
    public static final String COLUMN_ALBUMS_TRACK = "track";
    public static final String COLUMN_ALBUMS_TITLE = "title";
    public static final String COLUMN_ALBUMS_ALBUM = "album";

    private Connection conn;

    public boolean open() {
        try {
            conn = DriverManager.getConnection(CONNECTION_STRING);
            return true;
        } catch (SQLException e) {
            System.out.println("Could not connect to database: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public void close() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println("Could not close connection: " + e.getMessage());
        }
    }
}
