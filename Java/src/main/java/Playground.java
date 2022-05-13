import java.util.Scanner;

class Calculator {
    public String opt;//필드
    public int n1;//필드
    public int n2; //필드

    public int getAns() { // 메소드
        return n1+n2;
    }
}

public class Playground {
    public static void main(String[] args) {
        Calculator c1 = new Calculator(); // c1 인스턴스 생성
        c1.opt = "+";
        c1.n1 = 10;
        c1.n2 = 20;

        Calculator c2 = new Calculator(); // c2 인스턴스 생성
        c2.opt = "+";
        c2.n1 = 10;
        c2.n2 = 24;

        System.out.println(c1.n1 + c1.opt +c1.n2 + " = " +c1.getAns());
        System.out.println(c2.n1 + c2.opt +c2.n2 + " = " +c2.getAns());
        /*Cal.opt="+";
        Cal.n1 = 10;
        Cal.n2 = 20;
        System.out.println(Cal.n1 + Cal.opt +Cal.n2 + " = " +Cal.getAns());*/

    }
}
