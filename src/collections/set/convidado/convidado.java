package collections.set.convidado;

public class convidado {
    //Atributos
    private String nome;
    private int codigo;

    //construtor

    public convidado(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
