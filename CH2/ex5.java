import java.util.Scanner;

public class ex5 {
    public static void main(String args[]){

        System.out.print("정수 3개를 입력하시오>>");
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if(((A+B)>C)&&((B+C)>A)&&((C+A)>B))
            System.out.print("삼각형이 됩니다");
        else
            System.out.print("X");
    }
}
