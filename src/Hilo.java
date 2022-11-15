public class Hilo extends Thread {
    /**
     * Sobrescrive el metodo run para ejecutar un bucle infinito imprimiendo un mensaje con el nombre de hilo y un tiempo de espera aleatorio entre 1 y 10
     */
    @Override
    public void run() {
        do {
            try {
                System.out.println("Soy el bucle " + Thread.currentThread().getName() + " y estoy trabajando");//Mensaje con el nombre del hilo
                Thread.sleep((int) (Math.random() * 9000 + 1000));//Esperamos un tiemp aleatorio
            } catch (InterruptedException e) {
                System.out.println("Error, el hilo a sido interrumpido");
            }
        } while (true);
    }
}
