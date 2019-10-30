package com.stf.test.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stf.test.demo.vo.UserVO;

/**
 * @Description: 用户控制类
 * @author: STF
 * @创建日期: 2019年10月29日 下午2:58:56
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

	@GetMapping(value = "/getUser")
	public UserVO getUserInfo() {

		return new UserVO(123543543L, "Test1", 25, "男性");

	}

}
