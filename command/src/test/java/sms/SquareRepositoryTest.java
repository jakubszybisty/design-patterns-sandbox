package sms;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by jakub on 14.03.2017.
 */
public class SquareRepositoryTest {

    private SquareRepository squareRepository = new SquareRepository();

    @Before
    public void cleanUp() {
        squareRepository.findAll().forEach(squareRepository::remove);
    }

    @Test
    public void shouldFindAll() {
        final Square square_1 = new Square();
        square_1.setNumber(1);
        final Square square_2 = new Square();
        square_2.setNumber(2);
        final Square square_3 = new Square();
        square_3.setNumber(3);

        final List<Square> squares = Arrays.asList(square_1, square_2, square_3);
        squares.forEach(squareRepository::add);
        Set<Square> squaresFromRepository = squareRepository.findAll();
        assertEquals(3, squaresFromRepository.size());
    }

    @Test
    public void shouldAddOne() {
        final Square square = new Square();
        square.setNumber(1);

        squareRepository.add(square);
        Set<Square> squares = squareRepository.findAll();
        assertEquals(1, squares.size());
    }

    @Test
    public void shouldDoNothingWhenTryingToAddAlreadyExistentSquare() {
        final Square square_1 = new Square();
        square_1.setNumber(1);
        final Square square_2 = new Square();
        square_2.setNumber(2);

        final Set<Square> squares = new HashSet<>(Arrays.asList(square_1, square_2));
        squares.forEach(squareRepository::add);

        squareRepository.add(square_2);
        assertEquals(2, squareRepository.findAll().size());
    }

    @Test
    public void shouldRemoveOne() {
        final Square square_1 = new Square();
        square_1.setNumber(1);
        final Square square_2 = new Square();
        square_2.setNumber(2);
        final Square square_3 = new Square();
        square_3.setNumber(3);

        final Set<Square> squares = new HashSet<>(Arrays.asList(square_1, square_2, square_3));
        squares.forEach(squareRepository::add);

        squareRepository.remove(square_3);
        assertEquals(2, squareRepository.findAll().size());
    }

    @Test
    public void shouldFindOneById() {
        final Square square_1 = new Square();
        square_1.setNumber(1);
        final Square square_2 = new Square();
        square_2.setNumber(2);
        final Square square_3 = new Square();
        square_3.setNumber(3);

        final Set<Square> squares = new HashSet<>(Arrays.asList(square_1, square_2, square_3));
        squares.forEach(squareRepository::add);

        Optional<Square> squareWithId3 = squareRepository.findOneById(3);
        assertEquals(square_3, squareWithId3.get());
    }
}