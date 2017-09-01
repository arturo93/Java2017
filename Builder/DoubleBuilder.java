public class DoubleBuilder extends Builder 
{
    public Hamburguesa buildHamburguesa ()
    {
        return new DoubleHamburguesa();
    }
    public void buildJitomate()
    {
        Jitomate j = new Jitomate();
        hamburguesa.setJitomate(j);

    }
    public void buildPan ()
    {
        Pan p = new Pan ();
        hamburguesa.setPan(p);
    }
    public void buildCarne()
    {
        System.out.println("Tiene doble carne");

    }
    public void buildPina()
    {
        System.out.println("No tiene piña");
    }
}