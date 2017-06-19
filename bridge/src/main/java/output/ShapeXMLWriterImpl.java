package output;

import java.util.stream.Stream;

/**
 * Created by jszybisty on 6/19/2017.
 */
public class ShapeXMLWriterImpl implements ShapeXMLWriter {

    @Override
    public void writeLineToXML(int x1, int y1, int x2, int y2) {
        System.out.printf("Writing rectangle to XML at: %d, %d, %d, %d.\n", x1, y1, x2, y2);
    }

    @Override
    public void writePixelToXML(int x, int y) {

    }

    @Override
    public void writeCircleToXML(int x, int y, int r) {
        System.out.printf("Writing circle to XML at: %d, %d, %d.\n", x, y, r);
    }

    @Override
    public void writePolygonToXML(int... apexes) {
        System.out.print("Writing polygon to XML at: ");
        for(int i: apexes) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
