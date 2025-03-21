
package exercicio3;
import javax.swing.JOptionPane;
public class Exercicio3 {

    public static void main(String[] args) {
       String larguraStr = JOptionPane.showInputDialog(" digite a area ");
       JOptionPane.showMessageDialog(null," informe a area " + larguraStr);
       
       String alturaStr = JOptionPane.showInputDialog(" digite a largura ");
       JOptionPane.showMessageDialog(null, "Digite altura" + alturaStr);
       
       double largura = 
               Double.parseDouble(larguraStr);
       double altura =
               Double.parseDouble(alturaStr);
       
       double area = altura * largura;
       double perimetro = 2 * (altura + largura);
               
        JOptionPane.showMessageDialog(null, "A area do retangulo é" + area);
          JOptionPane.showMessageDialog(null,"O primeto do retangulo é" + perimetro);
       
    }
    
}
