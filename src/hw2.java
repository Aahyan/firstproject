import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter amount");
        int amount = sc.nextInt();
        int count = amount/1000;
        if(count>0){
            System.out.println("1000x");
            amount %= 1000;
        }
        count = amount/500;
        if (count>0){
            System.out.println("500x");
            amount %= 500;
        }
        count = amount/100;
        if (count>0){
            System.out.println("100x");
            amount %= 100;
        }
        count = amount/50;
        if (count>0){
            System.out.println("50x");
            amount %= 50;
        }
        count = amount/10;
        if (count>0){
            System.out.println("10x");
            amount %= 10;
        }
        count = amount/5;
        if (count>0){
            System.out.println("5x");
        }
    }
}
