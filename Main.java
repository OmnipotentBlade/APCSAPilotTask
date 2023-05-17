public class Main {
    public static void main(String[] args) {
        
        for (int i = 0; i < 5; i++) {
            City city = Controller.dataLoad().get(i);

            System.out.println(city);
        }
    }
}
