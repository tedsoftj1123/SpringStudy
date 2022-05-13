class Accounting{
    public double valueOfSupply;
    public static double vatRate = 0.1;
    public double getVAT() {
        return valueOfSupply * vatRate;
    }
    public double getTotal() {
        return valueOfSupply + getVAT();
    }
}
public class AccountingApp {
    public static void main(String[] args) {
        Accounting a1 = new Accounting();
        a1.valueOfSupply = 10000.0;
        Accounting a2 = new Accounting();
        a2.valueOfSupply = 2000.0;

        System.out.println(a1.getVAT());
        System.out.println(a2.getVAT());

        System.out.println(a1.getTotal());
        System.out.println(a2.getTotal());
        /*
        Accounting.valueOfSupply = 10000.0;
        System.out.println("Value of supply : " + Accounting.valueOfSupply);
        System.out.println("VAT : " + Accounting.getVAT());
        System.out.println("Total : " + Accounting.getTotal());*/

    }
}