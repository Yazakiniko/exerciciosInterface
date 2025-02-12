import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) throws Exception {
        System.out.print("Digite um numero:");
        Scanner s = new Scanner(System.in);
        
        int numero = s.nextInt();

        for (int i = 0; i < 10; i++) {
            int result = numero * i;
            System.out.println( numero + " x " + i + " = " + result);
        }

        System.out.println("/////////////////////////////////////////////////////////////////////////");

        System.out.println("Exercicio 2 ");
        System.out.println("Digite sua altura e peso");
        System.out.println("Peso: ");
        double peso = s.nextDouble();
        System.out.println("Altura: ");
        double altura = s.nextDouble();
        double imc = calculoImc( peso,  altura);
        System.out.printf("Seu IMC é: %.2f\n", imc);

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Peso ideal");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Obesidade Grau II (Severa)");
        } else {
            System.out.println("Obesidade III (Mórbida)");
        }

        System.out.println("/////////////////////////////////////////////////////////////////////////");

        System.out.println("Exercicio 3");
        System.out.println("Digite um numero: ");
        int num = s.nextInt();
        int num2;

        do {
            System.out.print("Digite o segundo número (maior que o primeiro): ");
            num2 = s.nextInt();
        } while (num2 <= num);

        System.out.print("Escolha entre 'par' ou 'impar': ");
        String escolha = s.next().toLowerCase();

        if (escolha.equals("par")) {
            System.out.println("Números pares no intervalo:");
            for (int i = num2; i >= num; i--) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        } else if (escolha.equals("impar")) {
            System.out.println("Números ímpares no intervalo:");
            for (int i = num2; i >= num; i--) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("Opção inválida! Escolha 'par' ou 'impar'.");
        }


        System.out.println("/////////////////////////////////////////////////////////////////////////");

        System.out.println("Exercicio 4 ");
        System.out.println("Digite um numero: ");
        int x = s.nextInt();
        boolean continuar = true;

        while (continuar) {

            System.out.print("Digite outro número (ou um número menor que o inicial para ignorar): ");
            int segundoN = s.nextInt();


            if (segundoN < x) {
                System.out.println("Número ignorado. O número deve ser maior ou igual ao número inicial.");
                continue; 
            }


            if (segundoN % x != 0) {
                System.out.println("Resto diferente de 0! Execução encerrada.");
                continuar = false;
            }
        }

        s.close();

    }

    public static double calculoImc (double peso, double altura ){
       
        return  peso/(altura * altura);
    }

    

}
