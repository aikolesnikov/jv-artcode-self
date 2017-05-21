package _template;

/**
 *  Created by kaim on 5/21/17.
 */
public class Entity{

    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Entity(String name){this.setName(name);}

}
