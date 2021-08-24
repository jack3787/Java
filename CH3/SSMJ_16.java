import java.util.Scanner;

public class SSMJ_16 {
    public static void main(String args[]){
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
        String computer[] = {"가위", "바위", "보"}; // 컴퓨터가 랜덤으로 무엇을 냈는지 정해준다.

        Scanner scanner = new Scanner(System.in);

        //int num = 10; // 사용자의 입력값을 숫자로

        while(true) {
            System.out.print("가위 바위 보!>> ");
            String people = scanner.next();
            int random = (int) (Math.random() * 3); // computer[0]==가위, computer[1]==바위, ...

            if(people.equals("그만"))
            {
                System.out.print("게임을 종료합니다...");
                scanner.close();
                break;
            }

            if (people.equals("가위"))
            {
                if(random==0)
                    System.out.println("사용자 = " + people + ", 컴퓨터 = " + computer[random]+ ", 비겼습니다.");
                else if(random==1)
                    System.out.println("사용자 = " + people + ", 컴퓨터 = " + computer[random] + ", 컴퓨터가 이겼습니다.");
                else if(random==2)
                    System.out.println("사용자 = " + people + ", 컴퓨터 = " + computer[random] + ", 사용자가 이겼습니다.");
            }
            else if (people.equals("바위"))
            {
                if(random==0)
                    System.out.println("사용자 = " + people + ", 컴퓨터 = " + computer[random]+ ", 사용자가 이겼습니다.");
                else if(random==1)
                    System.out.println("사용자 = " + people + ", 컴퓨터 = " + computer[random] + ", 비겼습니다.");
                else if(random==2)
                    System.out.println("사용자 = " + people + ", 컴퓨터 = " + computer[random] + ", 컴퓨터가 이겼습니다.");
            }
            else if (people.equals("보"))
            {
                if(random==0)
                    System.out.println("사용자 = " + people + ", 컴퓨터 = " + computer[random]+ ", 컴퓨터가 이겼습니다.");
                else if(random==1)
                    System.out.println("사용자 = " + people + ", 컴퓨터 = " + computer[random] + ", 사용자가 이겼습니다.");
                else if(random==2)
                    System.out.println("사용자 = " + people + ", 컴퓨터 = " + computer[random] + ", 비겼습니다.");
            }
            else
                continue;
        }
    }
}
