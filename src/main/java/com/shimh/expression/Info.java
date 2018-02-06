package com.shimh.expression;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import com.shimh.common.User;

public class Info {
	
	/*
	 * 在Spring的xml： #{。。。}
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		test1();
		test2();
		test3();
		test4();
		test5();
		test6();
		test7();
	}

	//集合过滤 ?[]
	private static void test7() {

		ExpressionParser sp = new SpelExpressionParser();
		EvaluationContext context = new StandardEvaluationContext();
		
		List<Integer> ls = Arrays.asList(1,2,3);
		
		context.setVariable("ls", ls);
		
		List l = sp.parseExpression("#ls.?[#this >= 2]").getValue(context,List.class);
		l.forEach(System.out::println);
		
	}

	private static void test6() {
		ExpressionParser sp = new SpelExpressionParser();
		User u = new User();
		EvaluationContext context = new StandardEvaluationContext(u);
		
		//赋值
		sp.parseExpression("name").setValue(context, "shimh");
		System.out.println(u.getName());
		
		//T
		
		//构造对象
		User u2 = sp.parseExpression("new com.shimh.common.User()").getValue(User.class);
		System.out.println(u2);
		
		//变量  #变量名
		context.setVariable("tempId", 1);
		sp.parseExpression("id=#tempId").getValue(context);
		System.out.println(u.getId());
		
	}

	//表达式和 ?
	private static void test5() {
		// + - * /    >  <  and or
		
		User u = new User();
		u.setId(1);
		u.setName("shimh");
		
		ExpressionParser sp = new SpelExpressionParser();
		EvaluationContext context = new StandardEvaluationContext(u);
		//? 判断是否是null
		Integer v1 = sp.parseExpression("name.length()").getValue(context,Integer.class);
		System.out.println(v1); //5
		
		u.setName(null);
		Integer v2 = sp.parseExpression("name?.length()").getValue(context,Integer.class);
		System.out.println(v2); //null
		
		
	}

	//调用方法
	private static void test4() {
		User u = new User();
		u.setId(1);
		u.setName("shimh");
		
		ExpressionParser sp = new SpelExpressionParser();
		EvaluationContext context = new StandardEvaluationContext(u);
		
		String v1 = sp.parseExpression("'abc'.substring(2)").getValue(String.class);
		System.out.println(v1);
		
		//实例方法
		String v2 = sp.parseExpression("getName()").getValue(context,String.class);
		System.out.println(v2);
		
		//静态方法
		double v3 = sp.parseExpression("T(Math).random()").getValue(context,double.class);
		System.out.println(v3);
	}

	//数组  list map
	private static void test3() {
		ExpressionParser sp = new SpelExpressionParser();
		//数组
		int[] n = (int[]) sp.parseExpression("new int[]{1,2,3,4}").getValue();
		Arrays.asList(n).forEach(System.out :: println);
		
		//list
		List l = (List) sp.parseExpression("{'a','b','c'}").getValue();
		l.forEach(System.out :: println);
		
		//map
		Map m = (Map) sp.parseExpression("{'user':'lisi','age':20}").getValue();
		
		m.forEach((a,b) -> {
			System.out.println(a + ":" + b);
		});
		
	}

	//根上下文
	private static void test2() {
		User u = new User();
		u.setName("shimh");
		u.setId(1);
		ExpressionParser sp = new SpelExpressionParser();
		
		EvaluationContext context = new StandardEvaluationContext(u);
		
		String name = (String) sp.parseExpression("name").getValue(context);
		System.out.println(name);
	}

	private static void test1() {
		ExpressionParser sp = new SpelExpressionParser();
		Expression ex = sp.parseExpression("1+2");
		
		int v = Integer.valueOf(ex.getValue().toString());
		System.out.println(v);
		
	}
}
