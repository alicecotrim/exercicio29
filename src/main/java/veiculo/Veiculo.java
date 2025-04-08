package veiculo;

/**
 *
 * @author 1072511349
 */
public class Veiculo {
    private double km;
    private double l;
    

    public Veiculo() {
    }

    public Veiculo(double km, double l) {
        this.km = km;
        this.l = l;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getConsumo() {
        return (getKm()/getL());
    }   
}
