package chap_12.clean;

public class CleanRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("-- 직원 청소 시작 (Runnable) --");
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("(직원) " + i + "번방 청소 중 (Runnable)");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("-- 직원 청소 끝 (Runnable) --");
    }
}
