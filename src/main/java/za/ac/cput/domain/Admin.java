package za.ac.cput.domain;

public class Admin {

    private int adminId;
    private String firstName;
    private String lastName;
    private Contact contact;
    private Address address;


    private Admin() {
    }
    public Admin(Builder build){
        this.adminId= build.adminID;
        this.firstName= build.firstName;
        this.lastName=build.lastName;
        this.contact=build.contact;
        this.address= build.address;

    }

    public int getAdminId() {
        return adminId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Contact getContact() {
        return contact;
    }
    public Address getAddress(){
        return address;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminId=" + adminId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", contact=" + contact +
                ", address=" + address +
                '}';
    }

    public static class Builder{
        private int adminID;
        private String firstName;
        private String lastName;
        private Contact contact;
        private Address address;


        public Builder setAdminID(int adminID) {
            this.adminID = adminID;
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

        public Builder setContact(Contact contact) {
            this.contact = contact;
            return this;
        }

        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }
        public Builder copy(Admin admin){
            this.adminID= admin.adminId;
            this.firstName=admin.firstName;
            this.lastName=admin.lastName;
            this.address=admin.address;
            this.contact=admin.contact;

            return this;
        }
        public Admin Build(){
            return new Admin(this);
        }
    }
}

