import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) throws Exception {
//        SamosaLazy s1 = SamosaLazy.getSamosa();
//        System.out.println(s1.hashCode());
//        SamosaLazy s2 = SamosaLazy.getSamosa();
//        System.out.println(s2.hashCode());

        FafdaEarly f1 = new FafdaEarly();
        System.out.println(f1.hashCode());
        FafdaEarly f2 = new FafdaEarly();
        System.out.println(f2.hashCode());

        //BREAKING SINGLETON
        //USING Reflaction api
//        Constructor<SamosaLazy> constructer = SamosaLazy.class.getDeclaredConstructor();
//        constructer.setAccessible(true);//Singleton breaked.
//        SamosaLazy s3 = constructer.newInstance();
//        System.out.println(s3.hashCode());

        //Using clone method
//        SamosaLazy s3 = (SamosaLazy)s2.clone();
//        System.out.println(s3.hashCode());
    }
}
