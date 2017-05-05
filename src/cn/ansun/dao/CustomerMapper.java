package cn.ansun.dao;

import java.util.List;

import cn.ansun.pojo.Customer;
import cn.ansun.pojo.QueryVo;

public interface CustomerMapper {
	
	public List<Customer> findCustomerByVo (QueryVo vo);
	public Integer findCustomerByVoCount(QueryVo vo);
	
	public Customer findCustomeById(Long id);
	
	public void updateCustomerById(Customer customer);
	public void deleteCustomer(Long id);
}
