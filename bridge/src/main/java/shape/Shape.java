package shape;


import output.ShapePrinter;
import output.ShapeScreener;
import output.ShapeXMLWriter;

/**
 * Created by jszybisty on 5/22/2017.
 */
public abstract class Shape {

    protected ShapePrinter shapePrinter;
    protected ShapeScreener shapeScreener;
    protected ShapeXMLWriter shapeXMLWriter;


    public Shape(ShapePrinter shapePrinter, ShapeScreener shapeScreener, ShapeXMLWriter shapeXMLWriter) {
        this.shapePrinter = shapePrinter;
        this.shapeScreener = shapeScreener;
        this.shapeXMLWriter = shapeXMLWriter;
    }
}
