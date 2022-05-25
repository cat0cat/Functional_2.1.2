import java.util.Random;

public class LandPlot {

    private final int width;
    private final int length;
    private final int salesValue;

    public LandPlot() {
        Random random = new Random();
        this.width = random.nextInt(100);
        this.length = random.nextInt(200);
        this.salesValue = random.nextInt(20000);
    }

    public int getWidth () {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getSalesValue() {
        return salesValue;
    }

    @Override
    public String toString() {
        return "Участок: ширина " + width +
                " м, длина " + length +
                " м, стоимость продажи " + salesValue +
                " руб.";
    }
}
