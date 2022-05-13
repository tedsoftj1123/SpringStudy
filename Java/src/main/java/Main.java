public class Main {
    public static String delimiter = "";
    public static void main(String[] args) {
        Korean k1 = new Korean("이하성", "121424213");
        System.out.println("k1.name : " + k1.name);
        System.out.println("k1.ssn : " + k1.ssn);

        Korean k2 = new Korean("감자바", "132412414");
        System.out.println("k2.name : " + k2.name);
        System.out.println("k2.ssn : " + k2.ssn);
    }
}
