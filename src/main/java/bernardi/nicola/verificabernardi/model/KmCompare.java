package bernardi.nicola.verificabernardi.model;

import java.util.Comparator;

/**
 *
 * @author bernardi.nicola
 */
public class KmCompare implements Comparator<Noleggio> {

    @Override
    public int compare(Noleggio o1, Noleggio o2) {
        if(o1.getKmNoleggio() < o2.getKmNoleggio())
            return -1;
        if(o1.getKmNoleggio() > o2.getKmNoleggio())
            return 1;
        return 0;
    }
    
}
