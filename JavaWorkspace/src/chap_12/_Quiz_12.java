package chap_12;

// A 상품 준비 1/5
// B 상품 준비 1/5
//     ...
// -- A 상품 준비 완료 --
// -- B 상품 준비 완료 --
// == 세트 상품 포장 시작 ==
// 세트 상품 포장 1/5
//     ...
// == 세트 상품 포장 완료 ==

public class _Quiz_12 {
    public static void main(String[] args) {
        Runnable runnableA = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("A 상품 준비 " + i + "/5");
            };
            System.out.println(" -- A 상품 준비 완료 --");
        };

        Runnable runnableB = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("B 상품 준비 " + i + "/5");
            };
            System.out.println(" -- B 상품 준비 완료 --");
        };

        Thread threadA = new Thread(runnableA);
        Thread threadB = new Thread(runnableB);

        threadA.start();
        threadB.start();

//        while(threadA.isAlive() || threadB.isAlive()) {
//
//        }

        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Runnable runnableSet = () -> {
            System.out.println(" == 세트 상품 포장 시작 ==");
            for (int i = 1; i <= 5; i++) {
                System.out.println("세트 상품 포장 " + i + "/5");
            };
            System.out.println(" == 세트 상품 포장 완료 ==");
        };

        Thread threadSet = new Thread(runnableSet);
        threadSet.start();
    }
}
