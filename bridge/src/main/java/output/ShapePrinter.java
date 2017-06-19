package output;

/**
 * Created by jszybisty on 6/19/2017.
 */
public interface ShapePrinter {

    void printLine(int x1, int y1, int x2, int y2);

    void printPixel(int x, int y);

    void printCircle(int x, int y, int r);

    void printPolygon(int... apexes);
}
