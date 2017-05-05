package cn.ansun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ansun.dao.CustomerMapper;
import cn.ansun.dao.DictMapper;
import cn.ansun.pojo.BaseDict;
import cn.ansun.pojo.Customer;
import cn.ansun.pojo.QueryVo;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private DictMapper dictMapper;
	
	@Autowired
	private CustomerMapper  customerMapper;
	
	@Override
	public List<BaseDict> findDictByCode(String code) {
		List<BaseDict> list = dictMapper.findDictByCode(code);
		return list;
	}

	@Override
	public List<Customer> findCustomerByVo(QueryVo vo) {
		List<Customer> list = customerMapper.findCustomerByVo(vo);
		return list;
	}

	@Override
	public Integer findCustomerByVoCount(QueryVo vo) {
		Integer count = customerMapper.findCustomerByVoCount(vo);
		return count;
	}

	/*
	 * 根据id 查询用户资料
	 * */
	@Override
	public Customer findCustomerById(Long id) { 
		Customer customer = customerMapper.findCustomeById(id);
		return customer;
	}

	@Override
	public void updateCustomerState(Customer customer) {
		// TODO Auto-generated method stub
		customerMapper.updateCustomerById(customer);
	}

	@Override
	public void deleteCustomer(Long id) {
		customerMapper.deleteCustomer(id);
	}




}
