package oop;

public class TestTeacher {
    public static void main(String args[]) {
        Person person = new Person(); //Person reference and object
        Person another_person = new Teacher(); //Person reference, Teacher object
        Teacher teacher = new Teacher(); //Teacher reference and obj.
        person.teach();//output: Person can teach
        // Here you can see Teacher object's method is executed even-
        // -though the Person reference was used
        another_person.teach();//output: Teacher can teach in a school
        another_person.teach();//output: Teacher can teach in a school

        teacher.methodTeach();
    }
}