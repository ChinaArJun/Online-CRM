package cn.ansun.dao;

import java.util.List;

import cn.ansun.pojo.BaseDict;

public interface DictMapper {
	
	public List<BaseDict> findDictByCode (String code);
	
}
