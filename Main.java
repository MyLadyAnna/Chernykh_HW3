import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student Alex = new Student("Alex", "Popov", 21, "1b");
        Student Masha = new Student("Masha", "Ivanova", 22, "2a");
        Student Aleksandr = new Student("Aleksandr", "Popovich", 24, "3a");

        List<Student> numberoFGroup = new ArrayList<>();
        numberoFGroup.add(Alex);
        numberoFGroup.add(Masha);
        numberoFGroup.add(Aleksandr);

        /**
         first
         for (Student number:numberoFGroup) {
         System.out.println(number);
         }

         second
         System.out.println("Iteration by List:");
         for (Student student : numberoFGroup) {
         System.out.println("Name: " + student.getName());
         System.out.println("Surname: " + student.getSurname());
         System.out.println("Age: " + student.getAge());

         third
         **/
        System.out.println("iterating:");
        Iterator<Student> iterator = numberoFGroup.iterator();
        while (iterator.hasNext()) {
            Student person = iterator.next();
            System.out.println("--");
            System.out.println("Name: " + person.getName());
            System.out.println("Surname: " + person.getSurname());
            System.out.println("Age: " + person.getAge());
            System.out.println("Name of group: " + person.getNameofGroup());
        }

        ArrayList<Student> listStudents = new ArrayList<Student>();
        Student first = new Student("Vasiliy", "Ivanov", 22, "2a");
        Student second = new Student("Angelina", "Jolly", 20, "1a");
        Student third = new Student("Anna", "Koroleva", 23, "2b");
        Student fourth = new Student("Lina", "Petrova", 25, "3b");
        Student fifth = new Student("Alina", "Vasnecova", 18, "1a");

        listStudents.add(first);
        listStudents.add(second);
        listStudents.add(third);
        listStudents.add(fourth);
        listStudents.add(fifth);

        System.out.println();
        /*for (Student s: listStudents) {
            System.out.println(s);
        }*/

        StudentComporator ageComp = new StudentComporator();
        listStudents.sort(ageComp);

        System.out.println("Sorted:");
        for (Student s: listStudents) {
            System.out.println(s.getAge() + " age, " + s.getName() + " " + s.getSurname());
        }

    }

}