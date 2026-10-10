// write a program to demonstrate Thread Life Cycle Example


class LifeCycle extends Thread {

    public void run() {
        try {
            System.out.println("Thread is running");

            System.out.println("Thread is sleeping");
            Thread.sleep(2000);

            System.out.println("Thread completed");

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws Exception {

        LifeCycle t = new LifeCycle();

        System.out.println("State: " + t.getState());

        t.start();

        System.out.println("State after start: " + t.getState());

        Thread.sleep(500);

        System.out.println("State while sleeping: " + t.getState());

        t.join();

        System.out.println("State after completion: " + t.getState());
    }
}