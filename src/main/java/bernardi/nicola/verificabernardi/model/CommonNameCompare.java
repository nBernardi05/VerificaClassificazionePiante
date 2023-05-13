package bernardi.nicola.verificabernardi.model;

import java.util.Comparator;

/**
 *
 * @author bernardi.nicola
 */
public class CommonNameCompare implements Comparator<Pianta> {
    public CommonNameCompare(){
        
    }
    @Override
    public int compare(Pianta o1, Pianta o2) {
        return o1.getCommonName().compareTo(o2.getCommonName());
    }
    
}
