import java.util.Scanner;
public class LatihanTugas4 {
    public static void main(String [] args) {
    System.out.println("Devon");
    Scanner input = new Scanner(System.in);    
    int ganjil = 0;
    int genap = 0;
    int positif = 0;
    int negatif = 0;
    System.out.println("input bilangan =");
    for (int i = 0; i < 5;i++){
    int x = input.nextInt();
    if (x % 2 == 0){
        genap++;
    if (x > 0){
        positif++;   
    }else if (x < 0) {
        negatif++;
    } 
    
    }else if (x % 2 != 0){
        ganjil++;
    if (x > 0){
        positif++;
    }else if (x < 0) {
        negatif++;
    }    
    }
    }System.out.println("Bil genap = " + genap);
     System.out.println("Bil ganjil = " + ganjil);
     System.out.println("Bil positif = " + positif);
     System.out.println("Bil negatif = " + negatif);
}
}