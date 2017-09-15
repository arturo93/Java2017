public class Iterator<T>
{
    protected Collection<T> collection;
    int cont;
    public Iterator(Collection<T> collection)
    {
        this.collection=collection;
        cont = 0;
    }
    boolean hasNext()
    {
        if (cont< collection.length())
        
            return true;
            return false;
        }
       public T next ()
        {
            return collection.at(cont++);
        }
    
}
