package hibernate_mysql_conn;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="User_Information")
public class UserInfo {
    @Id
	private String user_id;
    @Column(name = "Password" , nullable=false)
    private String password;
    @Column(name = "First Name" , nullable=false)
    private String firstName;
    @Column(name = "Last Name" , nullable=false)
	private String lastName;
	@Column(name = "User Type")
	private char userType;
	@Column(name = "Address" , nullable=false)
	private String address;    
	@Column(name = "Date of Birth")
	private Date dob;
	@Id
	@Column(name = "Social Security no" , nullable=false)
	private int ssn;
	@Column(name = "Email Id" , nullable=false)
	private String mailId;
	@Column(name = "Phone No")
	private int phoneNo;
	@Column(name = "Gender")
	private char gender;
	@Column(name = "User Status")
	private String userStatus;
	@Column(name = "Employee Id")
	private int empId;
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
	public char getUserType() {
		return userType;
	}
	public void setUserType(char userType) {
		this.userType = userType;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	
}
