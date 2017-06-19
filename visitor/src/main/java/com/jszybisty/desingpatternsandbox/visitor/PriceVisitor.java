package com.jszybisty.desingpatternsandbox.visitor;

import com.jszybisty.desingpatternsandbox.visitor.model.Memory;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by jakub on 19.03.2017.
 */
public class PriceVisitor implements Visitor {

    private static final Logger LOGGER = Logger.getLogger(PriceVisitor.class.getName());

    private int totalPrice;

    @Override
    public void visit(VisitableComponent visitableComponent) {
        LOGGER.log(Level.INFO, "visit(): {0}", visitableComponent.getClass().getSimpleName());
        if (visitableComponent instanceof Memory) {
            totalPrice += visitableComponent.getPrice();
        }
    }

    public int getTotalPrice() {
        return totalPrice;
    }
}
