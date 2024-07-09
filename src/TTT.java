import java.util.Scanner;

public class TTT {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter any number");
        int n1=scanner.nextInt();
        System.out.println("enter any number");
        int n2=scanner.nextInt();
        System.out.println("enter any number");
        int n3=scanner.nextInt();
        int greatest;
        if (n1 >= n2 && n1 >= n3) {
            greatest = n1;
        } else if (n2 >= n1 && n2 >= n3) {
            greatest = n2;
        } else {
            greatest = n3;
        }
        System.out.println("The greatest number is: " + greatest);
        scanner.close();
    }
}
