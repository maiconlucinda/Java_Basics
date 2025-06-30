package Modulo02;

public class ContaCorrente {
    private String numeroConta;
    private String numeroAgencia;
    private String nomeCliente;
    private String dataNascimento;
    private float saldoConta;

    public ContaCorrente(String numeroConta, String numeroAgencia, String nomeCliente, String dataNascimento, float saldoConta) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nomeCliente = nomeCliente;
        this.dataNascimento = dataNascimento;
        this.saldoConta = saldoConta;
    }

    public float SacarValor(float valor){
        this.saldoConta = this.saldoConta - valor;
        return this.saldoConta;
    }

    public String transferirValor(float valor){
        this.saldoConta = this.saldoConta - valor;
        return "Transferencia realizada com sucesso";
    }

    public void cancelarContaComJustificativa(float valor){

    }

    public float consultarExtrato(float valor){
        this.saldoConta = this.saldoConta - valor;
        return this.saldoConta;
    }

    public float consultarSaldo(){
        return this.saldoConta;
    }


}
