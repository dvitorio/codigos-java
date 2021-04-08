package telalogin;

import javax.swing.JOptionPane;

public class TelaLogin {

    public static void main(String[] args) {
        Login login = new Login();
        String nome = JOptionPane.showInputDialog("Qual o seu nome?");
        String acesso = JOptionPane.showInputDialog("Digite o seu login: ");
        JOptionPane.showMessageDialog(null, login);
        String password = JOptionPane.showInputDialog("Informe sua senha: ");
            if(password == "456321"){
                
            }
        JOptionPane.showMessageDialog(null, password);
    }
    
}
