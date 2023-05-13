/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bernardi.nicola.verificabernardi.model;

/**
 *
 * @author bernardi.nicola
 */
public class Pianta implements Comparable<Pianta> {
    private int rifPicture;
    private String scentificName;
    private String commonName;

    public Pianta(int rifPicture, String commonName, String scentificName) {
        this.rifPicture = rifPicture;
        this.scentificName = scentificName;
        this.commonName = commonName;
    }

    @Override
    public int compareTo(Pianta o) {
        return this.rifPicture - o.rifPicture;
    }

    public int getRifPicture() {
        return rifPicture;
    }

    public String getScentificName() {
        return scentificName;
    }

    public String getCommonName() {
        return commonName;
    }
    
    
}
