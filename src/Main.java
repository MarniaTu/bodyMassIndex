public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double m = 1.87;
        double kg = 98.0;
        int bmi = service.calculate(m, kg);
        System.out.println("Индекс массы вашего тела составляет:" + bmi);
    }
}
