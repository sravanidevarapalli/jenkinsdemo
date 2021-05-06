package com.cg;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import com.cg.dao.AdminDao;
import com.cg.entities.Admin;
import com.cg.services.AdminServicesImpl;


@ExtendWith(MockitoExtension.class)
@RunWith(MockitoJUnitRunner.class)

public class TestAdminDao {
	@InjectMocks
	AdminServicesImpl service;
	@Mock
	AdminDao dao;

	@Test
	public void getAllAdminTest()
	{
		System.out.println("Testing being done");
		List<Admin> list = new ArrayList<>();
		Admin adminOne = new Admin(1, "abcd", "abc@gmail.com","1234512345", "HDFC","123456123456", "12345612341", 15000);
		Admin adminTwo = new Admin(2, "pqrs", "pqrs@gmail.com","1234512366", "SBI","123456123488", "12345612342", 25000);
		Admin adminThree = new Admin(3, "zxcv", "zxcv@gmail.com","1234512377", "AXIS","123456123499", "12345612345", 35000);
		list.add(adminOne);
		list.add(adminTwo);
		list.add(adminThree);
		when(dao.findAll()).thenReturn(list);
		List<Admin> adminList = service.getAllAdmins();
		assertEquals(3, adminList.size());
		verify(dao, times(1)).findAll();
	}
}