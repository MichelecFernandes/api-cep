import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        SearchCep searchCep = new SearchCep();
        System.out.println("Digite  numero do cep a ser buscado:");
        var cep = leitura.nextLine();

        try {
            Address newAddress = searchCep.searchAddress(cep);
            System.out.println(newAddress);
            GenerateFile generate = new GenerateFile();
            generate.saveJson(newAddress);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação!");
        }
    }
}