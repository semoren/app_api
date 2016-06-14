package com.haoxin.app.api.dao;

import java.util.List;
import com.haoxin.app.api.model.SubResource;

public interface ResourceDao {

	public List<SubResource> list(List<String> primaryKeys);
	
	public List<SubResource> listById(List<String> primaryKeys);

	public Integer count(List<String> primaryKeys);
}
