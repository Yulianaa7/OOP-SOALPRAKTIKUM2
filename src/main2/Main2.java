/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main2;

/**
 *
 * @author Yuliana
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        //membuat objek
        Pohon cemara = new Pohon();
        Pohon kelapa = new Pohon();
        
        //memanggil method
        cemara.setNama();
        kelapa.setTinggi();
        cemara.getNama();
        kelapa.getTinggi();
    }
    
}
