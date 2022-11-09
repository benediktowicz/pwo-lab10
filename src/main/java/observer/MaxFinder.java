package observer;

import observer.Publisher.Subscriber;

/**
 *
 * @author Darya Benedziktovich
 */
public class MaxFinder implements Subscriber {

    Integer max = null;

    @Override
    public void action(int x) {
        if (max == null || max < x) {
            max = x;
        }
    }

    public int getMax() {
        return max;
    }
}
