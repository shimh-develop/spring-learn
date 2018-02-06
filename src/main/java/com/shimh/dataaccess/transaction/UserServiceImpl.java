package com.shimh.dataaccess.transaction;

import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class UserServiceImpl {
	
	private PlatformTransactionManager manager;
	
	private TransactionTemplate template;
	
	public void addUser(){
		DefaultTransactionDefinition definition = new DefaultTransactionDefinition();
		definition.setTimeout(1000);
		TransactionStatus status = manager.getTransaction(definition);
		
		try{
			//业务逻辑
			
			
			
			
		}catch(Exception e){
			manager.rollback(status);
		}
		
		manager.commit(status);
	}
	
	public void deleteUser(){
		
		template.execute(new TransactionCallback<String>() {

			public String doInTransaction(TransactionStatus status) {

				try{
					
				}catch(Exception e){
					throw new RuntimeException(); //抛出异常会回滚事务
				}
				
				return null;
			}

			
		});
		
		template.execute(new TransactionCallbackWithoutResult() {
			
			
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus status) {
				boolean needRollBack = false;
				
				
				if(needRollBack){
					status.setRollbackOnly(); //回滚事务
				}

				
				
			}
		});
		
		
		
	}
	
}
