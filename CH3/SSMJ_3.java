//import java.util.Scanner;
//
//public class SSMJ_3 {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("정수를 입력>>");
//        int num = sc.nextInt();
//
//        while(num > 0)
//        {
//            for (int i = num; i > 0; i--) {
//                System.out.print("*");
//            }
//            num--;
//            System.out.println("");
//        }
//    }
//}

import java.util.Scanner;

public class SSMJ_3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력>>");
        int num = sc.nextInt();

        for (int a=num; a>0; a--)
        {
            for (int i = a; i > 0; i--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
