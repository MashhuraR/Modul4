package IkkinchiMavzu.BirinchiVazifa;

public class Counter {
    private int sum=0;
    public synchronized void counter(){
        setSum(getSum()+1);
    }

    public synchronized  int getSum() {
        return sum;
    }

    public synchronized void setSum( int sum) {
        this.sum = sum;
    }

}
