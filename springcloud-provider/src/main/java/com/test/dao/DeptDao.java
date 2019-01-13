package com.test.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.test.model.Dept;

@Mapper
public interface DeptDao {
	public boolean addDept(Dept dept);

	public Dept findById(Integer id);

	public List<Dept> findAll();
}
