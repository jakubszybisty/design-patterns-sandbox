package shape;

import output.ShapePrinter;
import output.ShapeScreener;
import output.ShapeXMLWriter;

/**
 * Created by jszybisty on 5/22/2017.
 */
public class Circle extends Shape {

    int x;
    int y;
    int r;

    public Circle(ShapePrinter shapePrinter,
                  ShapeScreener shapeScreener,
                  ShapeXMLWriter shapeXMLWriter,
                  int x, int y, int r) {
        super(shapePrinter, shapeScreener, shapeXMLWriter);
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public void printCircle() {
        shapePrinter.printCircle(x, y, r);
    }

    public void drawCircle() {
        shapeScreener.drawCircle(x, y, r);
    }

    public void writeCircleToXML() {
        shapeXMLWriter.writeCircleToXML(x, y, r);
    }
}
