/**
 * Created by Jakub on 23.02.2017.
 */
public interface Observer<S> {
    S update(S observable);
}
