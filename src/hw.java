import java.util.Scanner;

public class hw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter amount:");
        int amount = sc.nextInt();
        int count = amount / 1000;
        if (count > 0){
            System.out.println("1000x");
            amount = amount / 1000;
        }
        count = amount / 500;
        if (count > 0){
            System.out.println("500x");
            amount = amount / 500;
        }
        count = amount / 100;
        if (count > 0){
            System.out.println("100x");
            amount = amount / 100;
        }
        count = amount / 50;
        if (count > 0){
            System.out.println("50x");
            amount = amount / 50;
        }
        count = amount / 20;
        if (count > 0){
            System.out.println("20x");
            amount = amount / 20;
        }
        count = amount / 10;
        if (count > 0){
            System.out.println("10x");
            amount = amount / 10;
        }
        count = amount / 5;
        if (count > 0){
            System.out.println("5x");
            amount = amount / 5;
        }
    }
}