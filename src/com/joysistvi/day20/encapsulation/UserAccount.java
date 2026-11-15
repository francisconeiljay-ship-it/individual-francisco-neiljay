package com.joysistvi.day20.encapsulation;

public class UserAccount {

        private String firstName;
        private String middleName;
        private String lastName;
        private String address;
        private String email;
        private String password;

        public UserAccount(String firstName, String middleName, String lastName, String address, String email, String password) {
            this.firstName = firstName.trim();
            this.middleName = middleName.trim();
            this.lastName = lastName.trim();
            this.address = address.trim();
            setEmail(email);
            setPassword(password);
        }

        public String getFirstName() { return firstName; }
        public String getMiddleName() { return middleName; }
        public String getLastName() { return lastName; }
        public String getAddress() { return address; }
        public String getEmail() { return email; }
        public String getPassword() { return password; }

        public void setFirstName(String firstName) { this.firstName = firstName.trim(); }
        public void setMiddleName(String middleName) { this.middleName = middleName.trim(); }
        public void setLastName(String lastName) { this.lastName = lastName.trim(); }
        public void setAddress(String address) { this.address = address.trim(); }


        public void setEmail(String email) {
            if (email != null && email.contains("@") && email.contains(".")) {
                this.email = email.trim();
            } else {
                System.out.println("Invalid email format.");
            }
        }

        public void setPassword(String password) {
            if (password != null && password.length() >= 8 && password.matches(".*[A-Za-z].*") && password.matches(".*\\d.*")) {
                this.password = password;
            } else {
                System.out.println("Invalid password. Must be at least 8 characters with letters and numbers.");
            }
        }

        public String toString() {
            return "--- Welcome to Facebook ---\n" +
                    "Full Name: " + firstName + " " + middleName + " " + lastName + "\n" +
                    "Address: " + address + "\n" +
                    "Email: " + email;
        }
}

