package Modulo01;

/* HISTORIA DO JAVA */
/* A ideia inicial era ter uma solucao para dispositivos eletronicos intgligentes.
* A Sun financiou uma pesquisa que teve o nome Green em 1991.
* O desenvolvimento da linguagem foi baseada em C e C++, seu criador foi James Gasling. */


/* MOTIVACOES */
/* A ideia era criar um interpretador para pequenos dispositivos, facilitando a reescrita de software para aparelehos
* eletronicos. */


/* PRINCIPAIS CARACTERISTICAS */
/* - Independente de plataforma: programadas Java são compilados para uma forma intermediária (bytecode)
* - Orientada a objetos: Java é uma linguagem puramente orientada a objetos; tudo são classes ou instancias, com exceção dos tipos primitivos
* - Coletor de Lixo (Garbage Collector): Possui um mecanismo automatico de gerenciamento de memória
* - Permite Multithrearing: Recurso que permite o desenvovimento de aplicações que executam ações concorrentemente */


/* COMPONENTES JAVA */
/* JDK: Composto do compilador (javac + JVM) */
/* JRE: Java Runtime Enviromment, é um JVM que permite a execução de softwares em Java */




public class M01Introducao {
    public static void main(String[] args) {
        System.out.println("My First Class Java..");
    }
}


/* MÉTODOO MAIN */
/* O nome da classe não importa para o Java rodar, no entanto para a JVM iniciar o código, ele vai buscar
* pelo métodoo Main e esse métodoo precisa ter uma assinatura específica
*   public static void main(String[] args) - Significa que esse é o métodoo Main e recebe qualquer string que for digitada na CLI através do array Strings, esse array depois recebe o nome de args */


