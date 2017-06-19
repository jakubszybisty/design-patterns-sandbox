import output.*;
import shape.Circle;
import shape.Polygon;
import shape.Rectangle;

/**
 * Created by jszybisty on 5/22/2017.
 */
public class App {

    public static void main(String[] args) {
        ShapePrinter shapePrinter = new ShapePrinterImpl();
        ShapeScreener shapeScreener = new ShapeScreenerImpl();
        ShapeXMLWriter shapeXMLWriter = new ShapeXMLWriterImpl();

        Circle circle = new Circle(shapePrinter, shapeScreener, shapeXMLWriter, 10, 20, 30);
        Rectangle rectangle = new Rectangle(shapePrinter, shapeScreener, shapeXMLWriter, 1, 2, 3, 4);
        Polygon polygon = new Polygon(shapePrinter, shapeScreener, shapeXMLWriter, 1, 2, 3, 4, 5, 6, 7, 8, 9, 20);

        circle.drawCircle();
        circle.printCircle();
        circle.writeCircleToXML();

        rectangle.drawLine();
        rectangle.printLine();
        rectangle.writeLineToXML();

        polygon.drawPolygon();
        polygon.printPolygon();
        polygon.writePolygonToXML();
    }
}
