package assignment;

public abstract class StudentAthlete {
private String IName;
private int eagleID;
private String gender;
private String year;

public StudentAthlete(String gender, String year, int eID) {
	this.gender = gender;
	this.year = year;
	this.eagleID = eID;
}

public String getIName() {
	return IName;
}

public void setIName(String iName) {
	IName = iName;
}

public int getEagleID() {
	return eagleID;
}

public void setEagleID(int eagleID) {
	this.eagleID = eagleID;
}

public String getGender() {
	return gender;
}

public void setGender(String Gender) {
	this.gender = Gender;
}

public String getYear() {
	return year;
}

public void setYear(String Designation) {
	this.year = Designation;
}

}