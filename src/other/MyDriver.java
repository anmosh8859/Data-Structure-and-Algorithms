package other;

public class MyDriver {
    public static void main(String[] args) {
        Bakery bakery = new Bakery();

        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    synchronized(bakery){
                        while(bakery.getBreadCount() > 0){
                            try {
                                bakery.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        bakery.produceBread();
                        System.out.println("Bread Produced...Breads: " + bakery.getBreadCount());
                        bakery.notifyAll();
                    }
                }
            }
        });

        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    synchronized(bakery){
                        while(bakery.getBreadCount() == 0){
                            try {
                                bakery.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        bakery.consumeBread();
                        System.out.println("Bread Consumed...Breads: " + bakery.getBreadCount());
                        bakery.notifyAll();
                    }
                }
            }
        });

        producer.start();
        consumer.start();
    }
}

class Bakery {
    private int breadCount = 0;

    public void produceBread() {
        breadCount++;
    }

    public void consumeBread() {
        breadCount--;
    }

    public int getBreadCount() {
        return breadCount;
    }
}
