public class MathTester {
    public static void main (String[] args) {
        double random = Math.sin(Math.PI/6);
        random= Math.round(random*100.0)/100.0;
        System.out.println(random);
        double random2= Math.floor(6.2);
        System.out.println(random2);
    }
}
