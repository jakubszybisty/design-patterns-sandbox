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
        final SquareRepository squareRepository = new SquareRepository();
        final Executer executer = new Executer();
        final CommandMetadataResolver commandMetadataResolver = new CommandMetadataResolver();

        final Scanner scanner = new Scanner(System.in);
        while(true) {
            String commandMetadata = scanner.nextLine();
            executer.executeCommand(commandMetadataResolver.resolve(commandMetadata), squareRepository);
        }
    }
}
