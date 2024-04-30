public class stringbuffer_and_stringbulider {
    public static void main(String[] args) {
        //String Buffer and String Builder
        //Change to Builder for StringBuilder

        StringBuffer buffer=new StringBuffer("Hello");
        System.out.println(buffer);
        buffer.append(" world");
        System.out.println(buffer);

        //Inserting value at particular location
        buffer.insert(11,"  Welcome");
        System.out.println(buffer);

        //Replace value in StringBuffer
        buffer.replace(11,12,"*");
        System.out.println(buffer);

        //delete
        buffer.delete(11,12);
        System.out.println(buffer);

        //Reverse
        buffer.reverse();
        System.out.println(buffer);

        //Charat slecting
        System.out.println(buffer.charAt(5));
        System.out.println(buffer.length());
        System.out.println(buffer.substring(5));

        //Replacing character at specific loc
        buffer.reverse();
        buffer.setCharAt(5,'-');
        System.out.println(buffer);

        StringBuffer b=new StringBuffer("Java");
        System.out.println(b);
        b.append("Lang");
        System.out.println(b);
        System.out.println(b.capacity());

    }
}
