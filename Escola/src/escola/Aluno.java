package escola;

import javax.swing.JOptionPane;

public class Aluno {
    private String aluno;
    private int matricula;
    private int serie;
    private int numFaltas; 
    private int phoneAluno;
    public double media;
    
    public Aluno(String aluno, int matricula, int serie, int numFaltas, int phoneAluno, double media){
        this.aluno = aluno;
        this.matricula = matricula;
        this.serie = serie;
        this.numFaltas = numFaltas;
        this.phoneAluno = phoneAluno;
        this.media = media;
    }
    
    public Aluno(){
        
    }
    
    public void novoAluno(){
        
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getNumFaltas() {
        return numFaltas;
    }

    public void setNumFaltas(int numFaltas) {
        this.numFaltas = numFaltas;
    }

    public int getPhoneAluno() {
        return phoneAluno;
    }

    public void setPhoneAluno(int phoneAluno) {
        this.phoneAluno = phoneAluno;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    
    @Override
    public String toString() {
        return "Aluno{" + "aluno=" + aluno + ", matricula=" + matricula + ", serie=" + serie + ", numFaltas=" + numFaltas + ", phoneAluno=" + phoneAluno + ", media=" + media + '}';
    }
    
    public void matricularAluno(){
        JOptionPane.showInputDialog("Digite o nome do aluno a ser matriculado: ");
        JOptionPane.showMessageDialog(null, aluno);
        JOptionPane.showInputDialog("Série do aluno: ");
        JOptionPane.showMessageDialog(null, serie);
    }
    
    public void aprovarAluno(){
        if(this.media >= 6.0){
            JOptionPane.showMessageDialog(null, "Situação do aluno: Aprovado!");
            JOptionPane.showMessageDialog(null, "Média: " + this.media);
        }
        else{
            JOptionPane.showMessageDialog(null, "Situação do aluno: Reprovado!");
            JOptionPane.showMessageDialog(null, "Média: " + this.media);
        }
    }    
}
