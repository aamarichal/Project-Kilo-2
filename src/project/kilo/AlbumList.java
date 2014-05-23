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
public class AlbumList {
    private ArrayList albums;
    
    /**
     * constructor
     */
    public AlbumList(){
        albums = new ArrayList();
    }
    
    /**
     * 
     * @param a Album object to add to albums list
     */
    public void addAlbum(Album a){
        albums.add(a);
    }
    
    /**
     * adds songs to the proper album in the list. If an album is not found
     * which matches the song's album title and artist, it creates a new
     * album in the list with this data.
     * 
     * @param s Song object to be added to an album in the list
     */
    public void addListSong(Song s){
        if(!albums.isEmpty()){
            //search list for album matching song's data
            boolean flag = false;
            for(int i=0; i<albums.size(); i++){
                if(getAlbum(i).getAlbumTitle().equals(s.getAlbum()) &&
                        getAlbum(i).getAlbumArtist().equals(s.getArtist())){
                    getAlbum(i).addSong(s);
                    flag = true;
                    break;
                }
            }
            //if a matching album isn't found, create new Album object for it
            if (flag == false){
                addAlbum(new Album(s));
            }
        }
        //if albums list is empty, create new album for song
        else addAlbum(new Album(s));
    }
    
    /**
     * 
     * @param i index of album to return 
     * @return album at index i
     */
    public Album getAlbum(int i){
        return (Album) albums.get(i);
    }
    
    /**
     * 
     * @return number of albums in list
     */
    public int getNumberAlbums(){
        return albums.size();
    }
    
    /**
     * 
     * @return true if albums list is empty, otherwise false
     */
    public Boolean isListEmpty(){
        return albums.isEmpty();
    }
    
    
}