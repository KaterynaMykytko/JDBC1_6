package org.example;

public class Customer {
    private int customerId;
    private String firstName;
    private String lastName;
    private String city;
    private int phone;

        public Customer(int customerId, String firstName, String lastName, String city, int phone) {
                this.customerId = customerId;
                this.firstName = firstName;
                this.lastName = lastName;
                this.city = city;
                this.phone = phone;
        }

        public int getCustomerId() {
                return customerId;
        }

        public void setCustomerId(int customerId) {
                this.customerId = customerId;
        }

        public String getFirstName() {
                return firstName;
        }

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        public String getLastName() {
                return lastName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }

        public String getCity() {
                return city;
        }

        public void setCity(String city) {
                this.city = city;
        }

        public int getPhone() {
                return phone;
        }

        public void setPhone(int phone) {
                this.phone = phone;
        }

        @Override
        public String toString() {
                return "Customer{" +
                        "customerId=" + customerId +
                        ", firstName='" + firstName + '\'' +
                        ", lastName='" + lastName + '\'' +
                        ", city='" + city + '\'' +
                        ", phone='" + phone + '\'' +
                        '}';
        }
}
