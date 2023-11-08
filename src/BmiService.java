public class BmiService {
    public int calculate (double m, double kg) {
        double index;
        index = kg / (m * m);
        int bmi;
        bmi = (int) index;
        return bmi;
        }
    }


