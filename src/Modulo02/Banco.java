package Modulo02;

public class Banco {
    public static void main(String[] args) {
        ContaCorrente contaJoao = new ContaCorrente(1234, 1, "Joao", "12/01/2000", 700);
        ContaCorrente contaMaria = new ContaCorrente(4567, 2, "Maria", "12/01/19080", 500);

        contaJoao.transferirValor(contaMaria, 200);
        contaJoao.sacarValor(50);
        contaMaria.sacarValor(20);

        System.out.println("\nExtrato de Joao");
        contaJoao.consultarExtrato();
        contaJoao.consultarSaldo();

        System.out.println("\nExtrato de Maria");
        contaMaria.consultarExtrato();
        contaMaria.consultarSaldo();

    }
}
