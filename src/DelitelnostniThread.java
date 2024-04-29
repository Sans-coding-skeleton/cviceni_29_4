public class DelitelnostniThread extends Thread {
    private int start;
    private int end;
   private int pocetDelitelu = 0;
    @Override
    public void run() {
        int cisloSnejviceDeliteli = 0;
        int nejvjetsiPocetDelitelu = 0;
        long startTime = System.currentTimeMillis();
        for (int i = start; i < end; i++) {
            for (int j = 2; j < (i / 2) + 1; j++) {
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
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getPocetDelitelu() {
        return pocetDelitelu;
    }

    public void setPocetDelitelu(int pocetDelitelu) {
        this.pocetDelitelu = pocetDelitelu;
    }

    public DelitelnostniThread(int start, int end) {
        this.start = start;
        this.end = end;
    }
}