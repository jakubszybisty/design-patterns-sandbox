package sms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jszybisty on 2/24/2017.
 */
public class Board {
    private List<Square> squares = new ArrayList<>();

    public List<Square> getSquares() {
        return squares;
    }

    public void setSquares(List<Square> squares) {
        this.squares = squares;
    }
}
