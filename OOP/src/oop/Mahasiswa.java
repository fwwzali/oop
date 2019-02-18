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
public class Mahasiswa {
    
    //deklarasi atribut
    int NPM;
    String nama;
    String jurusan;
    String fakultas;
    
    //deklarasi method
    public void belajar(){
        System.out.println(this.nama + " sedang belajar");
    }
    
    public void kuliah(){
        System.out.println(this.nama + " sedang berkuliah");
    }
    
    public void mengisiKRS(){
        System.out.println(this.nama + " Mengisi KRS semeester genap");
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
   
    
    
}
