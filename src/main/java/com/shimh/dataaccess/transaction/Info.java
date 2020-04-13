package com.shimh.dataaccess.transaction;

import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

/*
 * 	PlatformTransactionManager:获取开启事务
 * 		DataSourceTransactionManager jdbc或mybatis
 * 		JpaTransactionManager JPA 进行持久化
 * 		HibernateTransactionManager
	TransactionDefinition：设置事务的相关属性
		DefaultTransactionDefinition
 * 	TransactionStatus：事务过程中事务的状态
 */

public class Info {

	public static void main(String[] args) {
		//PlatformTransactionManager
		DataSourceTransactionManager dataSourceTransactionManager;
		JpaTransactionManager jpaTransactionManager;
		HibernateTransactionManager hibernateTransactionManager;
		
		TransactionDefinition transactionDefinition;
		//DefaultTransactionDefinition
		
		//TransactionStatus
		
	}
	
	


	
	
}
