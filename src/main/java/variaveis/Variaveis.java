package variaveis;

public class Variaveis {
    private String Descricao = " ";
    public void setDescricao(String descricao){
        this.Descricao=descricao;
    }
    public String getDescricao(){
        return Descricao ;
    }


    private String Valor = " ";

    public void setValor(String valor){
        this.Valor=valor;
    }
    public String getValor(){
        return Valor ;
    }

    public void ClienteDados(String Descricao , String Valor){
        this.Descricao=Descricao;
        this.Valor=Valor;
    }


    private String Titulo = " ";
    public void setTitulo(String titulo){
        this.Titulo=titulo;
    }

    public String getTitulo(){
        return Titulo ;
    }

}
