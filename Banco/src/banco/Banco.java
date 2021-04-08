package banco;

import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.setTitular("Daniel Vitorio");
        c1.setNumero(580422);
        c1.setAgencia("Iguatemi");
        c1.setSaldo(1850f);
        c1.setData("10/05/2013");
        c1.calculaRendimento();
        c1.deposita(1125f);
        c1.status();
        c1.deposita(275f);
        c1.status();
    }
    
}
