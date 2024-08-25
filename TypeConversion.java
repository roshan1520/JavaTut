public class TypeConversion {
    // stringToInt
    void  stringToInt(){
        String a="40";
        int b= Integer.parseInt(a);
        System.out.println(b+3);

    }
    void stringToInt2(){
        String a="45";
        int b= Integer.valueOf(a);
        System.out.println(b+3);
    }
    public static void main(String[] args) {
        TypeConversion tc=new TypeConversion();
        tc.stringToInt();
        tc.stringToInt2();
    }
}
