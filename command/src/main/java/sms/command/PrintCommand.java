package sms.command;

import sms.SquareRepository;

import java.util.Comparator;

/**
 * Created by jakub on 07.03.2017.
 */
public class PrintCommand {

    public void execute(final SquareRepository squareRepository) {
        squareRepository.findAll()
                .stream()
                .sorted(Comparator.comparing(s -> s.getNumber()))
                .forEach(System.out::println);
    }
}
