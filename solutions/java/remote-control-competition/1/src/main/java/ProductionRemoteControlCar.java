class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {

    private int distanceTravelled;
    private int numberOfVictories;
    
    public void drive() {
        this.distanceTravelled = distanceTravelled + 10;
    }

    public int getDistanceTravelled() {
        return this.distanceTravelled;
    }

    public int getNumberOfVictories() {
        return this.numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar prc2) {
        return compare(this.numberOfVictories, prc2.numberOfVictories);
    }

    public static int compare (int x, int y) {
        return (x < y) ? 1 : ((x == y) ? 0 : -1);
    }
    
}
