class NeedForSpeed {

    private int speed;
    private int batteryDrain;
    private int distanceDriven = 0;
    private int battery = 100;

    void setSpeed(int speed) {
        this.speed = speed;
    }
    
    void setBatteryDrain(int batteryDrain) {
        this.batteryDrain = batteryDrain;
    }

    int getSpeed() {
        return this.speed;
    }

    int getBatteryDrain() {
        return this.batteryDrain;    
    }
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return !(this.battery >= batteryDrain); 
    }

    public int distanceDriven() {
        return this.distanceDriven;
    }

    public void drive() {
        if (battery >= batteryDrain) {
        this.distanceDriven = distanceDriven + this.speed;
        this.battery = battery - batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }
}

class RaceTrack {

    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return car.getSpeed() * (100/car.getBatteryDrain()) >= this.distance;
    }
}
