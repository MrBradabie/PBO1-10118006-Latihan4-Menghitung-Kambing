/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118006.latihan4.menghitung.kambing;

/**
 *
 * @author 
 * NAMA  : Alfarizi Rizki Pane
 * KELAS : PBO1
 * NIM   : 10118006
 * Deskripsi Program : Program ini berisi  program untuk menghitung kambing
 */
public class Kambing {

    public void tambahKambing(){
        //Deklarasi variabel lokal
        int jumlahKambing = 1;
        
    jumlahKambing = jumlahKambing + 5;    
    System.out.println("Jumlah kambing setelah ditambah: " +jumlahKambing);
}    
    public static void main(String[] args) {
        // TODO code application logic here
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();
    }
    
}
