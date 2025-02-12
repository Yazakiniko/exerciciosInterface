
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    String nome;
    
    System.out.println("Digite seu nome");
    nome = s.nextLine();
    System.out.println("Digite a data de nascimento");
    String inputDataNascimento = s.nextLine();
    
    DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    try{
        LocalDate dataNascimento = LocalDate.parse(inputDataNascimento, f);

        LocalDate dataAtual = LocalDate.now();

        Period p = Period.between(dataNascimento, dataAtual);
        
        System.out.println("Você " + nome + " tem " + p.getYears() + " anos ");
    }
    catch(DateTimeParseException e){
        System.out.println("Formato de data inválido");
    }
    //finally{
      //  s.close();
    //}
    System.out.println("/////////////////////////////////////////////////////////////////////////");
    System.out.println("Exercicio 2");
    System.out.println("Digite os lados do quadrado");
    int lado = s.nextInt();

    int area = areaQcalculo(lado);
    System.out.println("A área do quadrado é : " + area);


    System.out.println("/////////////////////////////////////////////////////////////////////////");
    System.out.println("Exercicio 3");
    System.out.println("Digite a base do Retangulo:");
    int base = s.nextInt();
    System.out.println("Digite a altura do Retangulo:");
    int alt = s.nextInt();
    int areaR = areaRcalculo(base, alt);
    System.out.println("A área do retangulo é: " + areaR);


    System.out.println("/////////////////////////////////////////////////////////////////////////");
    System.out.println("Exercicio 4");
    Scanner t = new Scanner(System.in);
    System.out.println("Digite o nome da primeira pessoa: ");
    String pessoa = t.nextLine(); 
    System.out.println("Digite a idade da primeira pessoa: ");
    int idade = t.nextInt(); 
    t.nextLine();
    System.out.println("Digite o nome da segunda pessoa: ");
    String pessoa2 = t.nextLine(); 
    System.out.println("Digite a idade da segunda pessoa: ");
    int idade2 = t.nextInt(); 

    int idadeD = idadeDif(idade, idade2);

    System.out.println("A diferença de idade entre " + pessoa + " e " + pessoa2 + " é: " + idadeD);
    s.close();
    
}

// Método para calcular a diferença de idade

    public static int areaQcalculo(int lado){
        return lado * lado;
    }

    public static int areaRcalculo(int base, int alt){
        return base*alt;
    }

    public static int idadeDif(int idade, int idade2) {
        return Math.abs(idade - idade2); 
    }

    }

