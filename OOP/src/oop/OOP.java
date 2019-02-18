/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author fawwaz
 */
public class OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Program Java Pertama");
        
        Mahasiswa aninda = new Mahasiswa();
        aninda.setNama("Aninda");
        aninda.belajar();
        aninda.kuliah();
        
        Mahasiswa jeffry = new Mahasiswa();
        jeffry.setNama("Jeffry");
        jeffry.mengisiKRS();
        
        System.out.println(aninda);
        
        
    }
    
}
