package bernardi.nicola.verificabernardi.model;

/**
 *
 * @author bernardi.nicola
 */
public abstract class Veicolo {
    private String targa;
    private String marca;
    private String modello;
    private int anno;

    public Veicolo(String targa, String marca, String modello, int anno) {
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.anno = anno;
    }

    public String getTarga() {
        return targa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public int getAnno() {
        return anno;
    }

    @Override
    public String toString() {
        return marca + " " + modello + ", " + targa + ", " + anno;
    }
    
    
}
