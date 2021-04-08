package clinicamedica;

import javax.swing.JOptionPane;

public class Paciente {
    private String paciente;
    private int cpfPaciente;
    private String email;
    private int idade;
    private float peso;
    private float altura;
    
    public Paciente(String paciente, int cpfPaciente, String email, int idade, float peso, float altura){
        this.paciente = paciente;
        this.cpfPaciente = cpfPaciente;
        this.email = email;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
    
    public Paciente (){
        
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public int getCpfPaciente() {
        return cpfPaciente;
    }

    public void setCpfPaciente(int cpfPaciente) {
        this.cpfPaciente = cpfPaciente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public void cadastrarPaciente(){
        String auxiliar;
        String paciente = JOptionPane.showInputDialog("Digite o nome do paciente: ");
        JOptionPane.showMessageDialog(null, "Paciente: " + paciente);
        auxiliar = JOptionPane.showInputDialog("Informe o nº do CPF do paciente: ");
        cpfPaciente = Integer.parseInt(auxiliar);
        JOptionPane.showMessageDialog(null, cpfPaciente);
        String email = JOptionPane.showInputDialog("Email do paciente: ");
        JOptionPane.showMessageDialog(null, email);
        auxiliar = JOptionPane.showInputDialog("Informe a idade do paciente: ");
        idade = Integer.parseInt(auxiliar);
        JOptionPane.showMessageDialog(null, "Idade do paciente: " + idade + " anos");
        auxiliar = JOptionPane.showInputDialog("Peso do paciente: ");
        peso = Float.parseFloat(auxiliar);
        JOptionPane.showMessageDialog(null, "Peso do paciente: " + peso + " kg");
    }
    
    public void pagarConsulta(){
        
    }
    
    public void retornarConsulta(){
        
    }
    
}
