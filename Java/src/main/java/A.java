public class A {
    public int field1;
    int field2;
    private int field3;

   public void method1() {}
   void method2() {}
   private void method3() {}
    // 같은 클래스 내이면 접근제한자와 관계없이 호출이나 수정가능
    public A() {
        field1 = 1;
        field3 = 1;
        field2 = 1;

        method1();
        method2();
        method3();
    }
}
