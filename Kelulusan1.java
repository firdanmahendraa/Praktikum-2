
import java.util.Scanner;

public class Kelulusan1 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan nama anda = ");
        String nama = inp.nextLine();
        
        System.out.print("Masukkan NIM = ");
        String nim = inp.next();
        
        System.out.print("Masukkan Nilai = ");
        int nilai = inp.nextInt();
        if (nilai > 75){
            System.out.println("Selamat Anda Lulus");
        } else {
            System.out.println("Anda Tidak Lulus");
        }
    }
    
}
