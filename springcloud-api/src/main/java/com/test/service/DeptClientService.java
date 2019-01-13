package com.test.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.model.Dept;

/**
 * 新建一个实现了FallbackFactory接口的类DeptClientServiceFallbackFactory
 */
//@FeignClient(value = "provider")
@FeignClient(value = "provider", fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {
	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	Dept get(@PathVariable("id") Integer id);

	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	List<Dept> list();

	@RequestMapping(value = "/dept/add", method = RequestMethod.POST)
	boolean add(Dept dept);
}
