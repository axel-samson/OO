package OO_orientação_ao_objeto.DesafioProduto_Classe_Método;

//utilização do tipo PRODUTO criado previamente
public class _01_Produto_teste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 4000, 0.25);
        //abaixo está o construtor padrao sem métodos,
        //acima foi tudo feito no construtor do objeto PRODUTO

        //p1.nome = "Notebook";
        //p1.preco = 4000;
        //p1.desconto = 0.25;

        var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 5;
        Produto.desconto = 0.5; //uso do desconto a partir da CLASSE (Produto.desconto)
                                // torna ele aplicável a todos os produtos

        System.out.println(p1.nome + " " + p1.precoComDesconto());
        System.out.println(p2.nome + " " + p2.precoComDesconto());

        double precoFinal1 = p1.precoComDesconto();
        System.out.println("Preço do Notebook com desconto " + precoFinal1);

        double precoFinal2 = p2.precoComDesconto();
        System.out.println("Preço da Caneta Preta com desconto " + precoFinal2);

        double mediaCarrinho = ((precoFinal1 + precoFinal2) / 2);

        System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
    }
}
