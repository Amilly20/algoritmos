
package exercicio26;
import javax.swing.JOptionPane;
public class Exercicio26 {

    public static void main(String[] args) {
      double volume, raio, altura;
        String s_raio, s_altura;

        s_raio = JOptionPane.showInputDialog(null, "Qual o raio da circunferência da caixa d'água?");
        s_altura = JOptionPane.showInputDialog(null, "Qual a altura da caixa d'água?");
        raio = Double.parseDouble(s_raio);
        altura = Double.parseDouble(s_altura);

        volume = Math.PI * (raio * raio) * altura;

        JOptionPane.showMessageDialog(null, "O volume é: " + volume);
    }
}

/*
algoritmo "Calcular o volume de uma caixa d'água cilíndrica"

var
    volume, raio, altura: real

inicio
    // Entrada de dados
    escreva("Qual o raio da circunferência da caixa d'água (em metros)? ")
    leia(raio)

    escreva("Qual a altura da caixa d'água (em metros)? ")
    leia(altura)

    // Cálculo do volume
    volume <- 3.14159 * (raio * raio) * altura

    // Saída de dados
    escreva("O volume da caixa d'água é: ", volume, " metros cúbicos.")
fimalgoritmo

*/

/*
Raio (m)	Altura (m)	          Cálculo do Volume	                                                Saída
  2.0	           3.0	         3.14159 * (2.0 * 2.0) * 3.0 = 37.69908	         O volume da caixa d'água é: 37.69908 metros cúbicos.
  1.5	           4.0	         3.14159 * (1.5 * 1.5) * 4.0 = 28.27431  	 O volume da caixa d'água é: 28.27431 metros cúbicos.
  1.0	           2.5	         3.14159 * (1.0 * 1.0) * 2.5 = 7.853975	         O volume da caixa d'água é: 7.853975 metros cúbicos.
*/