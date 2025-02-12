
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
        
        System.out.println(" Você " + nome + " tem " + p.getYears() + " anos ");
    }
    catch(DateTimeParseException e){
        System.out.println("Formato de data inválido");
    }
    finally{
        s.close();
    }
    }
}
