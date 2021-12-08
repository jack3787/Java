import java.util.Scanner;

public class test4 {
    public static void main(String args[]){
        System.out.print("1~99 사이의 정수를 입력하시오>> ");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int sip = num/10;
        int ill = num%10;
//        if(num>=10) {
//            //십의 자리
//            int sip = num / 10;
//            //일의 자리
//            int ill = num % 10;
//            if ((ill % 3 == 0) && (sip % 3 == 0))
//                System.out.print("박수짝짝");
//            else if ((ill % 3 != 0) && (sip % 3 == 0))
//                System.out.print("박수짝");
//            else if ((ill % 3 == 0) && (sip % 3 != 0))
//                System.out.print("박수짝");
//        }
//        else if(num<10){
//            if (num % 3 ==0)
//                System.out.print("박수짝");
//        }
        if((sip%3==0)&&(ill%3==0))
            if(sip==0)
                System.out.print("박수짝");
            else if(ill==0)
                System.out.print("박수짝");
            else
                System.out.print("박수짝짝");

        else if((sip%3 != 0)&&(ill%3==0))
            System.out.print("박수짝");

        else if((sip%3==0)&&(ill%3!=0))
            System.out.print("박수짝");


    }
}
