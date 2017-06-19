package output;

/**
 * Created by jszybisty on 6/19/2017.
 */
public interface ShapeScreener {

    void drawLine(int x1, int y1, int x2, int y2);

    void drawPixel(int x, int y);

    void drawCircle(int x, int y, int r);

    void drawPolygon(int... apexes);
}
