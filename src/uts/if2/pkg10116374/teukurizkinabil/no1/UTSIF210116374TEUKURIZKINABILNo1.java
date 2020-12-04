package uts.if2.pkg10116374.teukurizkinabil.no1;
import java.util.Calendar;
import java.util.Scanner;


/**
 * @author Acromyrmex
 * NAMA                 : TEUKU RIZKI NABIL
 * KELAS                : PBO2
 * NIM                  : 10116374
 * Deskripsi Program    : Program untuk memproses peryataan berdasarkan umur
 *
 */
public class UTSIF210116374TEUKURIZKINABILNo1 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int yearNow = Calendar.getInstance().get(Calendar.YEAR);
        Age age = new Age(yearNow);
        
        System.out.print("Masukkan Tahun Lahir Anda : ");
        age.setYearBirth(scanner.nextInt());
        
        int umur = age.hitungUmur();
        
        System.out.println("\n======Hasil Perhitungan Umur======");
        System.out.println("Tahun lahir anda : " + age.getYearBirth());
        System.out.println("Hari ini tahun : " + age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + umur +" tahun");
        System.out.println("Tandanya kamu " + age.tandanyaKamu(umur));
    }
}