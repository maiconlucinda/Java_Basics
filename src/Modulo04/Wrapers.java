package Modulo04;





// Wrappers
/* Os tipos primitivos no Java são dados básicos, são simplesmente dados armazenados na memória
* A ideia é que eles sejam rápidos e que possam consumir menos memória. Eles guardam o valor em si, não uma referencia */
/* Então surge a necessidade de usar os Wrappers, estes conseguem fazer com que um dado básico (tipos primitivos)
* funcionem como se fossem um objeto.
* Os Wrappers são classes que representam os tipos primitivos. Eles são imutáveis, uma vez criado o valor não
* pode ser mudado */

// Integer - int
// Long - long
// Float - float
// Double - double
// Short - short
// Byte - byte
// Boolean - boolean
// Character - char



// Object
/* Em java, todoo objeto é uma instancia que direta, ou indiretamente, herda da classe Object.
 * A classe object é a superclasse raíz de todas as classes em Java
 * Entendendo isso, podemos entender que até mesmo os Wrappers herdam da classe Object */



public class Wrapers {
    public static void main(String[] args) {

        /* USANDO O WRAPPERS PARA FAZER CONVERSÃO EXPLICITA */
        /* Nesse exemplo pode se notar que o número era Double, usando a Classe Wrapper foi possível converter
         * o valor para inteiro */

        double numeroDouble = 123.56;
        int numeroInt = (int) numeroDouble;
        System.out.println(numeroInt); // 123


        // Podemos usar os metodos da classe Wrapper
        Double d = 100.5656;
        Integer i = d.intValue(); // Estou dizendo que o integer sera o valor inteiro da minha variavel Double
        System.out.println(i); // 100


        // CONVERTENDO STRING PARA INTEGER
        // Só é possível porque estamos usando um métodoo da classe Integer
        String num = "100";
        int i = Integer.parseInt(num);
        System.out.println(i);
    }
}


