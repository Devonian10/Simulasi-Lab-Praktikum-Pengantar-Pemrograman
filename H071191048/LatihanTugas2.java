import java.util.Scanner;
public class LatihanTugas2 {
    public static void main(String [] args) {
    System.out.println("Devon");
    Scanner input = new Scanner(System.in);
    System.out.print("N=");
    int N = input.nextInt();
    int sum = 0;
    System.out.printf("jumlah semua faktor dari %s = ", N);
    for (int i = 1; i <= N;i++){
    if (N % i == 0){
    sum = sum +i;


    }    
    }System.out.println(sum);
    }
}