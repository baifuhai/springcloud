package com.test.service;

import java.util.List;

import com.test.model.Dept;

public interface DeptService {
	public boolean add(Dept dept);

	public Dept get(Integer id);

	public List<Dept> list();
}
