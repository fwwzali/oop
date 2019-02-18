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
public class ShapeMain {
    
    public static void main(String[] args){
        
        Kubus kubusku = new Kubus();
        kubusku.setSisi(2);
        kubusku.computeAndSetVolume();
        System.out.println("Volume Kubus = "+kubusku.getVolume());
        kubusku.setSisi(8);
        kubusku.computeAndSetVolume();
        System.out.println("Volume Kubus = "+kubusku.getVolume());
        System.out.println(kubusku);
        
        Kubus kubusmu = new Kubus();
        System.out.println(kubusmu);
        
        Kubus kubusKita = new Kubus();
        kubusku.setSisi(9);
        
        System.out.println("Jumlah object = "+Kubus.get_object());
        
        
        
        
    }
}
