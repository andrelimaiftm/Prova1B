import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Siglas para o programa (MG, SP, RJ, MS, Outros");
        System.out.println("Digite a sigla do estado: ");
        String estado = teclado.nextLine();
        System.out.println("Digite o valor do produto");
        double valor = teclado.nextDouble();
        
        // estado == "MG"
        if(estado.equals("MG")){
            //valor  = valor + valor * 0.07
            valor += valor * 0.07;
        }else if(estado.equals("SP")){
            valor += valor * 0.12;
        }else if(estado.equals("RJ")){
            valor += valor * 0.15;
        }else if(estado.equals("MS")){
            valor += valor * 0.08;
        }else if(estado.equals("Outros")){
            valor += valor * 0.09;
        }else{
            System.out.println("Sigla errada!.");
        }
        System.out.println("O preço com imposto é: " + valor);
        teclado.close();
    }    
}
