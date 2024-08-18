public class SamosaLazy implements Cloneable{
    //lazy way
    private static SamosaLazy samosa;
    private SamosaLazy() {
        // preventing from breaking
        if (samosa != null) {
            throw new RuntimeException("You are trying to create another instance");
        }
    }

    public static SamosaLazy getSamosa() {
        if (samosa == null) {
            samosa = new SamosaLazy();
        }
        return samosa;
    }
    // break singleton
//    public Object clone() throws CloneNotSupportedException{
//        return super.clone();
//    }

    //preventing from braking
    public Object clone() throws CloneNotSupportedException{
        return samosa;
    }
}
