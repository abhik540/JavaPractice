package COne;

// The DataStore and Observation classes are defined in package
//    clkStore for clickstream data
//    trxStore for transaction data
// Both are stored at per-minute accuracy using sequential minutes since 1/1/1970

import java.util.List;
import java.util.ArrayList;

public class DataStoreRetrieverQ {
    private DataStore store = null;

    public DataStoreRetrieverQ(DataStore store) {
        this.store = store;
    }

    public List<Observation> retrieveRecent(long customerId, long currTime) {
        List<Observation> result = new ArrayList<Observation>();
        // click store
        // user input
        for (long index = 0; index < 5; ++index) {
            Observation val = this.store.retrieve(customerId, currTime - 5 + index);
            if (val != null) {
                result.add(val);
            }
        }
        return result;
    }
}


