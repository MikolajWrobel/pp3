
public class DrivingLicence {
    
private String name;
private String surname;
private String address;
private String postalCode;
private String city;
private String licenseNumber;
private String yearOfIssue;
private String licenseCategory;


public void displayData(){
    System.out.println("Person:" + name + surname +
    "\nAddress: " + city + postalCode + address +
    "\nLicense Number: " + licenseNumber + 
    "\nYear: " + yearOfIssue +
    "\nCategory: " + licenseCategory);
}

public String getName(){
    return name;
}
public void setName(String name){
    name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
    this.name = name;
}

public String getSurname(){
    return surname;
}
public void setSurname(String surname){
    this.surname = surname;
}

public String getAddress(){
    return address;
}
public void setAddress(String address){
    this.address = address;
}

public String getPostalCode(){
    return postalCode;
}
public void setPostalCode(String postalCode){
    this.postalCode = postalCode;
}

public String getCity(){
    return city;
}
public void setCity(String city){
    this.city = city;
}

public String getLicenceNumber(){
    return licenseNumber;
}
public void setLicenseNumber(String licenseNumber){
    this.licenseNumber = licenseNumber;
}

public String getYearOfIssue(){
    return yearOfIssue;
}
public void setYearOfIssue(String yearOfIssue){
    this.yearOfIssue = yearOfIssue;
}

public String getLicenseCategory(){
    return licenseCategory;
}
public void setLicenseCategory(String licenseCategory){
    this.licenseCategory = licenseCategory;
}

public String toString(){
    String drivingLicence = "";
    drivingLicence += getName();
    return drivingLicence;
}

public static void main(String[] args){
    DrivingLicence drivingLicence = new DrivingLicence();

    drivingLicence.name = "Jan";
    drivingLicence.surname = "Kowalski";
    System.out.println(drivingLicence);


}

}
