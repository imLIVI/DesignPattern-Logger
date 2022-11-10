import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (Integer i : source) {
            if (i >= treshold) {
                result.add(i);
            } else {
                logger.log("Element " + i + " does not pass");
            }
        }
        logger.log("Passed the filter " + result.size() + " elements out of " + source.size());
        logger.log("Display the result on the screen");
        return result;
    }
}