package bernardi.nicola.verificabernardi.model;

import java.util.Comparator;

/**
 *
 * @author bernardi.nicola
 */
public class ScentificNameCompare implements Comparator<Pianta> {
    
    public ScentificNameCompare(){
        
    }
    @Override
    public int compare(Pianta o1, Pianta o2) {
        return o1.getScentificName().compareTo(o2.getScentificName());
    }
    
}
