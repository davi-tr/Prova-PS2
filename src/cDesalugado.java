public class cDesalugado implements IContainer{
    public Double valorAluguel;
    public String localidade;
    public Boolean disponivel;
    public String nomeSolicitante;
    public String dataPag;

    @Override
    public void alugar(Conteixo c, String nomeSolicitante, String dataPag) {
      this.nomeSolicitante = nomeSolicitante;
      this.dataPag = dataPag;
      c.meuEstado = new cAlugado();
      System.out.println("Obrigado por alugar este container");
    };

    public void desalugar(Conteixo c){
        System.out.println("Este container já esta desalugado");
    };

}
