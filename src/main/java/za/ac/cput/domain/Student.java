package za.ac.cput.domain;
//import za.ac.cput.domain.demography.Identity;
//import za.ac.cput.domain.demography.Gender;

public class Student {
    protected int studentNumber;
    protected String firstName;
    protected String lastName;
//    protected Identity identity ;
//  protected Residence residence;
//  protected Contact contact;
   // protected Gender gender;

    protected Student(){}

    protected Student(Builder build){
        this.studentNumber = build.studentNumber;
        this.firstName = build.firstName;
        this.lastName = build.lastName;
        //this.identity = build.identity;
        //this.residence = build.residence;
        //this.contact = build.contact;
    }
    public int getStudentId() {
        return studentNumber;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    //public Identity getIdentity() {}
    //public Residence getResidence() {}
    //public Contact getContact() {}

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                //", identity=" + identity +
                //", residence=" + residence +
                //", contact=" + contact +
                '}';
    }
    public static class Builder{
        private int studentNumber;
        private String firstName;
        private String lastName;
        //private Identity identity;
        //private Residence residence;
        //private Contact contact;

        public Builder setStudentId(int studentNumber) {
            this.studentNumber = studentNumber;
            return this;
        }
        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
       // public Builder setIdentity(Identity identity) {}
       // public Builder setResidence(Residence residence) {}
       // public Builder setContact(Contact contact) {}

        public Builder copy(Student student){
            this.studentNumber = student.studentNumber;
            this.firstName = student.firstName;
            this.lastName = student.lastName;
            //this.identity = student.identity;
            //this.residence = student.residence;
            //this.contact = student.contact;
            return this;
    }

        public Student build(){
            return new Student(this);
        }
    }
}
