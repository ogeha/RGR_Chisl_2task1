import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> x =  new ArrayList<Double>();
        Scanner scanner = new Scanner(System.in);
        x.add(scanner.nextDouble());
        x.add(scanner.nextDouble());
        x.add(scanner.nextDouble());
        ArrayList<Double> y =  new ArrayList<Double>();
        for (int i = 0; i < 3; i++){
            y.add(6 * x.get(i) - 4);
        }
        int h = (3-1)/2;
        double Integri = h * ((y.get(0) + y.get(2)) / 2 + y.get(1));
        System.out.println(Integri);
    }
}