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

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Entity(){}
    public Entity(String s){setName(s);}
    public Entity (int i){setId(i);}

}
