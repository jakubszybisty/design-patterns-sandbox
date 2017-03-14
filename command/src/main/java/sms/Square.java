package sms;

/**
 * Created by jszybisty on 2/24/2017.
 */
public class Square {
    private int number;
    private int xCoordinate;
    private int yCoordinate;
    private int sideLength;

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

    @Override
    public String toString() {
        return String.format("%d %d %d %d", number, xCoordinate, yCoordinate, sideLength);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        if (number != square.number) return false;
        if (xCoordinate != square.xCoordinate) return false;
        if (yCoordinate != square.yCoordinate) return false;
        return sideLength == square.sideLength;
    }

    @Override
    public int hashCode() {
        int result = number;
        result = 31 * result + xCoordinate;
        result = 31 * result + yCoordinate;
        result = 31 * result + sideLength;
        return result;
    }
}
