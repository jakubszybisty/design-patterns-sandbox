package shape;


import output.ShapePrinter;
import output.ShapeScreener;
import output.ShapeXMLWriter;

/**
 * Created by jszybisty on 5/22/2017.
 */
public class Polygon extends Shape {

    int[] apexes;

    public Polygon(ShapePrinter shapePrinter,
                   ShapeScreener shapeScreener,
                   ShapeXMLWriter shapeXMLWriter,
                   int... apexes) {
        super(shapePrinter, shapeScreener, shapeXMLWriter);
        this.apexes = apexes;
    }

    public void printPolygon() {
        shapePrinter.printPolygon(apexes);
    }

    public void drawPolygon() {
        shapeScreener.drawPolygon(apexes);
    }

    public void writePolygonToXML() {
        shapeXMLWriter.writePolygonToXML(apexes);
    }
}
