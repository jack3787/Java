import java.util.Scanner;

class Circle {
    private double x, y;
    private int radius;

    public Circle(double x, double y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void show(){
        System.out.println("(" + x + "," + y + ")" + radius); // ln 빠뜨렸었음.
    }
}

public class SSMJ_5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Circle c [] = new Circle(double x, double y, int radius); //double, int를 왜 써줘야 할까?

        Circle c[] = new Circle[3];

        for(int i=0; i<c.length; i++){
            System.out.print("x, y, radius >>");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            int radius = scanner.nextInt();
            c[i] = new Circle(x, y, radius);
        }
        for(int i=0; i<c.length; i++){
            c[i].show(); // 이해 잘 안된다
        }
        scanner.close();
    }
}
