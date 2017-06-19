package output;

import java.util.stream.Stream;

/**
 * Created by jszybisty on 6/19/2017.
 */
public class ShapePrinterImpl implements ShapePrinter {

    @Override
    public void printLine(int x1, int y1, int x2, int y2) {
        System.out.printf("Rectangle is printed at: %d, %d, %d, %d.\n", x1, y1, x2, y2);
    }

    @Override
    public void printPixel(int x, int y) {
    }

    @Override
    public void printCircle(int x, int y, int r) {
        System.out.printf("Circle is printed at: %d, %d, %d.\n", x, y, r);
    }

    @Override
    public void printPolygon(int... apexes) {
        System.out.format("Polygon is printed at: ");
        for(int i: apexes) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
