package com.jszybisty.desingpatternsandbox.visitor.model;

import com.jszybisty.desingpatternsandbox.visitor.VisitableComponent;
import com.jszybisty.desingpatternsandbox.visitor.Visitor;

/**
 * Created by jakub on 19.03.2017.
 */
public class CPU implements VisitableComponent {

    @Override
    public int getPrice() {
        return 200;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
