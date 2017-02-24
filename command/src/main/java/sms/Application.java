package sms;

import sms.command.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by jszybisty on 2/24/2017.
 */
public class Application {

    public static void main(String[] args) {
        Board board = new Board();
        Invoker invoker = new Invoker();
        CommandResolver commandResolver = new CommandResolver();

        Scanner scanner = new Scanner(System.in);
        while(true) {
            String commandMetadata = scanner.nextLine();
            invoker.invoke(commandResolver.resolve(commandMetadata), commandMetadata, board);
            //new CreateCommand().execute(commandMetadata, squareMap);
            //new PrintCommand().execute(squareMap);
        }
    }
}
