public class B {
    public B() {
        A a = new A();
        a.field1 = 1;
        a.field2 = 1;
        //a.field3 = 1; field3는 private접근 제한자를 가지기 때문에 값을 바꾸지 못한다.

        a.method1();
        a.method2();
        //a.method3(); 위와 마찬가로 method3는 private 접근 제한자를 가지기 때문에 호출이 불가능하다.
    }
}
