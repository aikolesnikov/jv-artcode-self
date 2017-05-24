package _template;

import java.util.logging.Logger;

/**
 * abstract entity - parent of material objects
 */
public class Entity {
    private long id;
    private String name = "default";
    private long capacity;
    private Entity[] subEntities;
    private long size;

    long getId() {
        return id;
    }

    void setId(long id) {
        this.id = id;
    }

    Entity[] getSubEntities() {
        return subEntities;
    }

    public void setSubEntities(Entity[] subEntities) {
        this.subEntities = subEntities;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    private Logger l = Logger.getLogger(this.getClass().getName());

    public Entity() {
    }

    public Entity(long id, String name) {
        this.setId(id);
        if ((name == null) || (name.equals(""))) {
            l.warning("Entity (" + id + ") as been created with default name.");
        } else {
            this.setName(name);
            l.info("Entity (" + id + ", " + name + ") has been created.");
        }
    }


    @Override
    public String toString() {
        // l.info("Object print request");
        return name;
    }
}
