import java.awt.Container;
import java.awt.GridLayout;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
 
public class Conversor {
    public static void criarTela(){
        JFrame tela = new JFrame("Conversor");
        JTextField celsiusTextField = new JTextField(10);
        JLabel celsiusLabel = new JLabel("\u00B06");
        JButton celsiuButton = new JButton("Converter");
        JLabel valorConvertidoLabel = new JLabel("");
        Container painelDeconteudo = tela.getContentPane();
        painelDeconteudo.setLayout(new GridLayout(2,4,2,4));
        painelDeconteudo.add(celsiusLabel);
        painelDeconteudo.add(celsiusTextField);
        painelDeconteudo.add(celsiuButton);
        painelDeconteudo.add(valorConvertidoLabel);
        tela.setLocationRelativeTo(null);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        celsiuButton.addActionListener((e) -> {
        double celsius = Double.parseDouble(
        celsiusTextField.getText()
        );
            double fahrenheit = celsius / 5 * 9 + 32;
            valorConvertidoLabel.setText(
            String.format("%.2f\u00B0F", fahrenheit)
 );
 });
 tela.pack();

 tela.setVisible(true);

        tela.setVisible(true);
    }
        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
                criarTela();
            });
        }
}