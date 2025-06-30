/* PORQUE CLASSES? */
/* Chamamos de "classe" porque ela representa uma classificão genérica de um tipo de objeto.
* Seria como dizer que um determinado carro é classe A, ou seja, ele tem características (atributos)
* e comportamentos (métodos). */

/* Com as classes podemos abstrair e criar representações do mundo real para o código */

/* 99.9% das nossas classes iniciarao com public class */
/* Toda classe tera um nome */




/* MÉTODOO PRINCIPAL */
/* Esse metodo vai determinar se nossa classe é uma classe de inicialização ou de execução */


public class M02AnatomiaDasClasses {
    public static void main(String[] args) {
        System.out.println("My Second Class Java..");
    }

}

/* Recomenda-se que somente uma classe possua o métodoo main, responsável por iniciar todoo o programa */
/* O métodoo main sempre terá visibilidade public, será definido como static, não retornará nenhum valor com void
* e receberá um parâmetro do tipo array de caracteres String[] */




/* PADRAO DE NOMECLATURA */
/* Todoo aquivo .java deve começar com letra maiuscula, se a palavra for composta, a segunda palavra deve tambem ser maiuscula */




/* VARIAVEIS E METODOS */
/*VARIAVEIS*/
/* Como identificar a diferenca entre, declaracao de variaveis e metodos em Java? Existe uma estrutura para isso */
int idade = 25;
double altura = 1.98;
Dog spike; // Essa ultima nao tem valor atribuido

// Toda variavel deve ser escrita com letras minuscula, se for uma palavra composta, a segunda palavra deve comecar com letra maiuscula
// Para definir variáveis que nunca terão seus valores alterados, precisamos simplesmente de definir o nome com letras maiusculas
String BR = "Brasil";
double PI = 3.14;
int ESTADOS_BRASILEIROS = 27;

// Somente se escrito em maiusculo nao determinada que ela nao podera ser alterada, o que determina é a palavra final na frente
final String Testando = "Brasil";

/* METODOS */
/* A diferenca do metodos é que na frente, ao invés de ter tipo, teremos o que ele retorna */
// int somar(int numeroUm, int numero2);








