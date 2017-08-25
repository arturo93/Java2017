public class Test
{
    public static void main(String[] args)
    {
        Creator c = new ConcreteCreator();
      

        Papi p = c.factoryMethod("Product2");
        Papi p1 = c.factoryMethod("Product");
    
    }
}