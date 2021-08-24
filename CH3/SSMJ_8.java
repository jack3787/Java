import java.util.Scanner;

public class SSMJ_8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 몇개? ");

        int num = sc.nextInt(); // 입력받을 정수의 개수

        int array[] = new int[num];
        //int x = 0;

        for(int i=0; i<array.length; i++)
        {
            array[i] = (int)(Math.random()*100 + 1);

            for(int j=0; j<i; j++) {
//                if(i == 0)
//                    continue;
//                else
                    while (array[i] == array[j]) {
                        array[i] = (int) (Math.random() * 100 + 1);
                    }
            }
            System.out.print(array[i] + " ");
            //x = array[i];

            if(i%10==9)
                System.out.println();
        }

// 2차원 배열로 해보려했는데
//        int array[][] = new int[(num/10)+1][10]; //(num/10)+1
//        int x = 0;
//
//        for(int i=0; i<array.length; i++){
//            for(int j=0; j<array[i].length; j++){
////                while(array[i][j+1] == array[i][j])
////                    array[i][j] = (int)(Math.random()*100 + 1);
//                array[i][j] = (int)(Math.random()*100 + 1);
//
//                while(array[i][j] == x)
//                    array[i][j] = (int)(Math.random()*100 + 1);
//
//                System.out.print(array[i][j] + " ");
//                x = array[i][j];
//            }
//            System.out.println();
//        }

    }
}
