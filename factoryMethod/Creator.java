

public abstract class Creator 
{
    public abstract void create (String typeProduct);
    public Papi factoryMethod(String typeProduct)
    {
        
        create(typeProduct);
        return product ;
    }
    protected Papi product;
}