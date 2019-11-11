package enums;

public class TestaFormaPagamento {

    public static void escolheFormaPagamento(TipoPagamento pagamento) {

        if (pagamento == TipoPagamento.AVISTA) {

            System.out.println("Pagamento à vista");

        } else if (pagamento == TipoPagamento.CREDITO) {

            System.out.println("Pagamento com cartão de crédito!");

        } else if (pagamento == TipoPagamento.DEBITO) {

            System.out.println("Pagamento com cartão de débito!");

        } else if (pagamento == TipoPagamento.EMHAVER) {

            System.out.println("Pagamento em haver!");

        } else if (pagamento == TipoPagamento.TROCO) {

            System.out.println("Entrada de Troco!");

        }

    }

}
