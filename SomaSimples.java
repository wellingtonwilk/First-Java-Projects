import javax.swing.JOptionPane;

public class SomaSimples{
    public static void main(String args[]){

        int n1, n2, soma = 0;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro"));

        soma = (n1 + n2);

        JOptionPane.showMessageDialog(null, "A soma dos números é " + soma);
    }
}