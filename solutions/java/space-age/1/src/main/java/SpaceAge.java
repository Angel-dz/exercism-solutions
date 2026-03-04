class SpaceAge {

    private static final double SECONDS_PER_EARTH_YEAR = 31_557_600;
    
    private final double secondsLived;
    private final double earthYears;
    

    SpaceAge(double seconds) {
        this.secondsLived = seconds;
        this.earthYears = secondsLived / SECONDS_PER_EARTH_YEAR;
    }

    double getSeconds() {
        return secondsLived;
    }

    double onEarth() {
        return earthYears;
    }

    double onMercury() {
        return earthYears / 0.2408467;
    }

    double onVenus() {
        return earthYears / 0.61519726;
    }

    double onMars() {
        return earthYears / 1.8808158;
    }

    double onJupiter() {
        return earthYears / 11.862615;
    }

    double onSaturn() {
        return earthYears / 29.447498;
    }

    double onUranus() {
        return earthYears / 84.016846;
    }

    double onNeptune() {
        return earthYears / 164.79132;
    }

}
