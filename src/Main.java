import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final int PLOTS = 10;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цену участка за кв.м (1000 - 10000): ");
        int price = scanner.nextInt();
        List<LandPlot> landPlots = new ArrayList<>();
        for (int i = 0; i < PLOTS; i++) {
            landPlots.add(new LandPlot());
        }
        System.out.println("Список участков с ценой, не более " + price + " руб. за кв.м: ");
        landPlots.stream().filter(a -> a.getSalesValue() / (a.getLength() * a.getWidth()) <= price)
                .toList().forEach(System.out::println);
    }
}