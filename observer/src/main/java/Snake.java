/**
 * Created by Jakub on 23.02.2017.
 */
public class Snake extends Observable<Snake, Observer<Snake>> {
    private double speed;
    private double weight;
    private Aggression aggression;

    public Snake(double speed, Aggression aggression, double weight) {
        this.speed = speed;
        this.aggression = aggression;
        this.weight = weight;
    }

    public double getSpeed() {
        return speed;
    }

    public double getWeight() {
        return weight;
    }

    public Aggression getAgression() {
        return aggression;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
        notifyObservers(this);
    }

    public void setWeight(double weight) {
        this.weight = weight;
        notifyObservers(this);
    }

    public void setAgression(Aggression agression) {
        this.aggression = agression;
        notifyObservers(this);
    }

    @Override
    public String toString() {
        return "Snake{" +
                "speed=" + speed +
                ", weight=" + weight +
                ", aggression=" + aggression +
                '}';
    }
}

enum Aggression {
    LOW,
    MEDIUM,
    HIGH
}
