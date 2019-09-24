import java.util.Scanner;
public class LatihanTugas8 {
    public static void main(String[] args) {
        System.out.println("Devon");
        Scanner input = new Scanner(System.in);
        int bilangan = input.nextInt();
        for (int i = 0; i <= 50;i+=5){
            System.out.println(4*bilangan+1);
        }
        for (int i = 1; i <= 10;i+=1){
            System.out.println(((Math.sqrt(bilangan)-1)));
        }
        for (double i = 1; i <= 5;i+=0.5){
            System.out.println((5*Math.pow(bilangan, 2)+(3*bilangan)-2));
        }    
        }

    }
