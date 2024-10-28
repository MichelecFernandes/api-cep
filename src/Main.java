public class Main {
    public static void main(String[] args) {
        SearchCep searchCep = new SearchCep();
        Address newAddress = searchCep.searchAddress("37540000");
        System.out.println(newAddress);
    }
}