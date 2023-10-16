import java.util.Comparator;

public class StudentComporator implements Comparator<Student> {

    public int compare(Student one, Student two) {
        if (one.getAge() == two.getAge())
            return 0;
         else if (one.getAge() > two.getAge())
            return 1;
        else
            return -1;
    }

}

