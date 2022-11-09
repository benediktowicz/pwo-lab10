package chain;

/**
 *
 * @author Darya Benedziktovich
 */
public class TxtProcDown extends TxtProc {

    public static String ACTION = "DOWN";

    @Override
    public String processRequest(Request request) {

        if (request.action.toUpperCase().equals(ACTION)) {
            return request.text.toLowerCase();
        } else {
            return next(request);
        }
    }

}
