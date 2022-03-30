package OO_orientação_ao_objeto._2_OO_Relacao_1_para_n;

public class Item {

    public Compra compra;
    String nome;
    int quantidade;
    double preco;
    

    Item(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
}
