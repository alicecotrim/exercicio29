package principal;

import javax.swing.JOptionPane;
import veiculo.Veiculo;

/**
 *
 * @author 1072511349
 */
public class Principal {

    public static void main(String[] args) {
        Veiculo vc = new Veiculo();
        
        vc.setKm(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o km: ")));
        vc.setL(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o L: ")));

        JOptionPane.showMessageDialog(null, "Consumo: " + vc.getConsumo() + " km/l");
    }
}
