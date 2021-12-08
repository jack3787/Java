import java.util.Scanner;

public class test2 {
    public static void main(String args[]){
        String result1 = "승자는 철수";
        String result2 = "승자는 영희";
        String result3 = "비겼습니다.";

        while(true) {
        System.out.print("철수 >>");
        Scanner scanner = new Scanner(System.in);

        String what1 = scanner.next();

        System.out.print("영희 >>");
        String what2 = scanner.next();

            if ((what1.equals("주먹")) && (what1.equals("가위"))) {
                System.out.print(result1);
                break;
            }
//        else if ((what1.equals("주먹"))&&(what1.equals("주먹")))
//            System.out.print("비겼습니다.");
            else if ((what1.equals("주먹")) && (what1.equals("보")))
                System.out.print(result2);
            else if ((what1.equals("가위")) && (what1.equals("주먹")))
                System.out.print(result2);
//        else if ((what1.equals("가위"))&&(what1.equals("가위")))
//            System.out.print("비겼습니다.");
            else if ((what1.equals("가위")) && (what1.equals("보")))
                System.out.print(result1);
            else if ((what1.equals("보")) && (what1.equals("주먹")))
                System.out.print(result1);
//        else if ((what1.equals("보"))&&(what1.equals("보")))
//            System.out.print("비겼습니다.");
            else if ((what1.equals("보")) && (what1.equals("가위")))
                System.out.print(result2);
            else if (what1.equals(what2))
                System.out.print(result3);
            else
                continue;
        }


       // System.out.println("승자는 " + );
    }
}
