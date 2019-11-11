package enums;

public enum TipoStatusDaConta {

    EMABERTO(1),
    BAIXADA(2),
    RENEGOCIADA(3);

    public int valorStatus;

    TipoStatusDaConta(int valor) {

        valorStatus = valor;

    }

}
