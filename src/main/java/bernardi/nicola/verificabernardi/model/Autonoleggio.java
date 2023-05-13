package bernardi.nicola.verificabernardi.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author bernardi.nicola
 */
public class Autonoleggio {
    private ArrayList<Noleggio> noleggi;

    public Autonoleggio(ArrayList<Noleggio> noleggi) {
        this.noleggi = noleggi;
    }
    public Autonoleggio(){
        noleggi = new ArrayList();
        noleggi.add(new Noleggio((new Autovettura("aa222nn", "fiat", "500", 2012)), 12, 120));
        noleggi.add(new Noleggio(new Autovettura("bd334js", "opel", "astra", 2008), 5, 29));
        noleggi.add(new Noleggio(new Autovettura("xh939dh", "fiat", "panda", 1999), 21, 44));
        noleggi.get(2).setFatturato(true);
        //ordinaPerGiorni();
        //ordinaPerVeicolo();
    }
    
    
    public void ordinaPerGiorni(){
        stampaVeicoli();
        Collections.sort(noleggi);
        stampaVeicoli();
    }
    
    public void ordinaPerVeicolo(){
        NaturalCompareVeicolo n = new NaturalCompareVeicolo();
        Collections.sort(noleggi, n);
    }
    
    public void ordinaPerKm(){
        KmCompare k = new KmCompare();
        Collections.sort(noleggi, k);
        stampaVeicoli();
    }
    
    public void stampaVeicoli(){
        for(Noleggio n: noleggi){
            System.out.println(n);
        }
    }
    
    public String getImportoDaFatturare(){
        float importo = 0;
        String result = "";
        Iterator<Noleggio> i = noleggi.iterator();
        while(i.hasNext()){
            if(!i.next().isFatturato()){
                result += i.next() + "\n";
                if(i.next().getVeicolo() instanceof Autovettura)
                    importo += 20 * i.next().getGiorniNoleggio() + 1 *(i.next().getKmNoleggio())/10;
                else
                    importo += 15 * i.next().getGiorniNoleggio() + 2 * (i.next().getKmNoleggio())/15;
                //result += importo + "\n";
            }
        }
        result += importo + "\n";
        System.out.println("\t result: " + result);
        return result;
    }

    public ArrayList<Noleggio> getNoleggi() {
        return noleggi;
    }
    
    public String arrayListToString(){
        String s = "";
        for(Noleggio n: noleggi){
            s += n + "\n";
        }
        return s;
    }

}
