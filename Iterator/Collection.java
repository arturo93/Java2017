
public class Collection <T>
{

    public Collection(int size)
    {
        arreglo = new Object[size];
        cont =0;
        }
    protected Object [] arreglo;
    protected int cont;
        
    
    public T at (int idx)
    {
        return (T)arreglo[idx];
    }
    public void add (T element)
    {
        if(cont < arreglo.length)
        {
            arreglo[cont] = element;
            cont++;
        }
    }
            Iterator getIterator()
            {
                return new Iterator (this);
            }

            public int length()
            {
                return cont;
            }
            
}
