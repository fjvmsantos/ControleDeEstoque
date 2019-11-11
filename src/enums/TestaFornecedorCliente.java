package enums;

public class TestaFornecedorCliente {

    public static void escolheFornecedor(TipoFornecedorCliente fornecedor) {

        if (fornecedor == TipoFornecedorCliente.CLIENTE) {
            System.out.println("Cliente");
        } else if (fornecedor == TipoFornecedorCliente.FORNECEDOR) {
            System.out.println("Fornecedor");
        }

    }

}
