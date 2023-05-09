package ma.geo.local.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse {

    private String rue;

    private String avenue;

    private String number;

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getAvenue() {
        return avenue;
    }

    public void setAvenue(String avenue) {
        this.avenue = avenue;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
