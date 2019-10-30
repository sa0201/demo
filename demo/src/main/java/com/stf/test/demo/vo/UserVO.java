
package com.stf.test.demo.vo;

import java.io.Serializable;

public class UserVO implements Serializable {

	private static final long serialVersionUID = -1316380326535482525L;
	private Long id;
	private String userName;
	private Integer age;
	private String userSex;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public UserVO(Long id, String userName, Integer age, String userSex) {
		super();
		this.id = id;
		this.userName = userName;
		this.age = age;
		this.userSex = userSex;
	}

	@Override
	public String toString() {
		return "UserVO [id=" + id + ", userName=" + userName + ", age=" + age + ", userSex=" + userSex + "]";
	}

}
