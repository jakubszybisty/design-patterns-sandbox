import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Jakub on 23.02.2017.
 */
public class MouseSnakeObserver implements Observer<Snake> {
    private static final Logger LOGGER = LoggerFactory.getLogger(MouseSnakeObserver.class);

    @Override
    public Snake update(Snake observable) {
        LOGGER.info("Incoming snake! Properties: {}. Better run!", observable);
        return observable;
    }
}
