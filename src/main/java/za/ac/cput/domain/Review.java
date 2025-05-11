package za.ac.cput.domain;

public class Review {

    private String reviewId;
    private Product product;
    private String status;

    private Review(){

    }
    private Review(Builder builder){
        this.status = builder.status;

        this.reviewId  = builder.reviewId;
        this.product = builder.product;

    }

    public String getReviewId() {
        return reviewId;
    }

    public Product getProduct() {
        return product;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Review{" +
                "reviewId='" + reviewId + '\'' +
                ", product=" + product +
                ", status='" + status + '\'' +
                '}';
    }

    public static class Builder{
        private String reviewId;
        private Product product;
        private String status;

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Builder setProduct(Product product) {
            this.product = product;
            return this;
        }

        public Builder setReviewId(String reviewId) {
            this.reviewId = reviewId;
            return this;
        }

        public void copy(Builder builder){

            this.reviewId  = builder.reviewId;
            this.product = builder.product;
            this.status = builder.status;

        }
        public Review build(){
            return new Review(this);
        }




    }
}
