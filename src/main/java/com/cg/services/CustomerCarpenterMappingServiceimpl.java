package com.cg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cg.dao.CustomerCarpenterMappingDao;
import com.cg.entities.Carpenter;
import com.cg.entities.Carpenters;
import com.cg.entities.Customer;
import com.cg.entities.CustomerCarpenterMapping;
import com.cg.entities.Customers;

// service layer implementation for customer carpenter mapping

@Service("CustomerCarpenterMappingService")
public class CustomerCarpenterMappingServiceimpl implements CustomerCarpenterMappingService{

	@Autowired
	RestTemplate rest;
	
	@Autowired
	CustomerCarpenterMappingDao customerCarpenterMappingDao;
	
	
	// book carpenter on the base of the availability
	@Override
	public String bookCarpenter(String phone,Integer id) {
		Customers customer = rest.getForObject("http://customer-service/customer/findAll", Customers.class);
		Carpenters carpenter = rest.getForObject("http://carpenter-service/carpenter/findAll", Carpenters.class);
		List<Customer> customers = customer.getCustomers();
		List<Carpenter> carpenters = carpenter.getCarpenters();
		boolean isCustomerFound = false;
		Integer customerId=0;
		for(Customer c : customers)
		{
			if(c.getPhoneNumber().equals(phone))
			{
				customerId = c.getCustomerId();
				isCustomerFound = true;
				break;
			}
		}
		if(!isCustomerFound)
		{
			return "Customer Not Found";
		}
		Integer carpenterId=0;
		boolean isCarpenterFound = false;
		for(Carpenter ca : carpenters)
		{
			if(ca.getCarpenterId() == id && ca.getCarpenterStatus().equals("available"))
			{
				carpenterId = id;
				isCarpenterFound = true;
				break;
			}
		}
		if(!isCarpenterFound)
		{
			return "Carpenter Not Found";
		}
		CustomerCarpenterMapping customerCarpenterMapping = new CustomerCarpenterMapping(customerId, carpenterId);
		customerCarpenterMappingDao.saveAndFlush(customerCarpenterMapping);
		return "Added: " + customerCarpenterMapping; 
	}

}
