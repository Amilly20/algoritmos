
package exercicio24;
import javax.swing.JOptionPane;
public class Exercicio24 {

    public static void main(String[] args) {
   double alt_pessoa, som_pessoa, alt_predio, som_predio;
        String s_alt_pessoa, s_som_pessoa, s_som_predio;
        
        s_alt_pessoa = JOptionPane.showInputDialog(null, "Sua altura (em metros): ");
        s_som_pessoa = JOptionPane.showInputDialog(null, "Sua sombra (em metros): ");
        s_som_predio = JOptionPane.showInputDialog(null, "Sombra do prédio (em metros): ");
        alt_pessoa = Double.parseDouble(s_alt_pessoa);
        som_pessoa = Double.parseDouble(s_som_pessoa);
        som_predio = Double.parseDouble(s_som_predio);
        
        alt_predio = (alt_pessoa * som_predio) / som_pessoa;

        JOptionPane.showMessageDialog(null, "A altura do prédio é: "+ alt_predio +" metros");
   }
}

/*
algoritmo "Calcular altura do prédio"

var
    alt_pessoa, som_pessoa, alt_predio, som_predio: real

inicio
    // Entrada de dados
    escreva("Sua altura (em metros): ")
    leia(alt_pessoa)

    escreva("Sua sombra (em metros): ")
    leia(som_pessoa)

    escreva("Sombra do prédio (em metros): ")
    leia(som_predio)

    // Cálculo da altura do prédio
    alt_predio <- (alt_pessoa * som_predio) / som_pessoa

    // Saída de dados
    escreva("A altura do prédio é: ", alt_predio, " metros.")
fimalgoritmo

*/

/*
Altura da Pessoa (m)	Sombra da Pessoa (m)	Sombra do Prédio (m)	Cálculo da Altura do Prédio (m) 	Saída
         1.7	                1.0	               5.0	           (1.7 * 5.0) / 1.0 = 8.5	A altura do prédio é: 8.5 metros.
         1.8	                1.5	               6.0	           (1.8 * 6.0) / 1.5 = 7.2	A altura do prédio é: 7.2 metros.
         1.6	                0.8	               4.0	           (1.6 * 4.0) / 0.8 = 8.0	A altura do prédio é: 8.0 metros.
*/