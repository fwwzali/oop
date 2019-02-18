/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author fawwaz
 */
public class Kubus {
    
    //setting atribute
    int sisi;
    int volume;
    
    static int count_object;
    
    //method kubus
    public void setSisi(int sisi){
        this.sisi = sisi;
        count_object++;
    }
    
    public void computeAndSetVolume(){
        //this.volume = this.sisi*this.sisi*this.sisi;
        int volume_hitung = this.sisi*this.sisi*this.sisi;
        this.volume = volume_hitung;
    }
    
    public int getVolume(){
        return this.volume;
    }
    
    public static int get_object(){
        return count_object;
    }
    
}
