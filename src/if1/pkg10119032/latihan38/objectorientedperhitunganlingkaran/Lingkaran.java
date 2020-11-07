package if1.pkg10119032.latihan38.objectorientedperhitunganlingkaran;

/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program : Berisi class Lingkaran.
 */
public class Lingkaran {
    private final double PHI = 3.141591;
    private String diameter;
    
    private void setDiameter(String diameter) {
        this.diameter = diameter;
    }
    
    private double hitungJariJari(String diameter) {
        return Double.parseDouble(diameter) / 2;
    }
    
    private double hitungLuas(String diameter) {
        return PHI * Math.pow(hitungJariJari(diameter), 2);
    }
    
    private double hitungKeliling(String diameter) {
        return PHI * Double.parseDouble(diameter);
    }
    
    public void cetakHasil(String diameter) {
        System.out.println("\n===Hasil Perhitungan Lingkaran===");
        System.out.printf("Jari-jari Lingkaran\t= %.0f cm %n",hitungJariJari(diameter));
        System.out.printf("Luas Lingkaran\t\t= %.2f cm %n", hitungLuas(diameter));
        System.out.printf("Keliling Lingkaran\t= %.2f cm %n", hitungKeliling(diameter));
        System.out.println("(Developed by : Ginanjar Tubagus Gumilar)");
    }
}