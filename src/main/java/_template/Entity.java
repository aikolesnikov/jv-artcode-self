package _template;

/**
 *  abstract entity - parent of material objects
 */
abstract public class Entity{
    private long id;
    private String name;
    private long capacity;
    private long size;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
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


    public Entity(){}
    public Entity(long id){this.setId(id);}

    @Override
    public String toString() {
        return name;
    }
}
