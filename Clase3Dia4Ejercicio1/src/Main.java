public class Main {
    public static void main(String[] args) {

        System.out.println("Programa para probar los objetos Java.");

        //Declaración variables
        Electrodomestico nevera = new Electrodomestico(1, "Siemems", "B015PHJ", 16.32, "Blanco");
        Electrodomestico lavadora = new Electrodomestico(2, "Balay", "P3T4HI0", 15.12, "Verde");
        Electrodomestico horno = new Electrodomestico(3, "Fujitsu", "H0RN0T40", 25.12, "Negro");
        Electrodomestico microondas = new Electrodomestico();

        System.out.println("Nevera -> Marca: "+ nevera.getMarca() + ", Modelo: "+ nevera.getModelo() + ", Consumo energético: "+ nevera.getConsumo() );
        System.out.println("Lavadora -> Marca: "+ lavadora.getMarca() + ", Modelo: "+ lavadora.getModelo() + ", Consumo energético: "+ lavadora.getConsumo() );
        System.out.println("Horno -> Marca: "+ horno.getMarca() + ", Modelo: "+ horno.getModelo() + ", Consumo energético: "+ horno.getConsumo() );
        System.out.println("Microondas -> Marca: " + microondas.getMarca() );
    }
}