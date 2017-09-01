public class Test 
{
    public static void main(String[] args)
    {
        Director d = new Director();
        Hamburguesa h = d.orderHamburguesa("Hawaiana");
        Hamburguesa dob = d.orderHamburguesa("Doble");

        dob.getHamburguesaType();
    }
}