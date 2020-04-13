package com.shimh.dataaccess.jdbc;

import org.springframework.dao.support.DaoSupport;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.support.lob.DefaultLobHandler;
import org.springframework.jdbc.support.lob.LobHandler;

/*
 * JdbcTemplate : 提供统一的jdbc操作    异常转义
 * NamedParameterJdbcTemplate
 * 
 * LobHandler:处理2进制数据或大文本
 * DataSourceUtils 获取connection 便于事务处理
	
 * 
 */

public class Info {

	public static void main(String[] args) {
		
		//JdbcTemplate
		//NamedParameterJdbcTemplate
		
		LobHandler handler = new DefaultLobHandler();
		//DataSourceUtils.getConnection(dataSource);
		//JdbcDaoSupport
	}
	
	


	
	
}
