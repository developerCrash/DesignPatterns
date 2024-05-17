package Builder;

public class Client {
    public static void main(String[] args){
        Student s = Student.builder()
                .setId(1)
                .setBatchName("LLD Main")
                .setName("Anil")
                .setPsp(89)
                .setYoe(1)
                .setGradeYear(2021)
                .build();

        System.out.println(s);
    }
}
