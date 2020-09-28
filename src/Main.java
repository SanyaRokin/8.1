public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Создаю потоки...");
        ThreadGroup mainGroup = new ThreadGroup("main group");
        int threadCount = 5;
        MyThread[] threads = new MyThread[threadCount];
        for (int i = 1; i < threadCount; i++) {
            threads[i] = new MyThread(mainGroup, Integer.toString(i));
            threads[i].start();
        }
        Thread.sleep(15000);
        mainGroup.interrupt();

    }
}
