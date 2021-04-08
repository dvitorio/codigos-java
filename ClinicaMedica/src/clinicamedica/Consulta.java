package clinicamedica;

import javax.swing.JOptionPane;

//construtores

public class Consulta {
    private int crm;
    private String medico;
    private String paciente;
    private int senha;
    
    public Consulta(int crm, String medico, String paciente){
        this.crm = crm;
        this.medico = medico;
        this.paciente = paciente;
        this.senha = senha;
    }
    
    public Consulta(){
        
    }
    
    //método especial
    
    public void agendarConsulta(){
        String auxiliar;
        JOptionPane.showMessageDialog(null, "Bem-vindo à Clínica DVC ASSOCIADOS!");
        JOptionPane.showMessageDialog(null, "Primeiro, digite sua senha de acesso: ");
        auxiliar = JOptionPane.showInputDialog("Digite sua senha:");
        senha = Integer.parseInt(auxiliar);
            if(senha==35456){
                JOptionPane.showMessageDialog(null, "Acesso permitido!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Acesso negado! Tente de novo!");
            }
        auxiliar = JOptionPane.showInputDialog("Antes de começar, digite o CRM do médico responsável: ");
        crm = Integer.parseInt(auxiliar);
        medico = JOptionPane.showInputDialog("Informe o nome do médico que irá fazer a consulta: ");
        
    }
    
    // métodos acessores

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }
    
}
