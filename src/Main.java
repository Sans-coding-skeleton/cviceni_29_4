import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
/*
        MyThread thread = new MyThread();
        ThreadForMyself thread1 = new ThreadForMyself();
        Thread t = new Thread(thread1);
        thread.start();
        t.start();
        try {
            thread.join();
            t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
*/
        int pocetDelitelu = 0;
        int cisloSnejviceDeliteli = 0;
        int nejvjetsiPocetDelitelu = 0;
        long startTime = System.currentTimeMillis();
        for (int i = 1; i < 10001; i++) {
            for (int j = 2; j < (i /2)+1; j++) {
                if (i % j == 0) {
                    pocetDelitelu++;
                }
            }
            pocetDelitelu++;
            if (pocetDelitelu > nejvjetsiPocetDelitelu) {
                nejvjetsiPocetDelitelu = pocetDelitelu;
                cisloSnejviceDeliteli = i;
            }
            pocetDelitelu = 0;
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println(nejvjetsiPocetDelitelu);
        System.out.println(cisloSnejviceDeliteli);
        System.out.println(duration + "ms");

        DelitelnostniThread delitelnostniThread = new DelitelnostniThread(1,5000);
        DelitelnostniThread delitelnostniThread1 = new DelitelnostniThread(5001,7500);
        DelitelnostniThread delitelnostniThread2 = new DelitelnostniThread(7501,10001);
        delitelnostniThread.start();
        delitelnostniThread1.start();
        delitelnostniThread2.start();

        ArrayList<Integer> arrayList = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10000000; i++) {
            arrayList.add(rnd.nextInt(10001));
        }
        DelitelnostniThread delitelnostniThread3





    }
}