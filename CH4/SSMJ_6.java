import java.util.Scanner;

class Circle2 {
    double x, y;
    int radius;

    public Circle2(double x, double y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void show2(){
        System.out.println("가장 면적이 큰 원은 " + "(" + x + "," + y + ")" + radius); // ln 빠뜨렸었음.
    }
//    public int getRadius(){
//        return radius;
//    }
}

public class SSMJ_6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Circle c [] = new Circle(double x, double y, int radius); //double, int를 왜 써줘야 할까?

        Circle2 c[] = new Circle2[3];

        for(int i=0; i<c.length; i++){
            System.out.print("x, y, radius >>");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            int radius = scanner.nextInt();
            c[i] = new Circle2(x, y, radius);
        }

        int tmp = 0;
        for(int k=0; k<c.length; k++){
            if(c[0].radius < c[k].radius)
                tmp = k;
        }

        c[tmp].show2();
        scanner.close();
    }
}
