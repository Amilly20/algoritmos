
package exercicio1;
import javax.swing.JOptionPane;
public class Exercicio1 {

    public static void main(String[] args) {
     //Informar o nome do usuario   
   String nome = JOptionPane.showInputDialog(" Ola seja bem vindo(a) digite seu nome ");
   JOptionPane.showMessageDialog(null," Muito prazer " + nome);
   //Informar os numeros 1 e 2 
   String num1 = JOptionPane.showInputDialog(" Informe o primeiro numero ");
   String num2 = JOptionPane.showInputDialog(" Informe o segundo valor ");
   //Imprimindo numeros na tela
     int  numero1 = Integer.parseInt(num1);
     int  numero2 = Integer.parseInt(num2);
     //resultado da divisão,subtração,adição e multiplicação
      int soma = numero1 + numero2;
      int div = numero1 / numero2;
      int sub = numero1 - numero2;
      int mult = numero1 * numero2;
      //imprimindo os resultados para o usuario
   JOptionPane.showMessageDialog(null," A soma dos numeros é " + soma);
   JOptionPane.showMessageDialog(null," A multiplicação dos numeros é " + mult);
   JOptionPane.showMessageDialog(null," A divisão dos numeros é " + div);
   JOptionPane.showMessageDialog(null," A subtração dos numeros é " + sub);
    }
    
}
