/*  Gender.java
    Gender POJO class
    Author: AsandaNdhlela (230614345)
    Date: 11 May 2025
*/
package za.ac.cput.domain;

public class Seller extends Student{
    protected int sellerId;
    protected String sellerName;
    protected String sellerLastName;
    protected String sellerEmail;
    protected String sellerPhoneNumber;

    private Seller(){
        super();
    }
    private Seller(Builder build) {
        super(build);

        this.sellerId = build.sellerId;
        this.sellerName = build.sellerName;
        this.sellerLastName = build.sellerLastName;
        this.sellerEmail = build.sellerEmail;
        this.sellerPhoneNumber = build.sellerPhoneNumber;
    }
    public int getSellerId() {
        return sellerId;
    }
    public String getSellerName() {
        return sellerName;
    }
    public String getSellerLastName() {
        return sellerLastName;
    }
    public String getSellerEmail() {
        return sellerEmail;
    }
    public String getSellerPhoneNumber() {
        return sellerPhoneNumber;
    }
    @Override
    public String toString() {
        return "Seller{" +
                "sellerId=" + sellerId +
                ", sellerName='" + sellerName + '\'' +
                ", sellerLastName='" + sellerLastName + '\'' +
                ", sellerEmail='" + sellerEmail + '\'' +
                ", sellerPhoneNumber='" + sellerPhoneNumber + '\'' +
                '}';
    }

    public static class Builder extends Student.Builder{
        private int sellerId;
        private String sellerName;
        private String sellerLastName;
        private String sellerEmail;
        private String sellerPhoneNumber;

        public Builder setSellerId(int sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public Builder setSellerName(String sellerName) {
            this.sellerName = sellerName;
            return this;
        }
        public Builder setSellerLastName(String sellerLastName) {
            this.sellerLastName = sellerLastName;
            return this;
        }
        public Builder setSellerEmail(String sellerEmail) {
            this.sellerEmail = sellerEmail;
            return this;
        }
        public Builder setSellerPhoneNumber(String sellerPhoneNumber) {
            this.sellerPhoneNumber = sellerPhoneNumber;
            return this;
        }

        public Builder copy(Seller seller){
            super.copy(seller);

            this.sellerId = seller.sellerId;
            this.sellerName = seller.sellerName;
            this.sellerLastName = seller.sellerLastName;
            this.sellerEmail = seller.sellerEmail;
            this.sellerPhoneNumber = seller.sellerPhoneNumber;

            return this;
        }

        public Seller build(){
             return new Seller(this);
         }
    }
}
