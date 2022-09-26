package Model;

import Interface.IComportamentoAndar;
import Interface.IComportamentoDeVoar;

public class Arara extends Ave implements IComportamentoDeVoar, IComportamentoAndar {

    boolean estaEmExtincao;


    public Arara(int quatAssas, int quantpatas, boolean estaEmExtincao) {
        super(quatAssas, quantpatas);
        this.estaEmExtincao = estaEmExtincao;
    }



    public boolean isEstaEmExtincao() {
        return estaEmExtincao;
    }

    public void setEstaEmExtincao(boolean estaEmExtincao) {
        this.estaEmExtincao = estaEmExtincao;
    }

    @Override
    public void voar() {
        System.out.println("Arara Voou!!");
    }

    @Override
    public void andar() {
        System.out.println("Arara Andou!!");
    }
}
