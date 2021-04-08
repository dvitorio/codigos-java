package clinicamedica;

public class Clinica {

    public static void main(String[] args) {
        Paciente p1 = new Paciente();
        p1.cadastrarPaciente();
        Consulta c1 = new Consulta();
        c1.agendarConsulta();
    }
    
}
