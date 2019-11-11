package model;

import enums.TipoFornecedorCliente;
import java.util.Date;

public class MFornecedorPessoaFisica extends MPessoaFisica {

    public MFornecedorPessoaFisica() {
    }

    public MFornecedorPessoaFisica(int id, String nome, String cpf, String rg,
            String orgaoExpedidor, Date dataExpedicao, String ufExpedicao,
            Date dataNascimento, String nomeMae, String estadoCivil,
            TipoFornecedorCliente tipoFornecedor) {
        super(id, nome, cpf, rg, orgaoExpedidor, dataExpedicao, ufExpedicao,
                dataNascimento, nomeMae, estadoCivil, tipoFornecedor);
    }

}
