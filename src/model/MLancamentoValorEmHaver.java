package model;

import enums.TipoStatusDaConta;
import java.util.Date;

public class MLancamentoValorEmHaver {

    private int id;
    private MPessoaFisica clientePf;
    private MPessoaJuridica clientePj;
    private MFormaPagamento pagamento;
    private MMovimentoSaidaVenda movimentoSaidaVenda;
    private TipoStatusDaConta statusDaConta;
    private double saldoDevedor;
    private double valorPago;
    private double emHaver;
    private Date data_movimento;

    public MLancamentoValorEmHaver() {
    }

    public MLancamentoValorEmHaver(int id, MPessoaFisica clientePf, MPessoaJuridica clientePj, MFormaPagamento pagamento, MMovimentoSaidaVenda movimentoSaidaVenda, TipoStatusDaConta statusDaConta, double saldoDevedor, double valorPago, double emHaver, Date data_movimento) {
        this.id = id;
        this.clientePf = clientePf;
        this.clientePj = clientePj;
        this.pagamento = pagamento;
        this.movimentoSaidaVenda = movimentoSaidaVenda;
        this.statusDaConta = statusDaConta;
        this.saldoDevedor = saldoDevedor;
        this.valorPago = valorPago;
        this.emHaver = emHaver;
        this.data_movimento = data_movimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MPessoaFisica getClientePf() {
        return clientePf;
    }

    public void setClientePf(MPessoaFisica clientePf) {
        this.clientePf = clientePf;
    }

    public MPessoaJuridica getClientePj() {
        return clientePj;
    }

    public void setClientePj(MPessoaJuridica clientePj) {
        this.clientePj = clientePj;
    }

    public MFormaPagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(MFormaPagamento pagamento) {
        this.pagamento = pagamento;
    }

    public MMovimentoSaidaVenda getMovimentoSaidaVenda() {
        return movimentoSaidaVenda;
    }

    public void setMovimentoSaidaVenda(MMovimentoSaidaVenda movimentoSaidaVenda) {
        this.movimentoSaidaVenda = movimentoSaidaVenda;
    }

    public TipoStatusDaConta getStatusDaConta() {
        return statusDaConta;
    }

    public void setStatusDaConta(TipoStatusDaConta statusDaConta) {
        this.statusDaConta = statusDaConta;
    }

    public double getSaldoDevedor() {
        return saldoDevedor;
    }

    public void setSaldoDevedor(double saldoDevedor) {
        this.saldoDevedor = saldoDevedor;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public double getEmHaver() {
        return emHaver;
    }

    public void setEmHaver(double emHaver) {
        this.emHaver = emHaver;
    }

    public Date getData_movimento() {
        return data_movimento;
    }

    public void setData_movimento(Date data_movimento) {
        this.data_movimento = data_movimento;
    }

    @Override
    public String toString() {
        return "MRecebimentoEmHaver{" + "id=" + id + ", clientePf=" + clientePf + ", clientePj=" + clientePj + ", pagamento=" + pagamento + ", movimentoSaidaVenda=" + movimentoSaidaVenda + ", statusDaConta=" + statusDaConta + ", saldoDevedor=" + saldoDevedor + ", valorPago=" + valorPago + ", emHaver=" + emHaver + ", data_movimento=" + data_movimento + '}';
    }

}
