public class cAlugado implements IContainer {

    @Override
    public void alugar(Conteixo c, String nomeSolicitante, String dataPag) {
        System.out.println("Este container não pode ser Alugado");
    }

    public void desalugar(Conteixo c) {
        System.out.println("Este container já esta desalugado");
        c.meuEstado = new cDesalugado();
    }

}
