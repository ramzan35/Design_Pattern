package strategypattern;

/**
 * Created by MRamzan on 7/14/2017.
 */
@SuppressWarnings("ALL")
abstract class StrategySolution implements Strategy {
    // 3. Template Method
    public void solve() {
        start();
        while (nextTry() && !isSolution()) {}
        stop();
    }

    abstract void start();
    abstract boolean nextTry();
    abstract boolean isSolution();
    abstract void stop();
}
