package if1.pkg10119032.latihan38.objectorientedperhitunganlingkaran;
import java.util.Scanner;

/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program : Berisi program untuk menghitung lingkaran 
 * menggunakan konsep pendekatan berbasis objek
 */
public class IF110119032Latihan38ObjectOrientedPerhitunganLingkaran {

    private static String diameter;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        System.out.println("======Perhitungan Lingkaran======");
        System.out.print("Masukan nilai diameter lingkaran : ");
        diameter = input.next();
        while (!(diameter.matches("[0-9]*"))) {
            System.out.println("Nilai Diameter Tidak Sesuai.");
            System.out.println();
            System.out.print("Masukan nilai diameter lingkaran : ");
            diameter = input.next();
        }
      
        Lingkaran objLingkaran = new Lingkaran();
        objLingkaran.cetakHasil(diameter);
        
    }
    
}