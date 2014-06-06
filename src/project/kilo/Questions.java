/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project.kilo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import org.farng.mp3.MP3File;
import org.farng.mp3.TagException;

/**
 *
 * @author Alejandro Marichal
 */
public class Questions {
    protected AlbumList userAlbums;
    protected String question;
    protected String RightAnswer;
    protected String WrongAnswer[];
    protected String RandomAnswers[];
    protected int score;
    protected int strikes;
    
    public Questions(AlbumList a){
        userAlbums = a;
        WrongAnswer = new String[3];
        RandomAnswers = new String[4];
        score = 0;
        strikes = 0;
    }
    
    public Questions(){
        userAlbums = new AlbumList();
        WrongAnswer = new String[3];
        RandomAnswers = new String[4];
        score = 0;
        strikes = 0;
    }
    
    public void shuffleAnswers(){
        int i;
        Random rnd = new Random();
        for(i=0; i<3; i++)
            RandomAnswers[i] = WrongAnswer[i];
        RandomAnswers[3] = RightAnswer;        
        for(i=0; i<4; i++){
            int j = rnd.nextInt(4);
            String temp = RandomAnswers[i];
            RandomAnswers[i] = RandomAnswers[j];
            RandomAnswers[j] = temp;
        }            
    }
    
    public void addUserSong(Song s){
        userAlbums.addListSong(s);
    }
    
     public void addSongsFromDirectory(File f) throws IOException, TagException
     {
        String title;
        String album;
        String artist;
        String year;
        File[] names = f.listFiles();
        for(File name : names){
            if(name.getPath().endsWith(".mp3")){
                MP3File m;
                try{
                m = new MP3File(name);
                }
                catch(TagException | FileNotFoundException |UnsupportedOperationException e){
                    continue;
                }
                try{ 
                    title = m.getID3v1Tag().getSongTitle();
                    album = m.getID3v1Tag().getAlbumTitle();
                    artist = m.getID3v1Tag().getArtist();
                    year = m.getID3v1Tag().getYear();
                    if(!title.equals("") && !album.equals("") && !artist.equals("") && !year.equals("")){
                        Song s = new Song(title, album, artist, year);
                        addUserSong(s);
                    }
                }
                catch(NullPointerException e){
                    title = m.getID3v2Tag().getSongTitle();
                    album = m.getID3v2Tag().getAlbumTitle();
                    artist = m.getID3v2Tag().getLeadArtist();
                    year = m.getID3v2Tag().getYearReleased();
                    if(!title.equals("") && !album.equals("") && !artist.equals("") && !year.equals("")){
                        Song s = new Song(title, album, artist, year);
                        addUserSong(s);
                    }
                }
                
                
            }
            if(name.isDirectory())
                addSongsFromDirectory(name);                
        }
    }
    
    public Album getAlbumIndex(int i){
        return userAlbums.getAlbum(i);
    }
    
    public Song getRandomSong(){
        int aIndex = (0+(int)(Math.random()*userAlbums.getNumberAlbums()));
        int sIndex = (0+(int)(Math.random()*userAlbums.getAlbum(aIndex).getNumberSongs()));
        return userAlbums.getAlbum(aIndex).getSong(sIndex);        
    }
    
    public Album getRandomAlbum(){
        int index = (0+(int) (Math.random()*userAlbums.getNumberAlbums()));
        return userAlbums.getAlbum(index);
    }
    
    public void QSongArtist(){ //given a song, pick the correct artist (1)
        Song s = getRandomSong();
        question = "The song " + s.getTitle() + " is by which artist?";
        RightAnswer = s.getArtist();
        boolean same = false;
        for(int i=0; i<3; i++){
            Song w = getRandomSong();
            if(i>0){
                for(int j=i; j>-1; j--){
                    if(w.getArtist().equals(WrongAnswer[j])) same = true;
                }
            }
            while(w.getArtist().equals(RightAnswer) || w.getTitle().equals(s.getTitle()) || same == true){
                w = getRandomSong();
                same = false;
                if(i>0){
                    for(int j=i; j>-1; j--){
                        if(w.getArtist().equals(WrongAnswer[j])) same = true;
                    }
            }
            }
            WrongAnswer[i] = w.getArtist();
            
        }   
    }
    
    public void QSongAlbum() //Random song is from what album? (2)
    {
        Song s = getRandomSong();
        question = "The song " + s.getTitle()+ " by " + s.getArtist() +" is from which album?";
        RightAnswer = s.getAlbum();
        boolean same = false;
        for(int i=0; i<3; i++){
            Song w = getRandomSong();
            if(i>0){
                for(int j=i; j>-1; j--){
                    if(w.getAlbum().equals(WrongAnswer[j])) same = true;
                }
            }
            while(w.getAlbum().equals(RightAnswer) || w.getTitle().equals(s.getTitle()) || same == true){
                w = getRandomSong();
                same = false;
                if(i>0){
                    for(int j=i; j>-1; j--){
                        if(w.getAlbum().equals(WrongAnswer[j])) same = true;
                    }
            }
            }
            WrongAnswer[i] = w.getAlbum();
    }
    }
    
    public void QSongYear() // Song is from what year? 3 
    {
        Song s = getRandomSong();
        question = "The song " + s.getTitle() + " by " + s.getArtist() + " is from what year?";
        RightAnswer = s.getYear();
        boolean same = false;
        for(int i=0; i<3; i++){
            Song w = getRandomSong();
            if(i>0){
                for(int j=i; j>-1; j--){
                    if(w.getYear().equals(WrongAnswer[j])) same = true;
                }
            }
            while(w.getYear().equals(RightAnswer) || same == true){
                w = getRandomSong();
                same = false;
                if(i>0){
                    for(int j=i; j>-1; j--){
                        if(w.getYear().equals(WrongAnswer[j])) same = true;
                    }
            }
            }
            WrongAnswer[i] = w.getYear();
            
        }   
    }
    
    public void QAlbumSong() //Given an Album, pick a song from it 4
    {
        Song s = getRandomSong();
        question = "The album " + s.getAlbum() + " by " + s.getArtist() + " contains which song?";
        RightAnswer = s.getTitle();
        boolean same = false;
        for(int i=0; i<3; i++){
            Song w = getRandomSong();
            if(i>0){
                for(int j=i; j>-1; j--){
                    if(w.getTitle().equals(WrongAnswer[j])) same = true;
                }
            }
            while(w.getTitle().equals(RightAnswer) || same == true){
                w = getRandomSong();
                same = false;
                if(i>0){
                    for(int j=i; j>-1; j--){
                        if(w.getTitle().equals(WrongAnswer[j])) same = true;
                    }
            }
            }
            WrongAnswer[i] = w.getTitle();
    }
    }
    
    public void QAlbumArtist() // Given an album, pick the right artist 5
    {
        Song s = getRandomSong();
        question = "The album " + s.getAlbum() + " is by which artist?";
        RightAnswer = s.getArtist();
        boolean same = false;
        for(int i=0; i<3; i++){
            Song w = getRandomSong();
            if(i>0){
                for(int j=i; j>-1; j--){
                    if(w.getArtist().equals(WrongAnswer[j])) same = true;
                }
            }
            while(w.getArtist().equals(RightAnswer) || w.getAlbum().equals(s.getAlbum()) || same == true){
                w = getRandomSong();
                same = false;
                if(i>0){
                    for(int j=i; j>-1; j--){
                        if(w.getArtist().equals(WrongAnswer[j])) same = true;
                    }
            }
            }
            WrongAnswer[i] = w.getArtist();
    }
    
    }
    
    public void QAlbumYear() // given an album, pick the right year 6
    {
        Song s = getRandomSong();
        question = "The album " + s.getAlbum() + " is from what year?";
        RightAnswer = s.getYear();
        boolean same = false;
        for(int i=0; i<3; i++){
            Song w = getRandomSong();
            if(i>0){
                for(int j=i; j>-1; j--){
                    if(w.getYear().equals(WrongAnswer[j])) same = true;
                }
            }
            while(w.getYear().equals(RightAnswer) || same == true){
                w = getRandomSong();
                same = false;
                if(i>0){
                    for(int j=i; j>-1; j--){
                        if(w.getYear().equals(WrongAnswer[j])) same = true;
                    }
            }
            }
            WrongAnswer[i] = w.getYear();
            
        }   
    }
    
    public void QArtistSong() // given an artist, pick one of their songs 7
    {
        Song s = getRandomSong();
        question = "The artist " + s.getArtist() + " created which song?";
        RightAnswer = s.getTitle();
        boolean same = false;
        for(int i=0; i<3; i++){
            Song w = getRandomSong();
            if(i>0){
                for(int j=i; j>-1; j--){
                    if(w.getTitle().equals(WrongAnswer[j])) same = true;
                }
            }
            while(w.getTitle().equals(RightAnswer) ||w.getArtist().equals(s.getArtist()) || same == true){ 
                w = getRandomSong();
                same = false;
                if(i>0){
                    for(int j=i; j>-1; j--){
                        if(w.getTitle().equals(WrongAnswer[j])) same = true;
                    }
            }
            }
            WrongAnswer[i] = w.getTitle();
    }
    
    }
    
    public void QArtistAlbum() // given an artist, pick one of their albums 8
    {
        Song s = getRandomSong();
        question = "The artist " + s.getArtist() + " created which album?";
        RightAnswer = s.getAlbum();
        boolean same = false;
        for(int i=0; i<3; i++){
            Song w = getRandomSong();
            if(i>0){
                for(int j=i; j>-1; j--){
                    if(w.getAlbum().equals(WrongAnswer[j])) same = true;
                }
            }
            while(w.getArtist().equals(s.getArtist()) || same == true){
                w = getRandomSong();
                same = false;
                if(i>0){
                    for(int j=i; j>-1; j--){
                        if(w.getAlbum().equals(WrongAnswer[j])) same = true;
                    }
            }
            }
            WrongAnswer[i] = w.getAlbum();
    }
    
    }
    
    public void QYearSong() // given a year, pick a song from it 9
    {
          Song s = getRandomSong();
        question = "Which song was created in the year " + s.getYear() + "?";
        RightAnswer = s.getTitle();
        boolean same = false;
        for(int i=0; i<3; i++){
            Song w = getRandomSong();
            if(i>0){
                for(int j=i; j>-1; j--){
                    if(w.getTitle().equals(WrongAnswer[j])) same = true;
                }
            }
            while(w.getTitle().equals(RightAnswer) ||same == true){
                w = getRandomSong();
                same = false;
                if(i>0){
                    for(int j=i; j>-1; j--){
                        if(w.getTitle().equals(WrongAnswer[j])) same = true;
                    }
            }
            }
            WrongAnswer[i] = w.getTitle();
    }
    }
    
    public void QYearAlbum() // given a year, pick an album from it 10/else
    {
        Song s = getRandomSong();
        question = "Which album was created in the year " + s.getYear() + "?";
        RightAnswer = s.getAlbum();
        boolean same = false;
        for(int i=0; i<3; i++){
            Song w = getRandomSong();
            if(i>0){
                for(int j=i; j>-1; j--){
                    if(w.getAlbum().equals(WrongAnswer[j])) same = true;
                }
            }
            while(w.getAlbum().equals(RightAnswer) || same == true){
                w = getRandomSong();
                same = false;
                if(i>0){
                    for(int j=i; j>-1; j--){
                        if(w.getAlbum().equals(WrongAnswer[j])) same = true;
                    }
            }
            }
            WrongAnswer[i] = w.getAlbum();
    }
    }
    
    public int getQNumber(){
        int QNumber = (1+(int)(Math.random()*10));
        return QNumber;
    }
    
    public void askQuestion(){
        int qN = getQNumber();
        if (qN == 1)
            QSongArtist();
        else if (qN == 2)
            QSongAlbum();
        else if (qN == 3)
            QSongYear();
        else if (qN == 4)
            QAlbumSong();
        else if (qN == 5)
            QAlbumArtist();
        else if (qN == 6)
            QAlbumYear();
        else if (qN == 7) 
            QArtistSong();
        else if (qN == 8)
            QArtistAlbum();
        else if (qN == 9)
            QYearSong();
        else
            QYearAlbum();
        shuffleAnswers();
    }
}