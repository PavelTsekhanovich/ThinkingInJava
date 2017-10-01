package part.one;

public class DataOnly {

    private int storage(String s){
        return s.length() * 2;
    }

    boolean flag(){
        return true;
    }

    float naturalLogBaseO() {
        return 2.718f;
    }

    void nothing() {
        return;
    }

    void nothing2(){}

    public static void main(String[] args){
        int i = 0;
        double d = 0.0d;
        boolean b = false;
        char c = '\u0000';
        long l = 0L;

        System.out.println("i = " + i + "\n"
                         + "d = " + d + "\n"
                         + "b = " + b + "\n"
                         + "c = " + c + "\n"
                         + "l = " + l);
    }
}
