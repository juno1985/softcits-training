package org.softcits.spring.service;

import javax.inject.Inject;

import org.softcits.spring.dao.SpringGroupDao;
import org.softcits.spring.model.Group;
import org.springframework.stereotype.Service;
@Service("groupService")
public class GroupService {
	@Inject
	private SpringGroupDao springGroupDao;
	
	public void deleteGroup(int id){
		Group g = springGroupDao.load(id);
		if(g == null) {
				System.out.println("没有该部门!");
				return;
		}
		else{
			springGroupDao.delete(id);
		}
	}
	
	public void addGroup(Group g){

		if(springGroupDao.load(g.getId()) != null){
			System.out.println("部门已经存在!");
		}else{
			springGroupDao.insert(g);
		}
	}
}
