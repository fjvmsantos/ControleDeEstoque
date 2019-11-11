package enums;

public class TestaStatusDaConta {

    public static void escolheStatusDaConta(TipoStatusDaConta status) {

        if (status == TipoStatusDaConta.EMABERTO) {

            System.out.println("Conta em Aberto");

        } else if(status == TipoStatusDaConta.BAIXADA){

            System.out.println("Conta Baixada");

        }else if(status == TipoStatusDaConta.RENEGOCIADA){
            
            System.out.println("Conta Renegociada");
            
        }

    }

}
