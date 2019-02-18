/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package songs;

/**
 *
 * @author fawwaz
 */
public class MySong {
    
    public static int countObject;
    
    String judulLagu;
    String artist;
    
    
    
    //method setter
    public void setJudulLagu(String laguDua){
        this.judulLagu = laguDua;
        countObject++;
    }
    
    public void setArtist(String artist){
        this.artist = artist;
    }
    
    //method getter
    public String getJudulLagu(){
        return this.judulLagu;
    }
    
    public String getArtist(){
        return this.artist;
    }
    
    public static int getCountObject(){
        return countObject;
    }
    
    
}
