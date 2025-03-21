package exercicio.pkg3;
import javax.swing.JOptionPane;

public class Exercicio3 {

    public static void main(String[] args) {
    
        // Passo 1: Entrada de dados
        String idInput = JOptionPane.showInputDialog("Digite o número de identificação:");
        String v1Input = JOptionPane.showInputDialog("Digite a nota da primeira verificação (V1):");
        String v2Input = JOptionPane.showInputDialog("Digite a nota da segunda verificação (V2):");
        String v3Input = JOptionPane.showInputDialog("Digite a nota da terceira verificação (V3):");
        String meInput = JOptionPane.showInputDialog("Digite a média dos exercícios (ME):");

        // Conversão das entradas para números
        int id = Integer.parseInt(idInput);
        double v1 = Double.parseDouble(v1Input);
        double v2 = Double.parseDouble(v2Input);
        double v3 = Double.parseDouble(v3Input);
        double me = Double.parseDouble(meInput);

        // Passo 2: Calcular a Média de Aproveitamento (MA)
        double ma = (v1 + 2 * v2 + 3 * v3 + me) / 7;

        // Passo 3: Atribuição de Conceitos
        String conceito;
        if (ma >= 9.0) {
            conceito = "A";
        } else if (ma >= 7.5) {
            conceito = "B";
        } else if (ma >= 6.0) {
            conceito = "C";
        } else if (ma >= 4.0) {
            conceito = "D";
        } else {
            conceito = "E";
        }

        // Passo 4: Saída de dados
        JOptionPane.showMessageDialog(null, 
            "Número de Identificação: " + id + "\n" +
            "Média de Aproveitamento: " + ma + "\n" +
            "Conceito: " + conceito);
    }
}

