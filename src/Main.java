import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        WAP to find the sum of two numbers.
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number:");
        int number1 = scanner.nextInt();
        System.out.println("enter the 2nd number:");
        int number2 = scanner.nextInt();
        int sum = number1 + number2;
        System.out.println("the sum is: " + sum);

//        WAP to calculate the area of a circle.
        System.out.println("enter the radius");
        int radius = scanner.nextInt();
        System.out.println(3.14*radius*radius);

        //        WAP to find SI
                System.out.print("Enter the principal amount: ");
                double principal = scanner.nextDouble();
                System.out.print("Enter the rate of interest: ");
                double rate = scanner.nextDouble();
                System.out.print("Enter the time period in years: ");
                double time = scanner.nextDouble();
                double simpleInterest = (principal * rate * time) / 100;
                System.out.println("The Simple Interest is: " + simpleInterest);
        //    WAP to check if the ni is odd or even
                System.out.print("Enter a number: ");
                int number = scanner.nextInt();
                if (number % 2 == 0) {
                    System.out.println("The number is even.");
                } else {
                    System.out.println("The number is odd.");
                }
                scanner.close();
    }

        }

//    float and double difference


