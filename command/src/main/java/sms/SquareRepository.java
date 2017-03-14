package sms;

import java.util.*;

/**
 * Created by jszybisty on 2/24/2017.
 */
public class SquareRepository {

    private Set<Square> squares = new HashSet<>();

    public Optional<Square> findOneById(Integer id) {
        return squares.stream().filter(s -> s.getNumber() == id).findFirst();
    }

    public void remove(Square square) {
        squares.remove(square);
    }

    public void add(Square square) {
        squares.add(square);
    }

    public Set<Square> findAll() {
        return squares;
    }
}
