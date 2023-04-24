public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    Alimento a1 = new Alimento(23.00,200,  new Data(12, 4, 2023));
    Alimento a2 = new Alimento(70, 400);

    Vegetais v1 = new Vegetais(23.00,200,  new Data(12, 4, 2023), 0.5, "orgânicos", "Fruta");
    Vegetais v2 = new Vegetais(23.00,200,  new Data(12, 4, 2023), 0.5, "Fruta");

    Carne c1 = new Carne(23.00,200,  new Data(12, 4, 2023), "Ave", "Peito", "Maturatta");
    Carne c2 = new Carne(23.00,200,  new Data(12, 4, 2023), "Ave", "Peito", "Premium");


}