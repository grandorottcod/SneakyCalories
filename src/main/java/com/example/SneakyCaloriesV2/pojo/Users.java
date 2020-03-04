package com.example.SneakyCaloriesV2.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table( name = "USERS")
public class Users {
    @Id 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_generator")
    @SequenceGenerator(name="author_generator", sequenceName = "USERS_ID_SEQUENCE", allocationSize=1)
    @Column(name = "ID", updatable = false, nullable = false)
    private int userID;
    
	@Column(name = "USERNAME")
    private String username;
    
    @Column(name = "PASSWORD")
    private String password;
    
    @Column(name = "NAME")
    private String name;
    
    @Column(name = "LAST_NAME")
    private String lastName;
    
    public int getUserID() {
  		return userID;
  	}

  	public void setUserID(int userID) {
  		this.userID = userID;
  	}

  	public String getUsername() {
  		return username;
  	}

  	public void setUsername(String username) {
  		this.username = username;
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

  	public void setName(String name) {
  		this.name = name;
  	}

  	public String getLastName() {
  		return lastName;
  	}

  	public void setLastName(String lastName) {
  		this.lastName = lastName;
  	}
}
