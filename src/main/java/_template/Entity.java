package _template;

/**
 * abstract entity - parent of material objects
 */
public class Entity {
    private int id;
    private String name = "default";
    // private long capacity;
    // private long size;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // public long getCapacity() {return capacity;}
    // public void setCapacity(long capacity) {this.capacity = capacity;    }
    // public long getSize() {return size;}
    // public void setSize(long size) {this.size = size;}

    public Entity() {
    }

    public Entity(int id, String name) {
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
