package OO_orientação_ao_objeto.DesafioProduto_Classe_Método;

public class Produto {
    String nome;
    double preco;
    static double desconto = 0.25;

    Produto() { }

    Produto(String nomeInicial, double precoInicial, double descontoInicial)//construtor com 3 métodos
    {
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial;
    }

    double precoComDesconto() {
        return preco * (1 - desconto);
    }
}
