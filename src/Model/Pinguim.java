package Model;

import Interface.IComportamentoAndar;
import Interface.IComportamentoNadar;

public class Pinguim extends Ave implements IComportamentoAndar, IComportamentoNadar {

    String especie;


    public Pinguim(int quatAssas, int quantpatas, String especie) {
        super(quatAssas, quantpatas);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public void andar() {
        System.out.println("Piguim Andou!!");
    }

    @Override
    public void nadar() {
        System.out.println("Pinguim Nadou!!");
    }
}
