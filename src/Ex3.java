import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int valor = teclado.nextInt();

        if(valor % 2 == 0){
            System.out.println("numero digitado é par");
            System.out.println("Podemos dizer que o numero é par, pois o resultado da divisão do numero por 2 é igual a 0");
        }else{
            System.out.println("numero digitado é impar");
            System.out.println("Podemos dizer que o numero é impar, pois o resultado da divisão do numero por 2 é diferente de 0");
        }
        teclado.close();
    }
}
