class NeedForSpeed {
    private final int speed;
    private final int batteryDrain;
    private int metersDriven = 0;
    private int batteryLevel = 100;

    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed; this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return batteryLevel < batteryDrain;
    }

    public int distanceDriven() {
        return metersDriven;
    }

    public void drive() {
        if (batteryDrained()) return;
        metersDriven += speed;
        batteryLevel -= batteryDrain;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    
    private final int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        while (!car.batteryDrained() && car.distanceDriven() < distance) car.drive();
        return car.distanceDriven() >= distance;
    }
}
