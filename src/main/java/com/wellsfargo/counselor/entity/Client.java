package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
    public class Client {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long clientId;

        @Column(nullable = false)
        private String firstName;

        @Column(nullable = false)
        private String lastName;

        @Column(nullable = false)
        private String address;

        @Column(nullable = false)
        private String phone;

        @ManyToOne
        @JoinColumn(name = "advisor_id")
        private Advisor advisor;

        @OneToOne(mappedBy = "client", cascade = CascadeType.ALL)
        private Portfolio portfolio;

        protected Client() {
        }

        public Client(String firstName, String lastName, String address, String phone, Advisor advisor) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.phone = phone;
            this.advisor = advisor;
        }

        // getters and setters

    public long getClientId() {
        return clientId;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }
}