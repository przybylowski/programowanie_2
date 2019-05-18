package day1;


// WRONG
// LazySingleton ls = new LazySingleton()

// GOOD
// LazySingleton ls = LazySingleton.getInstance()

public class LazySingleton_v1 {

    private LazySingleton_v1() {}

    private static LazySingleton_v1 INSTANCE = null;

    public synchronized static LazySingleton_v1 getInstance() {

        if (INSTANCE == null) {
            INSTANCE = new LazySingleton_v1();
        }

        return INSTANCE;

    }

}


class LazySingleton_v2 {
    private LazySingleton_v2() {}

    private static class LazyHolder {
        static final LazySingleton_v2 INSTANCE = new LazySingleton_v2();
    }

    public static LazySingleton_v2 getInstance() {
        return LazyHolder.INSTANCE;
    }
}


