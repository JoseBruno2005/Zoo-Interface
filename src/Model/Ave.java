package Model;

public class Ave {

    int quatAssas;
    int quantpatas;

    public Ave(int quatAssas, int quantpatas) {
        this.quatAssas = quatAssas;
        this.quantpatas = quantpatas;
    }

    public void bicar(){
        System.out.println("A ave bicou!!");
    }

    public int getQuatAssas() {
        return quatAssas;
    }

    public void setQuatAssas(int quatAssas) {
        this.quatAssas = quatAssas;
    }

    public int getQuantpatas() {
        return quantpatas;
    }

    public void setQuantpatas(int quantpatas) {
        this.quantpatas = quantpatas;
    }
}
