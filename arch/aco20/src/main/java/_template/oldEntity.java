package _template;

/**
 * abstract entity - parent of material objects
 */
public class oldEntity {
    private long id;
    private String name = "default";
    private long capacity;
    private oldEntity[] subEntities;
    private long size;

    long getId() {
        return id;
    }

    void setId(long id) {
        this.id = id;
    }

    oldEntity[] getSubEntities() {
        return subEntities;
    }

    public void setSubEntities(oldEntity[] subEntities) {
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


    public oldEntity() {
    }

    public oldEntity(long id, String name) {
        // Logger l = Logger.getLogger(this.getClass().getName());

        this.setId(id);

        if ((name == null) || (name.equals(""))) {
           // l.warning("Entity (" + id + ") has been created with default name.");
            System.out.println("Entity (" + id +
                    ") has been created with default name.");
        } else {
            this.setName(name);
            //l.info("Entity (" + id + ", " + name + ") has been created.");
        }
    }


    @Override
    public String toString() {
        // l.info("Object print request");
        return name;
    }
}
