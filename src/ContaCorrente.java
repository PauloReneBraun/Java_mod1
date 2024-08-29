import java.time.LocalDate;
import java.util.List;

public class ContaCorrente {
    int numero;
    int agencia;
    String nomeCliente;
    LocalDate dataNascimento;
    double saldo;
    boolean ativo = true;

    List consultarExtrato (LocalDate dataInicial,
                           LocalDate dataFinal){
        return null;
    }

    void cancelar(String justificatica){
        // algoritimo irá manipular o atributo
        // ativo para que se torne false
    }

    void transferir (ContaCorrente contaDestino,
                     double valorTransferido ){

    }

    void sacar (Double valorSolicitado){
        // não solicitei
    }
}
