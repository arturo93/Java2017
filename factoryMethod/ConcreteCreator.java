public class ConcreteCreator extends Creator 
{

    public void create (String typeProduct)
    {
        if(typeProduct.compareTo("Product")==0)
    
        {
            product = new Product();
            ((Product)product).construirParteUno();
            ((Product)product).construirParteDos();
        }
        if(typeProduct.compareTo("Product2")==0)
        
            {
                product = new Product2();
                ((Product2)product).complex1();
                ((Product2)product).complex2();
            }
    }
}

