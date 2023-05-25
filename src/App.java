public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("INIZIO CORSA");
        Box boxx =  new Box();
        Macchina m1 = new Macchina("Ferrari", "Perez",boxx);
        Macchina m2 = new Macchina("Mercedes", "Lucas",boxx);
        Macchina m3 = new Macchina("Mclaren", "George",boxx);
        Macchina m4 = new Macchina("Redbull", "Hamilton",boxx);
        Macchina m5 = new Macchina("Lamborghini", "Leclerc",boxx);
        m1.run();
        m2.run();
        m3.run();
        m4.run();
        m5.run();
        m1.join();
        m2.join();
        m3.join();
        m4.join();
        m5.join();
        System.out.println("FINE CORSA!");

    }
}
