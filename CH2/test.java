import java.util.Scanner;

//public class TernaryOperator {
//    public static int minus(int n, int m){
//        System.out.println("두 수의 차는 " + ((n>m)?(n-m):(m-n)));
//    }
//}

//public class test {
//    public static int minus(int n, int m) {
//        System.out.println("두 수의 차는 " + ((n > m) ? (n - m) : (m - n)));
//
//        return ((n > m) ? (n - m) : (m - n));
//    }
//
//
//    public static void main(String[] args){
//        int S;
//        S = minus(3,5);
//        //int s = TernaryOperator.minus(3,5);
//    }
//
//}

public class test {
    public static void main(String[] args) {
        System.out.println("입력: ");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        System.out.println("이름은 " + name + ", ");

        int age = scanner.nextInt();
        System.out.print("나이는 " + age + "살, ");

        boolean isSingle = scanner.nextBoolean();
        System.out.println("독신 여부는 " + isSingle + "입니다.");

        scanner.close();
    }
}