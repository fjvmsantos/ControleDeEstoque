package enums;

public enum TipoPessoa {

    PESSOAJURIDICA(1),
    PESSOAFISICA(2);

    public int valorPessoa;

    TipoPessoa(int valor) {

        valorPessoa = valor;
    }
}
