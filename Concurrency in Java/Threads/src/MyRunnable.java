public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(ThreadColor.ANSI_RED + "Hello of MyRunnable`s implementation of run()");
    }
}
