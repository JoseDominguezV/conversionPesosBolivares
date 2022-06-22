import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        double pesos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de pesos a convertir "));
        final double BOLIVARES = 0.0014;

        double conversion = pesos * BOLIVARES;
        JOptionPane.showMessageDialog(null, "Su total en Bolivares es\n"+conversion);
    }
}