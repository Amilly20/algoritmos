
package exercicio28;
import javax.swing.JOptionPane;
public class Exercicio28 {

    public static void main(String[] args) {
    String valorChequeStr = JOptionPane.showInputDialog("Insira o valor do cheque:");
        
        double valorCheque = Double.parseDouble(valorChequeStr);
        
        double valorCPMF = valorCheque * 0.0038;
        
        String valorCPMFStr = String.format("%.2f", valorCPMF);
       
        JOptionPane.showMessageDialog(null, "O valor recolhido de CPMF será: R$ " + valorCPMFStr);   
    }
    
}

/*
algoritmo "Calcular valor de CPMF sobre cheque"

var
    valorCheque, valorCPMF: real

inicio
    // Entrada de dados
    escreva("Insira o valor do cheque: ")
    leia(valorCheque)

    // Cálculo do valor de CPMF
    valorCPMF <- valorCheque * 0.0038

    // Saída de dados
    escreva("O valor recolhido de CPMF será: R$ ", valorCPMF:0:2)
fimalgoritmo

*/

/*
Valor do Cheque (R$)	Cálculo de CPMF (0.38%)	                 Saída
       1000.00	        1000.00 * 0.0038 = 3.80	    O valor recolhido de CPMF será: R$ 3.80
       500.00	        500.00 * 0.0038 = 1.90	    O valor recolhido de CPMF será: R$ 1.90
       2500.00	        2500.00 * 0.0038 = 9.50	    O valor recolhido de CPMF será: R$ 9.50
      
*/