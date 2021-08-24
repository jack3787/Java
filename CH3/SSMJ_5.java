import java.util.Scanner;

public class SSMJ_5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int array[] = new int[10];

        System.out.print("양의 정수를 입력하시오: ");

        for(int i=0; i<10; i++) //array.length
        {
            array[i] = sc.nextInt();
        }

        System.out.print("3의 배수는 ");
        for(int j=0; j<10; j++)
        {
            if(array[j]%3 == 0)
            {
                System.out.print(array[j] + " ");
            }
        }
    }
}
