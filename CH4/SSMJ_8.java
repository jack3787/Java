import java.util.Scanner;

class PhoneBook {
    Scanner scanner = new Scanner(System.in);

    public String name, name2; //이름
    public String phone_num; //전화번호
    public int num; //인원수

    public void Num(){
        System.out.print("인원수>>");
        num = scanner.nextInt();
    }
    public void Name(){
        name = scanner.next(); // *****
    }
    public void Phone_num(){
        phone_num = scanner.next(); // *****
    }
    public void Search(){
        System.out.print("검색할 이름>>");
        name2 = scanner.next();
    }
}

public class SSMJ_8 {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        PhoneBook path = new PhoneBook(); //PhoneBook Class -> SSMJ_8 Class 통로를 열어준다. ***제일 중요***

        path.Num(); // 인원수를 받는 함수(?) 객체를 생성.
        String[][] Phone = new String[path.num][2]; //2차원 객체배열 Phone 생성

        for(int i=0; i<path.num; i++) { //객체배열 Phone에 이름과 전화번호 저장
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            path.Name();
            Phone[i][0] = path.name;

            path.Phone_num();
            Phone[i][1] = path.phone_num;
        }
        System.out.println("저장되었습니다...");

        //path.Search();
        //System.out.println("검색한 이름은 : " + path.name2);

        //int count = 0;

        while(true) {
            path.Search();

            if (path.name2.equals("그만")) {
                break;
            }
            for(int j=0; j<path.num; j++) { //배열에 저장된 값과 입력한 name2값이 같은지 확인하는 반복문
                if ((path.name2).equals(Phone[j][0])) { //name2=b
                    System.out.println(path.name2 + "의 번호는 " + Phone[j][1]);
                    break;
                }
                else if (!path.name2.equals(Phone[j][0])){
                    if(j==path.num-1){ //배열을 끝까지 돌았는데 name2 == name 인 값이 없을 때 출력!!
                        System.out.println(path.name2 + "는 없습니다.");
                    }
                }
            }
        }
    }
}