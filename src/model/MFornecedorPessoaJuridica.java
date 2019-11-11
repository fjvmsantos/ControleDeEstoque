package model;

import enums.TipoFornecedorCliente;
import java.util.Date;

public class MFornecedorPessoaJuridica extends MPessoaJuridica {

    public MFornecedorPessoaJuridica() {
    }

    public MFornecedorPessoaJuridica(int id, String cnpj, Date abertura,
            String nomeEmpresarial, String tituloEstabelecimento,
            String incricaoMunicipal, String incricaoEstadual,
            TipoFornecedorCliente tipoFornecedor) {
        super(id, cnpj, abertura, nomeEmpresarial, tituloEstabelecimento,
                incricaoMunicipal, incricaoEstadual, tipoFornecedor);
    }

}
