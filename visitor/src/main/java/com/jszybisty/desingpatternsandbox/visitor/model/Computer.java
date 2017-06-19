package com.jszybisty.desingpatternsandbox.visitor.model;


import com.jszybisty.desingpatternsandbox.visitor.VisitableComponent;
import com.jszybisty.desingpatternsandbox.visitor.VisitableComposite;
import com.jszybisty.desingpatternsandbox.visitor.Visitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jakub on 19.03.2017.
 */
public class Computer implements VisitableComposite {

    private List<VisitableComponent> components = new ArrayList<>();

    public Computer() {
    }

    public Computer(VisitableComponent... components) {
        this.components = new ArrayList<>(Arrays.asList(components));
    }

    @Override
    public boolean addComponent(VisitableComponent visitableComponent) {
        return components.add(visitableComponent);
    }

    @Override
    public VisitableComponent findComponent(Integer id) {
        return components.get(id);
    }

    @Override
    public boolean removeComponent(VisitableComponent visitableComponent) {
        return components.remove(visitableComponent);
    }

    @Override
    public List<VisitableComponent> setComponents(List<VisitableComponent> children) {
        return this.components = new ArrayList<>(children);
    }

    @Override
    public int getPrice() {
        return components.stream().mapToInt(VisitableComponent::getPrice).sum();
    }

    @Override
    public void accept(Visitor visitor) {
        components.forEach(c -> c.accept(visitor));
    }
}
