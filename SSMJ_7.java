public class SSMJ_7 {
    public static void main(String args[]){
        int array[] = new int[10];
        double sum=0;

        System.out.print("랜덤한 정수들 : ");
        for(int i=0; i<10; i++)
        {
            array[i] = (int)(Math.random()*10 + 1);
            sum += array[i];

            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("평균은 " + sum/10);

    }
}
