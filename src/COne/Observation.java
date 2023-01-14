package COne;

import java.io.Serializable;
import java.time.Instant;

public final class Observation implements java.io.Serializable {

    private long customerId;
    private long timeSinceEpoch;
    private String observation;

    public Observation() {
        this.observation = "None";
    }

    public Observation(long customerId, long timeSinceEpoch, String observation) {
        this.customerId  = customerId;
        this.observation = observation;
        this.timeSinceEpoch = timeSinceEpoch;
        if (timeSinceEpoch <= 0) {
            this.timeSinceEpoch = (Instant.now().getEpochSecond() / 60L) - 1;
        }
    }
}
