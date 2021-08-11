public class SSMJ_1 {
    String name;
    int a;
    int b;


    public SSMJ_1 (String name, int a, int b) {
        this.name = name;
        this.a = a;
        this.b = b;
    }

    public void show() {
        System.out.println(name +"에서 만든 "+ a +"년형 "+ b +"인치 TV");
    }

    public static void main(String[] args){
        SSMJ_1 myTV = new SSMJ_1("LG", 2017, 32);
        myTV.show();
    }
}



