
package exercicio22;
import javax.swing.JOptionPane;
public class Exercicio22 {
    public static void main(String[] args) {
     int qtd1, qtd5, qtd10, qtd25, qtd50, qtd100;
        double reais;
        String s_qtd1, s_qtd5, s_qtd10, s_qtd25, s_qtd50, s_qtd100;

        s_qtd1 = JOptionPane.showInputDialog(null, "Quantas moedas de 1 centavo você tem?");
        s_qtd5 = JOptionPane.showInputDialog(null, "Quantas moedas de 5 centavos você tem?");
        s_qtd10 = JOptionPane.showInputDialog(null, "Quantas moedas de 10 centavos você tem?");
        s_qtd25 = JOptionPane.showInputDialog(null, "Quantas moedas de 25 centavos você tem?");
        s_qtd50 = JOptionPane.showInputDialog(null, "Quantas moedas de 50 centavos você tem?");
        s_qtd100 = JOptionPane.showInputDialog(null, "Quantas moedas de 1 real você tem?");
        qtd1 = Integer.parseInt(s_qtd1);
        qtd5 = Integer.parseInt(s_qtd5);
        qtd10 = Integer.parseInt(s_qtd10);
        qtd25 = Integer.parseInt(s_qtd25);
        qtd50 = Integer.parseInt(s_qtd50);
        qtd100 = Integer.parseInt(s_qtd100);

        reais = qtd1 + qtd5 * 5 + qtd10 * 10 + qtd25 * 25 + qtd50 * 50 + qtd100 * 100;
        reais = reais / 100;
    
        JOptionPane.showMessageDialog(null, "Total de reais: " + reais);
    }
}

/*
algoritmo "Calcular total de reais das moedas"

var
    qtd1, qtd5, qtd10, qtd25, qtd50, qtd100: inteiro
    reais: real

inicio
    // Entrada de dados
    escreva("Quantas moedas de 1 centavo você tem? ")
    leia(qtd1)

    escreva("Quantas moedas de 5 centavos você tem? ")
    leia(qtd5)

    escreva("Quantas moedas de 10 centavos você tem? ")
    leia(qtd10)

    escreva("Quantas moedas de 25 centavos você tem? ")
    leia(qtd25)

    escreva("Quantas moedas de 50 centavos você tem? ")
    leia(qtd50)

    escreva("Quantas moedas de 1 real você tem? ")
    leia(qtd100)

    // Cálculo do total em reais
    reais <- (qtd1 * 1 + qtd5 * 5 + qtd10 * 10 + qtd25 * 25 + qtd50 * 50 + qtd100 * 100) / 100

    // Saída de dados
    escreva("Total de reais: ", reais)
fimalgoritmo

*/

/*

Moedas de 1 centavo	Moedas de 5 centavos	Moedas de 10 centavos	Moedas de 25 centavos	Moedas de 50 centavos	Moedas de 1 real	Cálculo (Total em Reais)	                           Saída
         10	                   5	                 2	                 4	                1	                3	(101 + 55 + 210 + 425 + 150 + 3100) / 100 = 5.60	Total de reais: 5.60
         20	                   10	                 5	                 2	                2	                1	(201 + 105 + 510 + 225 + 250 + 1100) / 100 = 4.20	Total de reais: 4.20
          0	                    0	                 0	                 0	                0	                10	(01 + 05 + 010 + 025 + 050 + 10100) / 100 = 10.00	Total de reais: 10.00
*/