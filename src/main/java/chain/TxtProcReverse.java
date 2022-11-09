package chain;

/**
 *
 * @author Darya Benedziktovich
 */
public class TxtProcReverse extends TxtProc {

    public static String ACTION = "REVERSE";

    @Override
    public String processRequest(Request request) {
        if (request.action.toUpperCase().equals(ACTION)) {
            return new StringBuilder(request.text).reverse().toString();
        } else {
            return next(request);
        }
    }
}
