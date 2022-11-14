package com.crud.entity;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seqno;
    private String name;
    private String department;
    private String phoneno;
    private String designation;
    private String salary;
	public Employee() {
		super();
	}
	public Employee(Long seqno, String name, String department, String phoneno, String designation, String salary) {
		super();
		this.seqno = seqno;
		this.name = name;
		this.department = department;
		this.phoneno = phoneno;
		this.designation = designation;
		this.salary = salary;
	}
	public Long getSeqno() {
		return seqno;
	}
	public void setSeqno(Long seqno) {
		this.seqno = seqno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
    
}
