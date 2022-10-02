public class Conteixo {
    public Double valorAluguel;
    public String localidade;
    public Boolean disponivel;
    public IContainer meuEstado;

    public Conteixo(){
        this.meuEstado = new cDesalugado();
        System.out.println("Container disponivel");
    }

    public void alugar() {
        this.meuEstado.alugar();
    }
    public void desalugar(){
        this.meuEstado.desalugar();
    }
}

