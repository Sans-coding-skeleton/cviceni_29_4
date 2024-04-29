import java.util.ArrayList;

public class ListCelychCisel extends Thread{
    private ArrayList<Integer> listCisel;
    private int max =0;
    private int min = Integer.MAX_VALUE;
    private int start;
    private int end;

    @Override
    public void run(){
        for (int i = start; i < end; i++) {
            if(listCisel.get(i) > max){
                max = listCisel.get(i);
            }
            if(listCisel.get(i)< min){
                min = listCisel.get(i);
            }
        }
    }

    public ListCelychCisel(ArrayList<Integer> listCisel, int start, int end) {
        this.listCisel = listCisel;
        this.start = start;
        this.end = end;
    }

    public ArrayList<Integer> getListCisel() {
        return listCisel;
    }

    public void setListCisel(ArrayList<Integer> listCisel) {
        this.listCisel = listCisel;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }
}
