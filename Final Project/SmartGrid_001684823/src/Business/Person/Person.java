/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.Appliances.AppliancesDirectory;

/**
 *
 * @author Raghuram
 */
public class Person {

    private String url;
    private float totalAmount;

    private String name;

    private String industryName;
    private String emailID;
    private int phoneNumber;
    private String address;
    private String city;
    private int TIN;
    private int SSN;
    private String userName;
    private String password;

    private AppliancesDirectory appliancesDirectory;

    public AppliancesDirectory getAppliancesDirectory() {
        return appliancesDirectory;
    }

    public void setAppliancesDirectory(AppliancesDirectory appliancesDirectory) {
        this.appliancesDirectory = appliancesDirectory;
    }

    public Person() {
        appliancesDirectory = new AppliancesDirectory();
        id = count;
        count++;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private int id;
    private static int count = 1;

    public int getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndustryName() {
        return industryName;
    }

    public void setIndustryName(String industryName) {
        this.industryName = industryName;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getTIN() {
        return TIN;
    }

    public void setTIN(int TIN) {
        this.TIN = TIN;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

//    @Override
//    public String toString() {
//        return name;
//    }
}
