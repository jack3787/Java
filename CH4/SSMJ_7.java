import java.util.Scanner;

//class Day{
//    private String work;
//    public void set(String work) {
//        this.work = work;
//    }
//    public String get() {
//        return work;
//    }
//    public void show() {
//        if(work == null)
//            System.out.println("없습니다.");
//        else
//            System.out.println(work + "입니다.");
//    }
//}

public class SSMJ_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Day schedule [] = new Day[30];

        String schedule[] = new String[30];

        int input = 0;
        while(input != 3) {
            System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
            input = scanner.nextInt();
            if(input == 1)
                if(input>=1 && input<=3) {
                    System.out.print("날짜(1~30)? ");
                    int date = scanner.nextInt();
                    System.out.print("할일(빈칸없이입력)? ");
                    String schedule_in = scanner.next();
                    //scanner.nextLine();
                    schedule[date] = schedule_in;
                }
                else
                    continue; // input에 1~3 외의 값을 넣으면 다시 input 입력.
            else if(input == 2) {
                System.out.print("날짜(1~30)? ");
                int date = scanner.nextInt();
                System.out.println(schedule[date]);
            }
            else if(input == 3) {
                System.out.print("프로그램을 종료합니다.");
            }
        }
    }
}
