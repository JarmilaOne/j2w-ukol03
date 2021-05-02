package cz.czechitas.java2webapps.ukol3.entity;

public class BusinessCard {
    private String name;
    private String company;
    private String street;
    private String postalCodeCity;
    private String email;
    private String phoneNumber;
    private String website;

    public BusinessCard() {
    }

    public BusinessCard(String name, String company, String street, String postalCodeCity, String email, String phoneNumber, String website) {
        this.name = name;
        this.company = company;
        this.street = street;
        this.postalCodeCity = postalCodeCity;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.website = website;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCodeCity() {
        return postalCodeCity;
    }

    public void setPostalCodeCity(String postalCodeCity) {
        this.postalCodeCity = postalCodeCity;
    }

    public String getAddress() {
        return street + ", " + postalCodeCity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public String toString() {
        return "BusinessCard{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", street='" + street + '\'' +
                ", postalCodeCity='" + postalCodeCity + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", website='" + website + '\'' +
                '}';
    }
}
