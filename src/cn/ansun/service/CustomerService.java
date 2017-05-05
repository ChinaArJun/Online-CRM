package cn.ansun.service;

import java.util.List;

import cn.ansun.pojo.BaseDict;
import cn.ansun.pojo.Customer;
import cn.ansun.pojo.QueryVo;

public interface CustomerService {
	
	public List<BaseDict> findDictByCode(String code);
	
	public List<Customer> findCustomerByVo(QueryVo vo);
	
	public Integer findCustomerByVoCount(QueryVo vo);
	
	public Customer findCustomerById(Long id);
	
	public void updateCustomerState(Customer customer);
	// 删除用户
	public void deleteCustomer(Long id);
}
