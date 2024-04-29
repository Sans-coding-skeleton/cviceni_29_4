public class ThreadForMyself implements Runnable{

    @Override
    public void run() {
        for (int i = 65; i < 106; i++) {
            System.out.print((char)i+ " ");
        }
    }
}