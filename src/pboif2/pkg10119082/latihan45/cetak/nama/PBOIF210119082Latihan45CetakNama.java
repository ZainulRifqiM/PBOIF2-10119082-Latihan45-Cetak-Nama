/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119082.latihan45.cetak.nama;
import java.util.Scanner;
/**
 *
 * @author Zainul Rifqi
 * NAMA     : Zainul Rifqi Muwaffaq
 * KELAS    : IF2
 * NIM      : 10119082
 * Deskripsi: Cetak Nama
 */
public class PBOIF210119082Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Printer printer = new Printer();
        String nama;
        int jmlCetak;
        
        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukkan nama anda : ");
        nama = scanner.nextLine();
        System.out.print("Mau cetak nama berapa kali? : ");
        jmlCetak = scanner.nextInt();
        
        printer.setNama(nama);
        printer.setJmlCetak(jmlCetak);
        printer.cetak(printer.getNama());
        System.out.println("Hasil Cetak :");
        printer.cetak(printer.getJmlCetak(),printer.getNama());
        
    }
    
}
