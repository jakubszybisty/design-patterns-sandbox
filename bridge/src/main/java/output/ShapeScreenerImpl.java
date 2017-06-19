package output;

import java.util.stream.Stream;

/**
 * Created by jszybisty on 6/19/2017.
 */
public class ShapeScreenerImpl implements ShapeScreener {

    @Override
    public void drawLine(int x1, int y1, int x2, int y2) {
        System.out.printf("Rectangle is being drawn at: %d, %d, %d, %d.\n", x1, y1, x2, y2);
    }

    @Override
    public void drawPixel(int x, int y) {

    }

    @Override
    public void drawCircle(int x, int y, int r) {
        System.out.printf("Circle is being drawn at: %d, %d, %d.\n", x, y, r);
    }

    @Override
    public void drawPolygon(int... apexes) {
        System.out.print("Polygon is being drawn at: ");
        for(int i: apexes) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
