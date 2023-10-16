public class Student implements Comparable<Student> {
    private String Name;
    private String Surname;
    private int Age;
    private String nameOfGroup;

    public String getNameofGroup() {
        return nameOfGroup;
    }

    public Student(String name, String surname, int age, String nameofGroup) {
        Name = name;
        Surname = surname;
        Age = age;
        this.nameOfGroup = nameofGroup;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public int getAge() {
        return Age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Age=" + Age +
                ", nameofGroup='" + nameOfGroup + '\'' +
                '}';
    }

    public int compareTo(Student another) {
        return this.nameOfGroup.compareTo(another.getNameofGroup());
    }

}