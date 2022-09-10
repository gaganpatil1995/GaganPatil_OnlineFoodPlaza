package com.masai.service;

import java.util.List;
import java.util.Optional;

import com.masai.repository.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.masai.entity.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class CustomerServiceImpl implements CustomerService {
    
	@Autowired
	CustomerDao customerDao ;
	
	
	
	@Override
	public Customer addCustomer(Customer customer) {
	
		
		
		return customerDao.save(customer);
	}



	@Override
	public List<Customer> getAllCustomer() {
		return customerDao.findAll();
	}

    
	
	
	
	
}
//	@Autowired
//	private CustomerDao customerDao;
//	@Override
//	public Customer addCustomer(Customer customer) {
//		// TODO Auto-generated method stub
//		Customer customer1 = customerDao.save(customer);
//		return customer1;
//	}
//
//	@Override
//	public Customer updateCustomer(Customer customer) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Customer removeCustomer(Customer customer) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
////	public Customer viewCustomer(Customer customer) {
////		// TODO Auto-generated method stub
////
////		return null;
////	}
//	@Override
//	public Customer viewCustomer(Integer id) {
//		Optional<Customer> opt = customerDao.findById(id);
//		Customer customer = opt.get();
//		return customer;
//	}
//
//	@Override
//	public Customer viewAllCustomers(List<Customer> customer) {
//		// TODO Auto-generated method stub
//		return null;
//	}


