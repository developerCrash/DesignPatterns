package Prototype_and_Registry;

public class Student {

    private String name;
    private int age;
    private String email;

    private String batchName ;
    private String tutor;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", batchName='" + batchName + '\'' +
                ", tutor='" + tutor + '\'' +
                '}';
    }

    public static Student copy(Student generic){
        Student s = new Student();
        s.setTutor(generic.tutor);
        s.setBatchName(generic.batchName);
        return s;
    }
}
