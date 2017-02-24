/**
 * Created by Jakub on 23.02.2017.
 */
public class Application {

    public static void main(String[] args) {
        Snake snake = new Snake(20, Aggression.HIGH, 40);
        snake.attach(new EagleSnakeObserver());
        snake.attach(new MouseSnakeObserver());

        snake.setAgression(Aggression.LOW);
        snake.setWeight(100);
        snake.setSpeed(200);
    }
}
