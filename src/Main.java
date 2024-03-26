public class Main {
    public static void main(String[] args) {


        System.out.println( assertEquals( formatName("NAGLIS"),"Naglis"));
        System.out.println( assertEquals( formatName("Naglis"),"Naglis"));
        System.out.println( assertEquals( formatName("Naglid"),"Naglis"));
        System.out.println( assertEquals( formatName("naglis"),"Naglis"));
        System.out.println( assertEquals( formatName("nAGLIS"),"Naglis"));
    }
    public static String formatName(String name){
        return name;//suformatuotas Namecase
    }
    public static boolean assertEquals(String actual, String expected) {
        return actual.equals(expected);
    }
}