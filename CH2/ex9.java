import java.util.Scanner;

public class ex9 {
    public static void main(String args[]) {

        System.out.println("원의 중심과 반지름 입력>>");
        System.out.print("점 입력>>");
        Scanner scanner = new Scanner(System.in);

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double r = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        if (((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)) < r * r)
            System.out.print("점 (" + x2 + "," + y2 + ")는 원 안에 있다.");
    }
}
