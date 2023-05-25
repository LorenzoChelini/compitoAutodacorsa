public class Box {
    private int stato;

    public Box() {
        stato=1;
    }

    public synchronized void P() {
        while (stato == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        stato--;
        notifyAll();
    }
    public synchronized void V(){
        stato=1;
        notify();
    }
}
