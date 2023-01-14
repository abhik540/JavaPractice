package COne;
import java.time.Instant;
import java.util.List;

public class EnoDataAnalysis {

    public static void main(String args[]) {
        // Assume the clkStore and trxStore fill themselves with data
        DataStore clkStore = new DataStore();
        DataStore trxStore = new DataStore();

        DataStoreRetrieverQ clkRetriever = new DataStoreRetrieverQ(clkStore);
        DataStoreRetrieverQ trxRetriever = new DataStoreRetrieverQ(trxStore);

        long cid = 1;
        long currTime = Instant.now().getEpochSecond() / 60L;
        List<Observation> clkRecent = clkRetriever.retrieveRecent(cid, currTime);
        List<Observation> trxRecent = trxRetriever.retrieveRecent(cid, currTime);
    }
}
