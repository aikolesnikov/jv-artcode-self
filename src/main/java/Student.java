/**
 * student
 */
class Student {
    private String name;
    private String surname;
    private int age;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getSurname() {
        return surname;
    }

    void setSurname(String surname) {
        this.surname = surname;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    Student() {
    }

    Student(String name) {
        this.name = name;
    }

    Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student: {" + ((this.name == null) ? "" : name) + ((this.surname == null) ? "" : (" " + surname)) + '}';
    }

@Override
public boolean equals(Object o) {
    if ((o == null) || (!(o.getClass() == this.getClass()))) return false;
    Student tmpO = (Student) o;
    return (tmpO.age == age) &&
            (tmpO.name != null) && (name != null) && (tmpO.name.equals(name)) &&
            (tmpO.surname != null) && (surname != null) && (tmpO.surname.equals(surname));
}

/*
        return tmpO != null &&
                // tmpO instanceof Student &&
                tmpO.getClass() == this.getClass() &&
                this.toString().equals(tmpO.toString());
*/

}
