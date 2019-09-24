import java.util.Scanner;
public class LatihanTugas{
    public static void main(String [] args) {
    System.out.println("Devon");
    Scanner input = new Scanner(System.in);
    int N = input.nextInt();
    System.out.printf("Faktor dari %s = ", N);
    for (int i = 1; i <= N;i++){
    if (N % i == 0){
        System.out.print(i+" ");
    }
    }
    }
}
