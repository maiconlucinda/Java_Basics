package Modulo02;

public class ContaCorrente {
    private int numeroConta;
    private int numeroAgencia;
    private String nomeCliente;
    private String dataNascimento;
    private static float saldoConta;

    public ContaCorrente(int numeroConta, int numeroAgencia, String nomeCliente, String dataNascimento, float saldoConta) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nomeCliente = nomeCliente;
        this.dataNascimento = dataNascimento;
        ContaCorrente.saldoConta = saldoConta;
    }

    public static boolean depositar(float valor){
        saldoConta = saldoConta + valor;
        return true;
    }


    public boolean SacarValor(float valor){
        if(valor <= saldoConta){
            saldoConta -= valor;
            return true;
        }
        return false;
    }

    public boolean transferirValor(ContaCorrente contaCorrente, float valor){
        if(valor <= saldoConta){
            ContaCorrente.depositar(valor);
            return true;
        }
        return false;
    }

    public void cancelarContaComJustificativa(float valor){

    }

    public float consultarExtrato(float valor){
        saldoConta = saldoConta - valor;
        return saldoConta;
    }

    public float consultarSaldo(){
        return saldoConta;
    }


}
