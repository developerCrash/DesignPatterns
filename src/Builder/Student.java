package Builder;

import Builder.exception.InvalidGradYearException;
import Builder.exception.InvalidNameException;
import Builder.exception.InvalidYOEException;

public class Student {

    private int id ;
    private String name;
    private String batchName;
    private int yoe ;
    private int gradeYear ;
    private double psp ;

    public Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.batchName = builder.batchName;
        this.yoe = builder.yoe;
        this.gradeYear = builder.gradeYear;
        this.psp = builder.psp;
    }

    public static Builder builder(){
        Builder builder = new Builder();
        return builder ;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", batchName='" + batchName + '\'' +
                ", yoe=" + yoe +
                ", gradeYear=" + gradeYear +
                ", psp=" + psp +
                '}';
    }
    static class Builder {

        public int id ;
        public String name; // Name should not be null
        public String batchName;
        public int yoe ; // years of experience should be >= 1
        public int gradeYear ; // grad Year should be >= 2023
        public double psp ;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setBatchName(String batchName) {
            this.batchName = batchName;
            return this;
        }

        public Builder setYoe(int yoe) {
            this.yoe = yoe;
            return this;
        }

        public Builder setGradeYear(int gradeYear) {
            this.gradeYear = gradeYear;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this ;
        }

        public void validate(){

            if (name ==  null){
                throw new InvalidNameException("Name shoud not be null ");
            }
            if (yoe < 1){
                throw new InvalidYOEException("YOE should not be 0");
            }
            if (gradeYear > 2022 ){
                throw new InvalidGradYearException("Grade year should be 2022 or before");
            }
        }

        public Student build(){
            this.validate();
            Student student = new Student(this);
            return student;
        }
    }
}
