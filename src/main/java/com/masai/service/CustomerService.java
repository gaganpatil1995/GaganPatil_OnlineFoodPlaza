package com.masai.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.masai.entity.Customer;
@Service
public interface CustomerService {

	public Customer addCustomer(Customer customer) ;
	public List<Customer> getAllCustomer() ;
	
	
}
	//	
//	public Customer addCustomer(Customer customer);
//	public Customer updateCustomer(Customer customer);
//	public Customer removeCustomer(Customer customer);
//	public Customer viewCustomer(Integer id);
//	public Customer viewAllCustomers(List<Customer> customer);

