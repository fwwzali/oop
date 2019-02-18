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
public class Song {
   private String name;
   private String artist;
   private int duration;
   
   public static int jumlah = 0;

   public void setName(String s){
      name=s;
      jumlah++;
   }
   public void setArtist(String a){
      artist=a;
   }
   public void setDuration(int d){
      duration=d;
   }
   public String getName(){
      return this.name;
   }
   public String getArtist(){
      return this.artist;
   }
   public int getDuration(){
      return this.duration;
   }
   public void cetakLagu(){
      System.out.println("Song: "+getName()+"--"+getArtist()+"("+getDuration()+" seconds)");
   }
}
