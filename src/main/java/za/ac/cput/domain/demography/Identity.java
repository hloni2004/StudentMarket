/*  Identity.java
    Identity POJO class
    Author: AsandaNdhlela (230614345)
    Date: 11 May 2025
*/

package za.ac.cput.domain.demography;
import java.time.LocalDate;

public class Identity {
    protected int identityId;
    protected LocalDate dateOfBirth;
    protected String identityNumber;
    protected Gender gender;
    protected String nationality;
    protected String race;

    private Identity(){}

    private Identity(Builder build) {
        this.dateOfBirth = build.dateOfBirth;
        this.identityNumber = build.identityNumber;
        this.nationality = build.nationality;
        this.race = build.race;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public String getIdentityNumber() {
        return identityNumber;
    }
    public String getNationality() {
        return nationality;
    }
    public String getRace() {
        return race;
    }

    @Override
    public String toString() {
        return "Identity{" +
                "dateOfBirth=" + dateOfBirth +
                ", identityNumber='" + identityNumber + '\'' +
                ", nationality='" + nationality + '\'' +
                ", race= '" + race + '\'';
    }
    public static class Builder {
        private LocalDate dateOfBirth;
        private String identityNumber;
        private String nationality;
        private String race;

        public Builder setDateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }
        public Builder setIdentityNumber(String identityNumber) {
            this.identityNumber = identityNumber;
            return this;
        }
        public Builder setNationality(String nationality){
            this.nationality = nationality;
            return this;
        }
        public Builder setRace(String race){
            this.race = race;
            return this;
        }
        public Builder copy(Identity identity) {
            this.dateOfBirth = identity.dateOfBirth;
            this.identityNumber = identity.identityNumber;
            this.nationality = identity.nationality;
            this.race = identity.race;
            return this;
        }

        public Identity build() {
            return new Identity(this);
        }
    }

}

