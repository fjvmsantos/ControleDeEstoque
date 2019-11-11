package enums;

public enum TipoPagamento {

    AVISTA(1),
    DEBITO(2),
    CREDITO(3),
    EMHAVER(4),
    TROCO(5);

    public int formaPagamento;

    TipoPagamento(int valor) {

        formaPagamento = valor;

    }

}
