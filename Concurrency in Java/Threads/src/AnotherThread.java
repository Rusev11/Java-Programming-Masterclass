public class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hallo from another thread.");
    }
}
