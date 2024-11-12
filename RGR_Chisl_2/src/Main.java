import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> x =  new ArrayList<Double>();
        Scanner scanner = new Scanner(System.in);
        x.add(scanner.nextDouble());
        x.add(scanner.nextDouble());
        x.add(scanner.nextDouble());
        ArrayList<Double> y_h =  new ArrayList<Double>();
        ArrayList<Double> y_s =  new ArrayList<Double>();
        double h = (3-1)/2;
        double s = h/2;
        for (int i = 0; i < 3; i++){
            y_h.add(6 * x.get(i) - 4);
        }
        for (int i = 0; i < 3; i++){
            y_s.add(6 * x.get(i) - 4);
            y_s.add(6 * (x.get(i)+s) - 4);
        }
        y_s.remove(5);
        System.out.println(y_h);
        System.out.println(y_s);
        double Integri = h * ((y_h.get(0) + y_h.get(2)) / 2 + y_h.get(1));
        System.out.println(Integri);
        double Integri2 = s * ((y_s.get(0) + y_s.get(4)) / 2 + y_s.get(1) + y_s.get(2) + y_s.get(3));
        System.out.println(Integri2);
        double Runge = (Integri - Integri2)/3;
        System.out.println(Runge);
    }
}