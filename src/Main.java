public class Main {
    public static void main(String[] args) {
        //Lanzamos 5 veces el hilo con un nombre distinto
        for (int i = 0; i < 5; i++) {
            Thread h=new Hilo();
            h.setName("Hilo "+i);
            h.start();
        }
    }
}