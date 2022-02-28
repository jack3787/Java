import java.util.Scanner;

public class test12 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("연산>>");
        double a = scanner.nextInt();
        String yunsanja = scanner.next();
        double b = scanner.nextInt();

        //double result = 0;
        if(yunsanja.equals("+")){
            double result = a + b;
            System.out.print(a+yunsanja+b + "의 계산 결과는 " + result);
        }
        else if(yunsanja.equals("-")){
            double result = a - b;
            System.out.print(a+yunsanja+b + "의 계산 결과는 " + result);
        }
        else if(yunsanja.equals("*")){
            double result = a * b;
            System.out.print(a+yunsanja+b + "의 계산 결과는 " + result);
        }
        else if(yunsanja.equals("/")){
            if(b == 0)
                System.out.print("0으로 나눌 수 없습니다.");
            else {
                double result = a / b;
                System.out.print(a + yunsanja + b + "의 계산 결과는 " + result);
            }
        }
        //System.out.println(a+yunsanja+b + "의 계산결과는" + result);
    }
} 
