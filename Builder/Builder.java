public abstract class Builder 
{
    protected Hamburguesa hamburguesa ;
    public abstract Hamburguesa buildHamburguesa();
    public abstract void buildPan ();
    public abstract void buildJitomate ();
    public abstract void buildPina ();
    public abstract void buildCarne ();
    
   public Hamburguesa getHamburguesa()
   {
       return hamburguesa ;
   }
   public void createHamburguesa()
   {
    
       hamburguesa = buildHamburguesa();
       buildCarne();
       buildJitomate();
       buildPina();
       buildPan();
    }
}