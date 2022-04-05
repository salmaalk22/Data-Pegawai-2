/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package data.pegawai;

class Pegawai{
    String nama; 
    String NIP;
    String Ttl;
    String Divisi;
}
/**
 *
 * @author SalmA Alaika
 */
public class pkg2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pegawai pgw1 = new Pegawai();
        Pegawai pgw2 = new Pegawai();
        Pegawai pgw3 = new Pegawai();
        
        pgw1.nama = "Kaia Gerber";
        pgw1.NIP = "050422";
        pgw1.Ttl = "Bogor, 2 Juli 1996";
        pgw1.Divisi = "Finance";
        pgw2.nama = "Kendall Jenner";
        pgw2.NIP = "060422";
        pgw2.Ttl = "Jakarta, 14 Februari 1994";
        pgw2.Divisi = "General Affair";
        pgw3.nama = "Fay Khadra";
        pgw3.NIP = "070422";
        pgw3.Ttl = "Bandung, 11 Januari 1990";
        pgw3.Divisi = "Human Resource";
        
        System.out.println("Nama Pegawai: "+ pgw1.nama);
        System.out.println("Nomor Induk Pegawai: "+ pgw1.NIP);
        System.out.println("Tempat, tanggal Lahir: "+ pgw1.Ttl);
        System.out.println("Divisi: "+ pgw1.Divisi);
         System.out.println("Nama Pegawai: "+ pgw2.nama);
        System.out.println("Nomor Induk Pegawai: "+ pgw2.NIP);
        System.out.println("Tempat, tanggal Lahir: "+ pgw2.Ttl);
        System.out.println("Divisi: "+ pgw2.Divisi);
         System.out.println("Nama Pegawai: "+ pgw3.nama);
        System.out.println("Nomor Induk Pegawai: "+ pgw3.NIP);
        System.out.println("Tempat, tanggal Lahir: "+ pgw3.Ttl);
        System.out.println("Divisi: "+ pgw3.Divisi);
    }
    
}
