/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119010.latihan21.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author Maulana Imam Malik
 * NAMA     : Maulana Imam Malik
 * KELAS    : IF1
 * NIM      : 10119010
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 *                     rata rata nilai mahasiswa
 */
public class IF110119010Latihan21ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    
 public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int i, jumlahMhs;
        float jumlah, nilaiMhs, ratarata;
        System.out.print ("Masukkan Banyaknya Mahasiswa : ");
        jumlahMhs = scanner.nextInt();
        jumlah = 0;
        i=1;
        while (i <= jumlahMhs){
                System.out.print ("Nilai Mahasiswa ke-"+i+": ");
                nilaiMhs = scanner.nextFloat ();
                jumlah += nilaiMhs;
                i++;
        }
        ratarata = jumlah / jumlahMhs;
        System.out.println("\nMaka, Rata-rata Nilainya adalah: "+ratarata);
   }
    
}
