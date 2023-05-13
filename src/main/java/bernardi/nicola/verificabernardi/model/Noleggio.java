package bernardi.nicola.verificabernardi.model;

import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author bernardi.nicola
 */
public class Noleggio implements Comparable<Noleggio> {
    private Veicolo veicolo;
    private int giorniNoleggio;
    private int kmNoleggio;
    private boolean fatturato;

    public Noleggio(Veicolo veicolo, int giorniNoleggio, int kmNoleggio) {
        this.veicolo = veicolo;
        this.giorniNoleggio = giorniNoleggio;
        this.kmNoleggio = kmNoleggio;
        this.fatturato = false;
    }
    

    public Veicolo getVeicolo() {
        return veicolo;
    }

    public int getGiorniNoleggio() {
        return giorniNoleggio;
    }

    public int getKmNoleggio() {
        return kmNoleggio;
    }

    public boolean isFatturato() {
        return fatturato;
    }

    @Override
    public int compareTo(Noleggio o) {
        return this.giorniNoleggio - o.giorniNoleggio;
    }

    public void setFatturato(boolean fatturato) {
        this.fatturato = fatturato;
    }
    

    @Override
    public String toString() {
        return "(" + veicolo + ") " + giorniNoleggio + ", " + kmNoleggio +", fatturato: " + fatturato;
    }

    
    
    
}
