package com.jszybisty.desingpatternsandbox.visitor;

import com.jszybisty.desingpatternsandbox.visitor.model.*;

/**
 * Created by jakub on 19.03.2017.
 */
public class Application {

    public static void main(String[] args) {
        GraphicCard graphicCard = new GraphicCard(new GPU(), new Memory(), new Memory());
        Computer computer = new Computer(new Keyboard(), new CPU(), new Memory(), new Monitor(), graphicCard);
        PriceVisitor priceVisitor = new PriceVisitor();

        computer.accept(priceVisitor);
        System.out.println(priceVisitor.getTotalPrice());
    }
}
