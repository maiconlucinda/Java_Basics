package Modulo02;

import java.time.LocalDate;

public class ContaCorrente {
    private int numeroConta;
    private int numeroAgencia;
    private String nomeCliente;
    private LocalDate dataNascimento;
    private float saldoConta;
    private Extrato extrato;
    boolean ativo = true;


    public ContaCorrente(int numeroConta, int numeroAgencia, String nomeCliente, String dataNascimento, float saldoConta) {
        this.extrato = new Extrato();
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nomeCliente = nomeCliente;
        this.dataNascimento = dataNascimento;
        this.saldoConta = saldoConta;
        extrato.adicionarTransacao("Conta Criada com saldo" + this.saldoConta);
    }

    public void depositar(float valor){
        saldoConta = saldoConta + valor;
        extrato.adicionarTransacao("Depósito de R$" + valor);
    }


    public boolean sacarValor(float valor){
        if(valor <= saldoConta){
            saldoConta -= valor;
            extrato.adicionarTransacao("Saque de R$" + valor);
            return true;
        }
        return false;
    }

    public boolean transferirValor(ContaCorrente destino, float valor){
        if(this.sacarValor(valor)){
            destino.depositar(valor);
            extrato.adicionarTransacao("Transferencia de" + valor);
            return true;
        }
        return false;
    }

    public void cancelarContaComJustificativa(float valor){
        this.ativo = false;

    }

    public void consultarExtrato(){
        extrato.obterExtrato();
    }

    public float consultarSaldo(){
        System.out.println(this.saldoConta);
        return 0;
    }


}
