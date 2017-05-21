package _template;

/**
 *  Created by kaim on 5/21/17.
 */
public class Entity{

    private int id;
    private String name;
    private int size;
    private Entity[] sub;
    private int qty;

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Entity(String name){this.setName(name);}
}
