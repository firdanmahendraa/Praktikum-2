
import java.util.Scanner;

public class BobotNilaiHuruf {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.print("Masukkah Huruf A-E : ");
        String huruf = kb.nextLine();
    
    switch(huruf){
        case "a":
            System.out.println("4");
        break;
        case "b":
            System.out.println("3");
        break;
        case "c":
            System.out.println("2");
        break;
        case "d":
            System.out.println("1");
        break;
        case "e":
            System.out.println("0");
        break;
    
    }
}
}