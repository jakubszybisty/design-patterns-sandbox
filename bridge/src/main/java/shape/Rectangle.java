package shape;


import output.ShapePrinter;
import output.ShapeScreener;
import output.ShapeXMLWriter;

/**
 * Created by jszybisty on 5/22/2017.
 */
public class Rectangle extends Shape {

    int x1, y1, x2, y2;

    public Rectangle(ShapePrinter shapePrinter,
                     ShapeScreener shapeScreener,
                     ShapeXMLWriter shapeXMLWriter,
                     int x1, int y1, int x2, int y2) {
        super(shapePrinter, shapeScreener, shapeXMLWriter);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void printLine() {
        shapePrinter.printLine(x1, y1, x2, y2);
    }

    public void drawLine() {
        shapeScreener.drawLine(x1, y1, x2, y2);
    }

    public void writeLineToXML() {
        shapeXMLWriter.writeLineToXML(x1, y1, x2, y2);
    }
}
