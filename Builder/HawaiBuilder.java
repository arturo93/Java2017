public class HawaiBuilder extends Builder 
{
    public Hamburguesa buildHamburguesa ()
    {
        return new Hawaiana();
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
        Carne c = new Carne ();
        hamburguesa.setCarne(c);

    }
    public void buildPina()
    {
        Pina ñ = new Pina();
        hamburguesa.setPina(ñ);
    }
}