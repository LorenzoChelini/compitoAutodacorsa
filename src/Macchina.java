public class Macchina extends Thread{
    private String scuderia;
    private String pilota;
    private Box box;
    public Macchina(String scuderia, String pilota,Box b) {
        this.scuderia = scuderia;
        this.pilota = pilota;
        box = b;
    }
    public void run(){
        for (int i = 1; i < 11;i++) {
            int sec=(int)(Math.random() * 4)+1;
            sec=sec*1000;
            try {
                sleep(sec);
            } catch (Exception e) {
                e.getMessage();
            }
            System.out.println("La "+scuderia+" guidata da "+pilota+" ha completato "+i+" giri");
            if (i%3==-0) {
                box.P();
                System.out.println("La "+scuderia+" guidata da "+pilota+" ha cambiato le gomme al PIT-STOP");
                box.V();
            }
        }
        System.out.println("La "+scuderia+" guidata da "+pilota+" ha completato la corsa!!!!");
    }
}
