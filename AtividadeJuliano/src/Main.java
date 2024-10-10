public class Main {
    public static void main(String[] args) {
        FormaManager formaManager = new FormaManager();
        try {
            formaManager.addForma(null, "vermelho", 10);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        formaManager.addForma("0,1", "vermelho", 10);
        formaManager.addForma("1,1", "verde", 20);
        formaManager.addForma("5,4", "vermelho", 30);
        formaManager.addForma("2,0", "verde", 40);
        formaManager.addForma("6,7", "azul", 50);

        try {
            formaManager.addForma("3,3", null, 60);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            formaManager.addForma("4,4", "azul", -1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        formaManager.mostrar();
    }
}