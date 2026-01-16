
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for(int birdsNumber: birdsPerDay) {
            if (birdsNumber == 0) {return true;}
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int total = 0;
        for (int i = 0; i < numberOfDays; i++) {
            if(i == birdsPerDay.length) {return total;}
            total = total + birdsPerDay[i];
        }
        return total;
    }

    public int getBusyDays() {
        int numberOfBusyDays = 0;
        for(int birdsNumber: birdsPerDay) {
            if (birdsNumber >= 5) {numberOfBusyDays++;}
        }
        return numberOfBusyDays;
    }
}
