/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main2;
import java.util.Scanner;
/**
 *
 * @author Yuliana
 */
public class Pohon {
    //mendefinisikan atribut
    String nama;
    int tinggi;
    
    //membuat Scanner
    Scanner input = new Scanner(System.in);
    
    //method void setNama
    void setNama(){
        //untuk meminta user memasukkan nama
        System.out.print("Masukkan Nama : ");
        nama = input.nextLine();
    }
    //method void setTinggi
    void setTinggi(){
        //untuk meminta user memasukkan tinggi
        System.out.print("Masukkan Tinggi : ");
        tinggi = input.nextInt();
        System.out.println("");
    }
    //method void getNama
    void getNama(){
        //menampilkan hasil output
        System.out.println("Nama Pohon : "+nama);
    }
    //method void getTinggi
    void getTinggi(){
        //menampilkan hasil output
        System.out.println("Tinggi Pohon : "+tinggi);
    }
}
