import java.util.Scanner;
public class LatihanTugas7 {
    public static void main(String[] args) {
        // System.out.println("Devon");
        Scanner input = new Scanner(System.in);
        int password = 2103;
        boolean x = false;
        while (x == false) {
            int y = input.nextInt();
            if (y == password) {
                x = true;
                System.out.println("password benar");

            }else {
                System.out.println("password salah");
            } 
        }
    }
}