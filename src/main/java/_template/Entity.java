package _template;

/**
 *  Created by kaim on 5/21/17.
 */
public class Entity{

    private int id;
    private int id2;
    private String name;
    private int size;
    private Entity[] sub;
    private int qty;
    public int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    protected void setName(String name) {
        this.name = name;
    }

    protected Entity(){}
    Entity(String s){setName(s);}
    public Entity (int i){setId(i);}

    @Override
    public String toString() {
        return "Entity{" +
                "name='" + name + '\'' +
                '}';
    }

}
