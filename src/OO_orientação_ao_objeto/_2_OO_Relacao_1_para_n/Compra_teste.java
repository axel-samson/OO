package OO_orientação_ao_objeto._2_OO_Relacao_1_para_n;

public class Compra_teste {

    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.cliente = "Mario Jorge";

        compra1.adicionarItem(new Item("Caneta", 20, 2));
        compra1.adicionarItem(new Item("Borracha", 10, 0.50));
        compra1.adicionarItem(new Item("Caderno", 10, 5.50));

        System.out.println(compra1.itens.size());
        System.out.println(compra1.obterValorTotal());
    }
}
