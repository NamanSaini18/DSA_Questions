package OOPS_Concepts;

public class Student implements Comparable<Student>{

    // JVM resolves the Variable Collision on the basis of Address (Written on LHS)
    String name;
    int age;
    public Student(String Name,int Age)
    {
        name = Name;
        age = Age;
    }

    @Override
    public String toString()
    {
        return "[" + "Name: " + name +" , " + "Age: " + age + "]";
    }

    @Override
    public int compareTo(Student o) {
        return this.age-o.age;
    }
}
