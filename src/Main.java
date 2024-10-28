public class Main {
    public static void main(String[] args) {
        SearchCep searchCep = new SearchCep();
        try {
            Address newAddress = searchCep.searchAddress("1");
            System.out.println(newAddress);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicaçaão!");
        }
    }
}