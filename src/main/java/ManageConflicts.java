import java.util.ArrayList;
import java.util.HashMap;

//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


/*This class manages conflicts */
public class ManageConflicts {
    private HashMap<String, ArrayList<Integer>> usersAndConflicts = new HashMap();

    public ManageConflicts(HashMap<String, ArrayList<Integer>> usersAndConflicts) {
        this.usersAndConflicts = usersAndConflicts;
    }

}
