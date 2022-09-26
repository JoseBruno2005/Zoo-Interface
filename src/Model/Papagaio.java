package Model;

import Interface.IComportamentoAndar;
import Interface.IComportamentoDeVoar;
import Interface.IComportamentoFalar;

public class Papagaio extends Ave implements IComportamentoAndar, IComportamentoDeVoar, IComportamentoFalar {


    public Papagaio(int quatAssas, int quantpatas) {
        super(quatAssas, quantpatas);
    }

    @Override
    public void andar() {
        System.out.println("Papagaoi Andou!!");
    }

    @Override
    public void voar() {
        System.out.println("Papagaio Voou!!");
    }

    @Override
    public void falar() {
        System.out.println("Papagaio Falou!!");
    }
}
