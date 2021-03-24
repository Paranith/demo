package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String nic;
    private String email;
    private String gender;
    private Date dateOfBirth;
    private String userName;
    private Date joinedDate;
    private String joinedPosition;
    private int branchId;
    private int companyId;
    private String report;
    private String doorNumber;
    private String streetName;
    private String city;
    private String landlineNumber;
    private String mobileNumber;
    private String nameofImmidiateContact;
    private String immidiateContactnumber;
    private String relationshipwithImmidiateContact;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(Date joinedDate) {
        this.joinedDate = joinedDate;
    }

    public String getJoinedPosition() {
        return joinedPosition;
    }

    public void setJoinedPosition(String joinedPosition) {
        this.joinedPosition = joinedPosition;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public String getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(String doorNumber) {
        this.doorNumber = doorNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLandlineNumber() {
        return landlineNumber;
    }

    public void setLandlineNumber(String landlineNumber) {
        this.landlineNumber = landlineNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getNameofImmidiateContact() {
        return nameofImmidiateContact;
    }

    public void setNameofImmidiateContact(String nameofImmidiateContact) {
        this.nameofImmidiateContact = nameofImmidiateContact;
    }

    public String getImmidiateContactnumber() {
        return immidiateContactnumber;
    }

    public void setImmidiateContactnumber(String immidiateContactnumber) {
        this.immidiateContactnumber = immidiateContactnumber;
    }

    public String getRelationshipwithImmidiateContact() {
        return relationshipwithImmidiateContact;
    }

    public void setRelationshipwithImmidiateContact(String relationshipwithImmidiateContact) {
        this.relationshipwithImmidiateContact = relationshipwithImmidiateContact;
    }
}
