package bernardi.nicola.verificabernardi.model;

import java.util.Comparator;

/**
 *
 * @author bernardi.nicola
 */
public class NaturalCompareVeicolo implements Comparator<Noleggio>{

        public NaturalCompareVeicolo() {
        }
        
        @Override
        public int compare(Noleggio o1, Noleggio o2) {
            String mm1 = o1.getVeicolo().getMarca() + " " + o1.getVeicolo().getModello();
            String mm2 = o2.getVeicolo().getMarca() + " " + o2.getVeicolo().getModello();
            return mm1.compareTo(mm2);
        }
        
    }
