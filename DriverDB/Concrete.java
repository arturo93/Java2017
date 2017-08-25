public class Concrete extends Creator 
{

    public void create (String typeDriver)
    {
        if(typeDriver.compareTo("MongoDB")==0)
    
        {
            driver = new DriverDBMongo();
            ((DriverDBMongo)driver).AbrirConexion();
            ((DriverDBMongo)driver).EstablecerPropiedades();
            ((DriverDBMongo)driver).CrearLogFile();
        }
        
    }
}
