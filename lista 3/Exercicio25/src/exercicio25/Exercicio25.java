
package exercicio25;
import javax.swing.JOptionPane;
public class Exercicio25 {

    public static void main(String[] args) {
     double refresco, água, suco;
        String s_refresco, s_água, s_suco;
        
        s_refresco = JOptionPane.showInputDialog(null, "Quantidade de litros de refresco: ");
        refresco = Double.parseDouble(s_refresco);
        
        água = refresco * 0.8;
        suco = refresco * 0.2;
        
        JOptionPane.showMessageDialog(null, "Serão necessários "+ água +"L de água e "+ suco +"L de suco.");
    }
}

/*
algoritmo "Calcular quantidade de água e suco para o refresco"

var
    refresco, agua, suco: real

inicio
    // Entrada de dados
    escreva("Quantidade de litros de refresco: ")
    leia(refresco)
    
    // Cálculo das quantidades de água e suco
    agua <- refresco * 0.8
    suco <- refresco * 0.2
    
    // Saída de dados
    escreva("Serão necessários ", agua, "L de água e ", suco, "L de suco.")
fimalgoritmo

*/

/*
Litros de Refresco	Cálculo de Água (80%)	Cálculo de Suco (20%)	             Saída
       10	            10 * 0.8 = 8.0	  10 * 0.2 = 2.0	   Serão necessários 8.0L de água e 2.0L de suco.
       5	            5 * 0.8 = 4.0	  5 * 0.2 = 1.0	           Serão necessários 4.0L de água e 1.0L de suco.
       20	            20 * 0.8 = 16.0	  20 * 0.2 = 4.0	   Serão necessários 16.0L de água e 4.0L de suco.
*/