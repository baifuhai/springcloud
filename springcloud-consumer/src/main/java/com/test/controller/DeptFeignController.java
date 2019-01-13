package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.Dept;
import com.test.service.DeptClientService;

@RestController
public class DeptFeignController {
	
	@Autowired
	private DeptClientService deptClientService;

	@RequestMapping(value = "/consumer2/dept/add")
	public boolean add(Dept dept) {
		return deptClientService.add(dept);
	}

	@RequestMapping(value = "/consumer2/dept/get/{id}")
	public Dept get(@PathVariable("id") Integer id) {
		return deptClientService.get(id);
	}

	@RequestMapping(value = "/consumer2/dept/list")
	public List<Dept> list() {
		return deptClientService.list();
	}

}
