import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Jakub on 23.02.2017.
 */
public class EagleSnakeObserver implements Observer<Snake> {
    private static final Logger LOGGER = LoggerFactory.getLogger(EagleSnakeObserver.class);

    @Override
    public Snake update(Snake observable) {
        LOGGER.info("Incoming snake! Properties: {}. Hunt him down!", observable);
        return observable;
    }
}