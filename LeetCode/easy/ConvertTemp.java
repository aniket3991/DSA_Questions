package easy;

public class ConvertTemp {
    public double[] convertTemperature(double celsius) {
        double[] result = new double[2];
        result[0] = celsius + 273.15;
        result[1] = celsius * 1.80 + 32.00;

        return result;
    }

    public static void main(String[] args) {
        ConvertTemp convertTemp = new ConvertTemp();
        double[] a = convertTemp.convertTemperature(20);
        System.out.println(a[0]);
        System.out.println(a[1]);
    }
}
