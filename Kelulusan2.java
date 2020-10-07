
import java.util.Scanner;
    public class Kelulusan2 {
        public static void main(String[] args){
            Scanner inp = new Scanner(System.in);
                System.out.print("Masukan nama = ");
                String nama = inp.nextLine();
                    System.out.println("1.Laki Laki");
                    System.out.println("2.Perempuan");
                    System.out.print("Pilih jenis kelamin = ");
                    int kelamin = inp.nextInt();
                    System.out.print("Tinggi = ");
                    int tinggi = inp.nextInt();

            if (kelamin == 1){
                if(tinggi <= 170){
                    System.out.println("Anda gagal");
                } else { 
                    System.out.println("Selamat Anda Lolos");
                       }
            }else{
                if(tinggi >160){
                    System.out.println("Selamat Anda Lolos");
                }else {
                    System.out.println("Anda gagal");
                }
            }
        }
    }
