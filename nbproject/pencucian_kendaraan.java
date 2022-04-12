/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author SalmA Alaika
 */
import java.util.Scanner;
public class pencucian_kendaraan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner masuk=new Scanner(System.in);
    int kendaraan; 
    System.out.println("Selamat Datang di Robotic Carwash");
    System.out.println("Masukkan Jenis Kendaraan");
    System.out.println("1.MOBIL");
    System.out.println("2.MOTOR");
    System.out.println("3.BUS");
    System.out.println("Jenis Kendaraan");
    kendaraan=masuk.nextInt();
    if (kendaraan==1)
        System.out.println("Tarif Cuci Mobil = 50.000"); 
    else if (kendaraan==2)
        System.out.println("Tarif Cuci Motor = 25.000");
    else if (kendaraan==3)
        System.out.println("Tarif Cuci Bus = 60.000"); 
    else 
        System.out.println("MAAF KODE SALAH, SILAHKAN COBA LAGI");
    for (int i=1; i>0; i--)
    {
        for (int j=1; j>0; j++)
        {
    System.out.println("Apakah Anda Sudah Yakin?");
    System.out.println("1. YA");
    System.out.println("2. TIDAK");
    System.out.println("Pilih");
    kendaraan=masuk.nextInt();
    if (kendaraan==1)
        System.out.println("Silahkan Masuk, Selamat Menikmati Pelayanan Kami");
    else if (kendaraan==2)
        System.out.println("Jenis Kendaraan"); 
    kendaraan=masuk.nextInt();
    if (kendaraan==1)
        System.out.println("Tarif Cuci Mobil = 50.000"); 
    else if (kendaraan==2)
        System.out.println("Tarif Cuci Motor = 25.000");
    else if (kendaraan==3)
        System.out.println("Tarif Cuci Bus = 60.000"); 
    else 
        System.out.println("MAAF KODE SALAH, SILAHKAN COBA LAGI");
            }
        }
    }
            
    }
    
