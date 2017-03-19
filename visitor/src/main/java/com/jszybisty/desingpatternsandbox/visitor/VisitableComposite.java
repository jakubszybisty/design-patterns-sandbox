package com.jszybisty.desingpatternsandbox.visitor;

import java.util.List;

/**
 * Created by jakub on 19.03.2017.
 */
public interface VisitableComposite extends VisitableComponent {

    boolean addComponent(VisitableComponent visitableComponent);

    VisitableComponent findComponent(Integer id);

    boolean removeComponent(VisitableComponent visitableComponent);

    List<VisitableComponent> setComponents(List<VisitableComponent> visitableComponents);
}
