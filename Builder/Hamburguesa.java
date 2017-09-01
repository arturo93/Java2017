public abstract class Hamburguesa 
{
    public abstract void getHamburguesaType();
    public void setPina(Pina pina)
    {
        this.pina = pina;
    }
    public void setCarne(Carne carne)
    {
        this.carne = carne ;
    }
    public void setJitomate(Jitomate jitomate)
    {
        this.jitomate = jitomate;
    }
    public void setPan(Pan pan)
    {
        this.pan = pan;
    }

    protected Pan pan ;
    protected Jitomate jitomate ;
    protected Pina pina ;
    protected Carne carne;
    
}
