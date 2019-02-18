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
public class Mahasiswa {
    //deklarasi attribute
    int nmp;
    String nama;
    String jurusan;
    String fakultas;
    
    //deklarasi method
    public void belajar(){
        System.out.println(this.nama+" Sedang Belajar");
    }
    
    public void mengisiKRS(){
        System.out.println(this.nama+" Mengisi KRS semester");
    }
    
    public void kuliah(){
        System.out.println(this.nama+" Sedang Kuliah");
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void getNama(){
        System.out.println("Nama saya adalah "+this.nama);
    }
}
