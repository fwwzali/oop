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
public class MainSong {
    public static void main (String[] args){
        //song 1
        Song s1=new Song();
        s1.setName("Roar");
        s1.setArtist("Katy Perry");
        s1.setDuration(300);
        s1.cetakLagu();
        
        //song 2
        Song s2=new Song();
        s2.setName("Yellow");
        s2.setArtist("Coldplay");
        s2.setDuration(400);
        s2.cetakLagu();
        
        //song 3
        Song s3=new Song();
        s3.setName("Crystals");
        s3.setArtist("Of Monster & Men");
        s3.setDuration(370);
        s3.cetakLagu();
        
        System.out.println("Jumlah Musik = "+s3.jumlah);

        
        
        
        
        
        
        
        
        
       MySong balonku = new MySong();
       balonku.setJudulLagu("balonku ada lima");
        System.out.println("Judul Lagu "+ balonku.getJudulLagu());
        
      MySong yellow = new MySong();
       balonku.setJudulLagu("Yellow");
        System.out.println("Judul Lagu "+ balonku.getJudulLagu());
      
        System.out.println(balonku);
        System.out.println(yellow);
        
        //langsung akses dari class
        System.out.println("Jumlah Object "+MySong.getCountObject());
        //akses dari object Balonku
        System.out.println("Jumlah Object "+balonku.getCountObject());
        //akses dari object yellow
        System.out.println("Jumlah Object "+yellow.getCountObject());
        
        
        
        //int jumlah_object = MySong.getCountObject(); 
        //System.out.println(jumlah_object);
        
        //MySong.setArtist("coldplay");

    }
}
