import java.util.Scanner;

public class AorB {
    public static void main(String[] args) {
        int A, B;
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("A, B를 입력하시오: ");
            A = sc.nextInt();
            B = sc.nextInt();
            sc.close();

            if((-10000>A)||(A>10000)||(-10000>B)||(B>10000))
                    break;
            if (A > B)
                System.out.println(">");
            else if (A < B)
                System.out.println("<");
            else
                System.out.println("==");
        }
    }
}