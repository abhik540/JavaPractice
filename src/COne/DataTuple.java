package COne;

public class DataTuple {

    private long cid;
    private int  numVals1;
    private int  numVals2;

    public DataTuple(long cid, int numVals1, int numVals2) {
        this.cid = cid;
        this.numVals1 = numVals1;
        this.numVals2 = numVals2;
    }

    public String toString() {
        return ("(" + cid + ", " + numVals1 + ", " + numVals2 + ")");
    }
}
