package Task3;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<String>(Arrays.asList("Math","History","Music"));
        Student student1 = new Student("Ole",courses);

        courses = new ArrayList<String>(Arrays.asList("Math","Sex-ed","Music","Java 1.0"));
        Student student2 = new Student("Bamse",courses);

        courses = new ArrayList<String>(Arrays.asList("Math","History","Music","Java 1.0"));
        Teacher teacher1 = new Teacher("Hans",courses);

        courses = new ArrayList<String>(Arrays.asList("Danish","CompSci","Music"));
        Teacher teacher2 = new Teacher("Marianne",courses);

        ArrayList<Person> persons = new ArrayList<>(Arrays.asList(student1,student2,teacher1,teacher2));

        for (Person person : persons) {
            boolean result = person.addCourse("Java 1.0");
            if (!result) {
                System.out.print(person.getName());
                if (person instanceof Student ) {
                    System.out.println(" har allerede bestået dette kursus.");
                } else if (person instanceof Teacher) {
                    System.out.println(" kan ikke undervise i dette fag");
                }
            }

        }
    }


}



