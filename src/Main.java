public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 65.0;
        double growth = 1.75;
        double bmi = service.calculate(65,1.75 );
        System.out.println(bmi);
    }
}
