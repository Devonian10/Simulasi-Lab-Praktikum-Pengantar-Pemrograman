import java.util.Scanner;
public class LatihanTugas3 {
    public static void main(String [] args) {
    System.out.println("Devon");
    Scanner input = new Scanner(System.in);
    System.out.print("N=");
    int N = input.nextInt();
    int sum = 0;
    System.out.print("Bil ganji = ");
    for (int i = 0; i <= N;i++){
    if (i %2 == 1){
        System.out.print(i+ " ");
        sum = sum + 1;

    }    
    }System.out.printf("\nJumlah = %d", sum);
    }
}