public class StringTrim{
    public static void main ( String[] args ){
        String str = new String( "    Hello WOrld    " );

        String second = str.trim();

        System.out.println(second);
    }
}