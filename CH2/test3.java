import java.util.Scanner;

public class test3 {
    public static void main(String args[]) {
        System.out.print("금액을 입력하시오>> ");

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();

        int num2 = num1 % 50000;
        System.out.println("오만원권" + num1 / 50000 + "매");

        int num3 = num2 % 10000;
        System.out.println("만원권" + num2 / 10000 + "매");

        int num4 = num3 % 1000;
        System.out.println(num3 / 1000);

        int num5 = num4 % 500;
        System.out.println(num4 / 500);

        int num6 = num5 % 100;
        System.out.println(num5 / 100);

        int num7 = num6 % 50;
        System.out.println(num6 / 50);

        int num8 = num7 % 10;
        System.out.println(num7 / 10);

        System.out.println(num8);
    }
} 
