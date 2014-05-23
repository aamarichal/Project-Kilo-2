/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project.kilo;

import java.util.ArrayList;

/**
 *
 * @author Alejandro Marichal
 */
public class Album {
    private final String title;
    private final String artist;
    private ArrayList songs;
    
    public Album(Song s){
        songs = new ArrayList();
        title = s.getAlbum();
        artist = s.getArtist();
        songs.add(s);
    }
    
    /**
     * 
     * @return title of the album
     */
    public String getAlbumTitle(){
        return title;
    }
    
    /**
     * 
     * @return album artist
     */
    public String getAlbumArtist(){
        return artist;
    }
    
    /**
     * 
     * @return title of the album
     */
    @Override
    public String toString(){
        return title;
    }
    
    /**
     * 
     * @param s adds song to album
     */
    public void addSong(Song s){
        songs.add(s);
    }
    
    /**
     * N.B. this does not return the song number as it is listed on the album
     * per se, only the order in which it was added to the album
     * 
     * @param i array index to return
     * @return Song object contained at index i
     */
    public Song getSong(int i){
        return (Song) songs.get(i);
    }
    
    public int getNumberSongs()
    {
        return songs.size();
    }
   
    
    
    
}