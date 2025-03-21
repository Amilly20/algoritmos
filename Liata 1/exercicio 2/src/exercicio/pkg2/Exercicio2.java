package exercicio.pkg2;
import javax.swing.JOptionPane;

public class Exercicio2 {

    public static void main(String[] args) {
    
        // Passo 1: Entrada de dados
        String salarioInput = JOptionPane.showInputDialog("Digite o salário do funcionário:");
        String codigoInput = JOptionPane.showInputDialog("Digite o código do cargo do funcionário:");

        // Conversão das entradas para números
        double salario = Double.parseDouble(salarioInput);
        int codigo = Integer.parseInt(codigoInput);

        double salarioNovo = 0;
        double aumento = 0;
        String cargo = "";

        // Passo 2: Condicionais para calcular o novo salário e determinar o cargo
        if (codigo == 91) {
            aumento = salario * 0.10; // 10% de aumento para código 91 (Gerente)
            cargo = "Gerente";
        } else if (codigo == 92) {
            aumento = salario * 0.20; // 20% de aumento para código 92 (Analista)
            cargo = "Analista";
        } else if (codigo == 93) {
            aumento = salario * 0.30; // 30% de aumento para código 93 (Técnico)
            cargo = "Técnico";
        } else {
            aumento = salario * 0.355; // 35.5% de aumento para cargos não listados
            cargo = "Outro cargo";
        }

        salarioNovo = salario + aumento;

        // Passo 3: Saída de dados
        JOptionPane.showMessageDialog(null, 
            "Cargo: " + cargo + "\n" +
            "Salário antigo: R$" + salario + "\n" +
            "Novo salário: R$" + salarioNovo + "\n" +
            "Diferença: R$" + aumento);
    }
}

