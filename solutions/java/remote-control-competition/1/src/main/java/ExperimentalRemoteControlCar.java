public class ExperimentalRemoteControlCar implements RemoteControlCar {

    private int distanceTravelled;

    public void drive() {
        this.distanceTravelled = distanceTravelled + 20;
    }

    public int getDistanceTravelled() {
        return this.distanceTravelled;
    }
}
