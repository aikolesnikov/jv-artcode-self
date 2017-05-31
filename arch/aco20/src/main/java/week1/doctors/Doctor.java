package week1.doctors;

/**
 *  Created by kaim on 5/21/17.
 */
abstract class Doctor {
    private String name;
    private int age;
    private boolean hasScinceDegry;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHasScinceDegry() {
        return hasScinceDegry;
    }

    public void setHasScinceDegry(boolean hasScinceDegry) {
        this.hasScinceDegry = hasScinceDegry;
    }

}
