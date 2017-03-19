package com.jszybisty.desingpatternsandbox.visitor;

/**
 * Created by jakub on 19.03.2017.
 */
public interface Visitable {

    void accept(Visitor visitor);
}
