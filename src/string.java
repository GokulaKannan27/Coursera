public class string {
    public static void main(String[] args) {
        //String in java
        String a="Hello World";
        String b="hello World";
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a.length());
        System.out.println(a.charAt(0));
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(a);
        System.out.println("contains :"+a.contains("Hello"));
        System.out.println("empty :"+a.isEmpty());
        System.out.println("Endswith:"+a.endsWith("rld"));
        System.out.println("Startswith:"+a.startsWith("Hell"));
        System.out.println("Replace :"+a.replace("World","Gokul"));
        String d=a.replace("World","Gokul");
        System.out.println(a.substring(0,4));
        System.out.println(a.substring(5));
        char[] array=a.toCharArray();
        for(char c:array)
        {
            System.out.println(c);
        }
        String e=" Hello";
        System.out.println(e.length());
        System.out.println(e.trim());
        System.out.println(e.trim().length());
    }
}
