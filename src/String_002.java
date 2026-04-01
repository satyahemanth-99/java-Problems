public class String_002 {
    static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb.capacity());
        sb.append(" World!");
        System.out.println(sb.length());
        System.out.println(sb);

        String str = sb.toString();
        System.out.println(str);

        sb.deleteCharAt(3);
        System.out.println(sb);
        sb.delete(1,5);
        System.out.println(sb);

        sb.insert(1, "olla ");
        System.out.println(sb);


        System.out.println(sb.substring(2,9));

        sb.setLength(10);
        System.out.println(sb);
    }
}
