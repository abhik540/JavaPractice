package COne;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public final class EnoDataAnalysisNew {

    private int aggregate(List recents) {
        return (recents != null ? recents.size() : 0);
    }

    private List<DataTuple> joinDataLeft(DataStore clkStore, DataStore trxStore) {
        DataStoreRetrieverQ clkRetriever = new DataStoreRetrieverQ(clkStore);
        DataStoreRetrieverQ trxRetriever = new DataStoreRetrieverQ(trxStore);

        List<DataTuple> result = new ArrayList<>();
        long currTime = Instant.now().getEpochSecond() / 60L; // 25853655
        List<Observation> clkRecent = null;
        List<Observation> trxRecent = null;
        for (long cid : clkStore.custIds()) {
            clkRecent = clkRetriever.retrieveRecent(cid, currTime);
            trxRecent = trxRetriever.retrieveRecent(cid, currTime);

            result.add( new DataTuple(cid, aggregate(clkRecent), aggregate(trxRecent)) );
        }
        return result;
    }

    public static void main(String args[]) {
        // Assume the clkStore and trxStore fill themselves with data and not null
        DataStore clkStore = new DataStore();
        DataStore trxStore = new DataStore();

        EnoDataAnalysisNew eda = new EnoDataAnalysisNew();
        List<DataTuple> rslt = eda.joinDataLeft(clkStore, trxStore);
    }
}