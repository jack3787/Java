import java.util.Scanner;

public class test12_2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("연산>>>>");
        double a = scanner.nextDouble();
        String yunsanja = scanner.next();
        double b = scanner.nextDouble();

        double result = 0;
        switch (yunsanja) {
            case "+":
                result = a + b;
                System.out.print(a+yunsanja+b + "의 계산 결과는 " + result);
                break;
            case "-":
                result = a - b;
                System.out.print(a+yunsanja+b + "의 계산 결과는 " + result);
                break;
            case "*":
                result = a * b;
                System.out.print(a+yunsanja+b + "의 계산 결과는 " + result);
                break;
            case "/":
                if(b == 0)
                    System.out.print("0으로 나눌 수 없습니다.");
                else {
                    result = a / b;
                    System.out.print(a + yunsanja + b + "의 계산 결과는 " + result);
                }
                break;
            default:
                System.out.print("사칙연산이 아닙니다.");
        }
        //System.out.print(a+yunsanja+b + "의 계산 결과는 " + result);

        scanner.close();
    }
}
