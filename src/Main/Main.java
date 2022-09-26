package Main;

import Model.Arara;
import Model.Papagaio;
import Model.Pato;
import Model.Pinguim;

public class Main {
    public static void main(String[] args) {

        Pinguim ping = new Pinguim(2,2,"Pinguim Rei");
        Arara azul = new Arara(2,2,true);
        Papagaio meiras = new Papagaio(2,2);
        Pato qua = new Pato(2,2);

        System.out.println("-------------------------");
        ping.andar();
        ping.nadar();
        ping.bicar();
        System.out.println("-------------------------");
        azul.voar();
        azul.bicar();
        azul.andar();
        System.out.println("-------------------------");
        meiras.falar();
        meiras.andar();
        meiras.voar();
        meiras.bicar();
        System.out.println("-------------------------");
        qua.andar();
        qua.nadar();
        qua.bicar();
        qua.voar();
        System.out.println("-------------------------");
    }
}
