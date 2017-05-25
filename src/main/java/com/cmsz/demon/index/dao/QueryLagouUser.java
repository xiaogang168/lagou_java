package com.cmsz.demon.index.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.cmsz.demon.index.model.LagouUser;

@Repository
public interface QueryLagouUser {
	public  List<LagouUser> queryLagouUser();

}
