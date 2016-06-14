package com.haoxin.app.api.dao.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import com.haoxin.app.api.dao.ResourceDao;
import com.haoxin.app.api.model.SubResource;

@Repository
public class ResourceDaoImpl implements ResourceDao {

	private @Resource MongoTemplate mongoTemplate;

	@Override
	public List<SubResource> list(List<String> primaryKeys) {
		return mongoTemplate.find(new Query().addCriteria(new Criteria("fileInfo.androidAttributer.packageName").in(primaryKeys)), SubResource.class);		
	}
	
	

	@Override
	public Integer count(List<String> primaryKeys) {
		return (int) mongoTemplate.count(new Query().addCriteria(new Criteria("fileInfo.androidAttributer.packageName").in(primaryKeys)), SubResource.class);
	}



	@Override
	public List<SubResource> listById(List<String> primaryKeys) {
		return mongoTemplate.find(new Query().addCriteria(new Criteria("_id").in(primaryKeys)), SubResource.class);
	}

}