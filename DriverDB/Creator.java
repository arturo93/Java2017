public abstract class Creator 
{
    public abstract void create (String typeDriver);
    public Driver factoryMethod(String typeDriver)
    {
        
        create(typeDriver);
        return driver ;
    }
    protected Driver driver;
}