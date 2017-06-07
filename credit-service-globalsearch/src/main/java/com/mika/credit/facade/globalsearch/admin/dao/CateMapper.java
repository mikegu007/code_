package com.mika.credit.facade.globalsearch.admin.dao;



import com.mika.credit.facade.globalsearch.admin.model.Cate;

import java.util.List;

public interface CateMapper {

	Cate queryById(String id);
	List<Cate> queryAll();
	int add(Cate cate);
	int mod(Cate cate);
	int del(String id);
	List<Cate> queryCateAndMenu();
}