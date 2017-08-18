public class TestSingleton{
    public static void main (String[]args){
        Singleton instancia1 = Singleton.getInstance();
        System.out.println("Dir inst1: " + instancia1);
    }
}