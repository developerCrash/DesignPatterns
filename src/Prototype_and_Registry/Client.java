package Prototype_and_Registry;

// This class represents example for prototype and registry pattern

public class Client {

    public static void main(String[] args){
        Student march_2023 = new Student();
        march_2023.setBatchName("March ");
        march_2023.setTutor("Sandeep");

        Student april_2023 = new Student();
        april_2023.setBatchName("April");
        april_2023.setTutor("Goud");

        Student s1 = Student.copy(march_2023);
        s1.setName("Anil");
        s1.setAge(35);
        s1.setEmail("anil@gmail.com");

        Student s2 = Student.copy(march_2023);
        s2.setName("Kumar");
        s2.setAge(36);
        s2.setEmail("kumar@gmail.com");

        Student s3 = Student.copy(april_2023);
        s3.setName("Sandeep");
        s3.setAge(37);
        s3.setEmail("sandeep@gmail.com");

        Student s4 = Student.copy(april_2023);
        s4.setName("God");
        s4.setAge(38);
        s4.setEmail("god@gmail.com");

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println(s4.toString());
    }
}
