public class String_001 {
    static void main(String[] args) {
        String name = "Pandu";
        System.out.println(System.identityHashCode(name));
        name = name + "bangaram";
        System.out.println(System.identityHashCode(name));
        String s1 = "Ram";
        String s2 = "Ram";
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
    }
}
