package sms;

/**
 * Created by jszybisty on 2/24/2017.
 */
public class Square {
    private int number;
    private int xCoordinate;
    private int yCoordinate;
    private int sideLength;

    @Override
    public String toString() {
        return String.format("%d %d %d %d", number, xCoordinate, yCoordinate, sideLength);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }
}
