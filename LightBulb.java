public class LightBulb {

    private LightBulbState state;
    private String producer;
    private int maxTurnedOnTimes;

    public LightBulb(String producer, int maxTurnedOnTimes) {
        this.producer = producer;
        this.maxTurnedOnTimes = maxTurnedOnTimes;
        this.state = LightBulbState.OFF;
    }

    public void turnOn() {
        if (this.state == LightBulbState.OFF
                && this.maxTurnedOnTimes > 0) {
            this.state = LightBulbState.ON;
            this.maxTurnedOnTimes = this.maxTurnedOnTimes - 1;
        }
    }

    public void turnOff() {
        if (this.state == LightBulbState.ON) {
            this.state = LightBulbState.OFF;
            if (this.maxTurnedOnTimes == 0) {
                this.state = LightBulbState.BROKEN;
            }
        }
    }

}

