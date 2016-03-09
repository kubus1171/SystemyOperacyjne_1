import java.util.Comparator;

/**
 * Created by kamo on 09.03.16.
 */
public class EntryComparator implements Comparator<Proces> {
    @Override
    public int compare(Proces proces1, Proces proces2) {
        return proces1.getTimeOfEntry() - proces2.getTimeOfEntry();
    }
}
