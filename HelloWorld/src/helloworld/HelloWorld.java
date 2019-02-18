/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author fawwaz
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    
    public static int get_volume(int sisi){
        return sisi*sisi*sisi;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        //System.out.println("Hello World!");
        //System.out.println("Volume Kubus " + get_volume(2));
        //System.out.println("Belajar Konsep OOP");
        
        Mahasiswa yoga = new Mahasiswa();
        yoga.setNama("Yoga");
        yoga.getNama();
        yoga.kuliah();
        yoga.belajar();
        
        Mahasiswa yahya = new Mahasiswa();
        yahya.setNama("Yahya");
        yahya.getNama();
        yahya.belajar();
        
        Mahasiswa safri = new Mahasiswa();
        yahya.setNama("Safri");
        yahya.getNama();
        yahya.mengisiKRS();
        
    }
    
}
