import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jakub on 23.02.2017.
 */
public abstract class Observable<S, O extends Observer<S>> {

    protected List<O> observers = new ArrayList<>();

    public void attach(final O observer) {
        observers.add(observer);
    }

    public void detach(final O observer) {
        observers.remove(observer);
    }

    public void notifyObservers(S subject) {
        observers.forEach(o -> o.update(subject));
    }

}
