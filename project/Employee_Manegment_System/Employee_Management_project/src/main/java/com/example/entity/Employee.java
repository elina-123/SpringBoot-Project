package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Table(name="Employee")
@Builder
public class Employee {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name="Myid",length=11)
    private int id;
	@Column(name="Myname",length=30)
    private String name;
	@Column(name="Myage",length=15)
    private int age;
	@Column(name="Mystate",length=11)
    private String state;
	@Column(name="Mytype",length=11)
    private String type;
	@Column(name="Mysalary")
    private int salary;

	public Employee() {

	}

	public Employee(int id, String name, int age, String state, String type, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.state = state;
		this.type = type;
		this.salary = salary;
	}

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", state=" + state + ", type=" + type
				+ ", salary=" + salary + ", getId()=" + getId() + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getState()=" + getState() + ", getType()=" + getType() + ", getSalary()=" + getSalary()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
