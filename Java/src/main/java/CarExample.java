public class CarExample {
    public static void main(String[] args) {
        Car2 myCar = new Car2();

        myCar.setSpeed(-50);//이러면 car2클래스에 if문에 걸려서 0이 저장된다.
        System.out.println("현재 속도: " +myCar.getSpeed());

        myCar.setSpeed(100);
        System.out.println("현재 속도" + myCar.getSpeed());
    }
}
