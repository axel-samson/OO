package OO_orientação_ao_objeto._2_OO_Relacao_1_para_n;

import java.util.ArrayList;

public class Compra {
    String cliente;
    ArrayList<Item> itens = new ArrayList<Item>();

    void adicionarItem(Item item) {
        itens.add(item);
        item.compra = this;
    }

    double obterValorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.quantidade * item.preco;
        }
        return total;
    }
}
