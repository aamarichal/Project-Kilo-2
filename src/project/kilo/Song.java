/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project.kilo;

/**
 * right now has Strings for title, album, artist, and year.
 * We may need to add a filepath string to send to the media player
 * if we want to play songs
 * 
 * @author Alejandro Marichal
 */
public class Song {
    private final String title;
    private final String album;
    private final String artist;
    private final int year;
    
    /**
     * Constructor class for Song object; this may also need a "filepath" field
     * for media player
     * 
     * @param t song title
     * @param alb title of the album song is in
     * @param art name of the song's artist
     * @param y year song was released
     */
    public Song(String t, String alb, String art, int y){
        title = t;
        album = alb;
        artist = art;
        year = y;    
    }
    
    /**
     * 
     * @return song's title
     */
    public String getTitle(){
        return title;
    }
    
    /**
     * 
     * @return title of album song belongs to
     */
    public String getAlbum(){
        return album;
    }
    
    /**
     * 
     * @return artist of the song
     */
    public String getArtist(){
        return artist;
    }
    
    /**
     * 
     * @return year song was released
     */
    public int getYear(){
        return year;
    }
    
    /**
     * 
     * @return title of the song
     */
    @Override
    public String toString(){
        return title;
    }
    
}