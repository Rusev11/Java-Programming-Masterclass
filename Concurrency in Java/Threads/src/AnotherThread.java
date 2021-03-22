
public class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println(ThreadColor.ANSI_BLUE + "Hallo from another thread.");
    }
}
