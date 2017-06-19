package output;

/**
 * Created by jszybisty on 6/19/2017.
 */
public interface ShapeXMLWriter {

    void writeLineToXML(int x1, int y1, int x2, int y2);

    void writePixelToXML(int x, int y);

    void writeCircleToXML(int x, int y, int r);

    void writePolygonToXML(int... apexes);
}
