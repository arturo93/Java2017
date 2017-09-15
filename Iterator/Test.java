public class Test 
{
    public static void main(String[]args)
     { Collection<String> strs=new Collection<String>(10);
        strs.add("hola");
        strs.add("como has estado");
        strs.add("tal vez me hayas olvidado");
        
        System.out.println(""+ strs.at(2));
        Iterator it = strs.getIterator();
        while (it.hasNext())
         {
            System.out.println(""+it.next());
        }
    }
}