class ArrayUtil {
    public static int [] concat(int[] a, int[] b){ //배열을 만드는 함수
        int array[]  = new int[a.length + b.length]; //배열a,b의 길이를 합친 배열array 선언
        for (int i = 0; i < a.length; i++) {
            array[i]=a[i]; //array[]에 순서대로 a[], b[] 배열의 값 넣어주는 과정
        }
        for (int i = 0; i < b.length; i++) {
            array[a.length+i]=b[i];
        }
        return array;
    }
    public static void print(int[] x){ //배열을 프린트하는 함수
        System.out.print( "[ " );
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.print( "]" );
    }
}

public class SSMJ_9 {
    public static void main(String [] args) {
        int [] array1 = {1, 5, 7, 9};
        int [] array2 = {3, 6, -1, 100, 77};
        int [] array3 = ArrayUtil.concat(array1, array2);
        ArrayUtil.print(array3);
    }
}







//class ArrayUtil {
//    public static int [] concat(int[] a, int[] b) {
//        int [] array = new int[(a.length+b.length)]; //배열a의 길이+배열b의 길이
//        for(int i=0; i<a.length; i++) {
//            array[i] = a[i]; //array[0]=a[0], array[1]=a[1], ..., array[3]=a[3]
//        }
//        for(int i=0; i<b.length; i++) {
//            array[a.length+i] = b[i]; //array[4+0]=b[0], array[4+1]=b[1], ..., array[4+5]=b[5]
//        }
//        return array;
//    }
//    public static void print(int[] a) {
//        System.out.print("{ ");
//        for(int i=0; i<a.length; i++) {
//            System.out.print(a[i]+" ");
//        }
//        System.out.println(" }");
//    }
//}
//public class SSMJ_9 {
//    public static void main(String[] args) {
//        int [] array1 = {1, 5, 7, 9 };
//        int [] array2 = {3, 6, -1, 100, 77 };
//        int [] array3 = ArrayUtil.concat(array1, array2);
//        ArrayUtil.print(array3);
//    }
//}