package Model;

import Interface.IComportamentoAndar;
import Interface.IComportamentoDeVoar;
import Interface.IComportamentoNadar;

public class Pato extends Ave implements IComportamentoNadar, IComportamentoAndar, IComportamentoDeVoar {


    public Pato(int quatAssas, int quantpatas) {
        super(quatAssas, quantpatas);
    }

    @Override
    public void andar() {
        System.out.println("Pato Andou!!");
    }

    @Override
    public void voar() {
        System.out.println("Pato Voou!!");
    }

    @Override
    public void nadar() {
        System.out.println("Pato Nadou!!");
    }
}
