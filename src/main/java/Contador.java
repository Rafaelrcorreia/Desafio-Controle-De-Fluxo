import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo: ");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite um número inteiro positivo maior que o anterior: ");
        int parametroDois = scanner.nextInt();

        try{
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++ ){
            System.out.println("Imprimindo número: " + i);
        }

    }
}
