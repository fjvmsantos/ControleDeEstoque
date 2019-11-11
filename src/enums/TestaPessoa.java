package enums;

public class TestaPessoa {

    public static void escolhePessoa(TipoPessoa pessoa) {

        if (pessoa == TipoPessoa.PESSOAJURIDICA) {
            System.out.println("Pessoa Jurídica");
        } else if (pessoa == TipoPessoa.PESSOAFISICA) {
            System.out.println("Pessoa Física");
        }

    }

}
