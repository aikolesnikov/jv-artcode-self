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
    public boolean equals(Object st) {
        return st != null &&
                // st instanceof Student &&
                st.getClass() == this.getClass() &&
                this.toString().equals(st.toString());
    }
}
