package _template;

/**
 * current process
 */
public class Process {
    public static void main(String[] args) {
/*
        Person p = new Person();
        p.setName("NNN");
        System.out.println(p);
*/

        NewUniver univ1 = new NewUniver("WWW");
        System.out.println(univ1);

        NewUniver univ2 = new NewUniver(2);
        System.out.println(univ2.getId());

        // Entity.out.println(gr1.getStQty());
        // Entity e = new Entity("EEE");

    }
}
