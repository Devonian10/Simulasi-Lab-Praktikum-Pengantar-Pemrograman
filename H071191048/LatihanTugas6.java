import java.util.Scanner;
class LatihanTugas6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int z = 1;
        for (int i = 1; i <= y; i++){
            z = z * x;
        }
        System.out.println(z);

    }
}