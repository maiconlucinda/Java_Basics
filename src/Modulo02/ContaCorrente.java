package Modulo02;

public class ContaCorrente {
    private int numeroConta;
    private int numeroAgencia;
    private String nomeCliente;
    private String dataNascimento;
    private float saldoConta;

    public ContaCorrente(int numeroConta, int numeroAgencia, String nomeCliente, String dataNascimento, float saldoConta) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nomeCliente = nomeCliente;
        this.dataNascimento = dataNascimento;
        this.saldoConta = saldoConta;
    }

    public void depositar(float valor){
        saldoConta = saldoConta + valor;
    }


    public boolean SacarValor(float valor){
        if(valor <= saldoConta){
            saldoConta -= valor;
            return true;
        }
        return false;
    }

    public boolean transferirValor(ContaCorrente destino, float valor){
        if(this.SacarValor(valor)){
            destino.depositar(valor);
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
