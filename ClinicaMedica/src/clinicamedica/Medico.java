package clinicamedica;

public class Medico {
    private String medico;
    private int crm;
    private String especialidade;
    
    public Medico(String medico, int crm, String especialidade){
        this.medico = medico;
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public Medico(){
        
    }
    
    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    //Métodos especiais
    
    public void realizarConsulta(){
        
    }
    
    public void emitirAtestado(){
    
    }
    
    public void prescerverMedicamentos(){
        
    }
}
