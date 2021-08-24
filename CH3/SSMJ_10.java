public class SSMJ_10 {
                        public static void main(String args[]){
                            int[][]Array = new int[4][4];
                            int sum_any = 0;
                            //while(sum < 7) {
                            for (int i = 0; i < 4; i++) {
                                for (int i2 = 0; i2 < 4; i2++) {
                                    int num = (int) (Math.random() * 10);
                                    Array[i][i2] = num;

                                    if (Array[i][i2] == 0)
                                        System.out.print(Array[i][i2] + "  ");
                                    else //if (Array[i][i2] != 0) {
                                    {
                                        sum_any++;

                                        if (sum_any > 10)
                                            System.out.print("0  ");
                                        else if (sum_any <= 10) {
                                            num = (int) (Math.random() * 10 + 1);
                                            Array[i][i2] = num;
                                            System.out.print(Array[i][i2] + "  ");
                                        }
                                    }
                                    //else
                                    //    System.out.print(Array[i][i2] + "  ");
                                }
                                System.out.println();
                            }
                            //}
                        }
                    }

