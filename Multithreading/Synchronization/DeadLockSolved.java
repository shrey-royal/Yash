public class DeadLockSolved {
    public static void main(String[] args) {
        final String yw = "Yashvi Soni";
        final String jw = "Ruby Thakkar";

        Thread yash = new Thread() {
            public void run() {
                synchronized(yw) {
                    System.out.println("Yash locked Yashvi");
                    try {
                        Thread.sleep(100);
                    } catch(Exception e) {
                        System.out.println(e);
                    }
                    synchronized(jw) {
                        System.out.println("Yash locked Ruby");
                    }
                }
            }
        };

        Thread jaynam = new Thread() {
            public void run() {
                synchronized(yw) {
                    System.out.println("Jaynam locked Yashvi");
                    try {
                        Thread.sleep(100);
                    } catch(Exception e) {
                        System.out.println(e);
                    }
                    synchronized(jw) {
                        System.out.println("Jaynam locked Ruby");
                    }
                }
            }
        };

        yash.start();
        jaynam.start();
    }
}
