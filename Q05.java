import java.util.Scanner;

public class Q05 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int mid = num / 2;

        for (int i = 0; i < num; i++) {

            if (i < mid) {
                System.out.print((mid - i) + " ");
            } 
            else if (i == mid) {
                System.out.print((i + 1) + " ");
            } 
            else {
                System.out.print((num + (mid-i+1))+ " ");
            }
        }
    }
}
