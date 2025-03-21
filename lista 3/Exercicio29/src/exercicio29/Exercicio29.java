
package exercicio29;
import javax.swing.JOptionPane;
public class Exercicio29 {

    public static void main(String[] args) {
       String inputA = JOptionPane.showInputDialog("Digite o coeficiente a:");
        String inputB = JOptionPane.showInputDialog("Digite o coeficiente b:");
        
        double a = Double.parseDouble(inputA);
        double b = Double.parseDouble(inputB);
        
        if (a == 0) {
            if (b == 0) {
                JOptionPane.showMessageDialog(null, "A reta coincide com o eixo X.");
            } else {
                JOptionPane.showMessageDialog(null, "A reta é paralela ao eixo X e não o toca.");
            }
        } else {
            double x = -b / a;
            JOptionPane.showMessageDialog(null, "A reta toca o eixo X no ponto (" + x + ", 0).");
    }  
}

/*
    algoritmo "Identificar o ponto de interseção da reta com o eixo X"

var
    a, b, x: real

inicio
    // Entrada de dados
    escreva("Digite o coeficiente a: ")
    leia(a)

    escreva("Digite o coeficiente b: ")
    leia(b)

    // Análise das condições
    se (a = 0) entao
        se (b = 0) entao
            escreva("A reta coincide com o eixo X.")
        senao
            escreva("A reta é paralela ao eixo X e não o toca.")
        fimse
    senao
        x <- -b / a
        escreva("A reta toca o eixo X no ponto (", x, ", 0).")
    fimse
fimalgoritmo

    */
    
/*
    Coeficiente a	Coeficiente b	        Condição	  Cálculo	           Saída
         0.0	             0.0	      a = 0 e b = 0	     -	            A reta coincide com o eixo X.
         0.0	             5.0	      a = 0 e b ≠ 0	     -	            A reta é paralela ao eixo X e não o toca.
         2.0	            -4.0	         a ≠ 0	       x = -(-4.0) / 2.0    A reta toca o eixo X no ponto (2.0, 0).
         -3.0	             9.0	         a ≠ 0	       x = -(9.0) / -3.0    A reta toca o eixo X no ponto (3.0, 0).
    */