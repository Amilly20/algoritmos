
package exercicio27;
import javax.swing.JOptionPane;
public class Exercicio27 {

    public static void main(String[] args) {
 double[] compras = new double[4];
        double totalGastos = 0;
        
        for (int i = 0; i < 4; i++) {
            compras[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da compra " + (i+1) + ":"));
            totalGastos += compras[i];
        }
        
        double pontos = totalGastos / 5;
        
        JOptionPane.showMessageDialog(null, "O total de pontos acumulados é: " + pontos);
    }
}

/*
algoritmo "Calcular pontos acumulados com base nos gastos"

var
    compras: vetor[1..4] de real
    totalGastos, pontos: real
    i: inteiro

inicio
    totalGastos <- 0

    // Entrada de valores das compras
    para i de 1 ate 4 faca
        escreva("Digite o valor da compra ", i, ": ")
        leia(compras[i])
        totalGastos <- totalGastos + compras[i]
    fimpara

    // Cálculo dos pontos
    pontos <- totalGastos / 5

    // Saída de dados
    escreva("O total de pontos acumulados é: ", pontos)
fimalgoritmo

*/

/*
Compra 1	Compra 2	Compra 3	Compra 4	Total de Gastos	Cálculo dos Pontos (Total ÷ 5)	                 Saída
    50.0	  30.0	          70.0	         100.0	            250.0	250.0 ÷ 5 = 50.0	          O total de pontos acumulados é: 50.0
    10.0	  20.0      	  30.0	         40.0	            100.0	100.0 ÷ 5 = 20.0	          O total de pontos acumulados é: 20.0
    0.0    	  0.0	          50.0	         50.0	            100.0	100.0 ÷ 5 = 20.0	          O total de pontos acumulados é: 20.0
*/