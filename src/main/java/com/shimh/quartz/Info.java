package com.shimh.quartz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleTrigger;
import org.quartz.impl.JobDetailImpl;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.calendar.AnnualCalendar;
import org.quartz.impl.triggers.SimpleTriggerImpl;
import org.springframework.aop.interceptor.ConcurrencyThrottleInterceptor;
import org.springframework.beans.factory.config.MethodInvokingFactoryBean;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.MethodInvokingJobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.scheduling.quartz.SimpleTriggerFactoryBean;

public class Info {
	
	
	public static void main(String[] args) throws Exception {
		//Job
		//JobDetail
		//Trigger
		//Calendar 在trigger的基础上进行排除
		//Scheduler
		
		//TriggerUtils  快速创建Trigger
		
		//---- Spring
		//JobDetailFactoryBean
		//MethodInvokingJobDetailFactoryBean
		//SimpleTriggerFactoryBean
		//CronTriggerFactoryBean
		//SchedulerFactoryBean
		
		test1();
		test2();
	}
	//Calendar 每小时运行一次，排除五一  十一
	private static void test2() throws Exception {

		SchedulerFactory sf = new StdSchedulerFactory();
		Scheduler s = sf.getScheduler();
		
		AnnualCalendar ac = new AnnualCalendar();
		
		Calendar c1 = Calendar.getInstance();
		c1.add(Calendar.MONTH, 5);
		c1.add(Calendar.DATE, 1);
		
		Calendar c2 = Calendar.getInstance();
		c2.add(Calendar.MONTH, 10);
		c2.add(Calendar.DATE, 1);
		
		ac.setDaysExcluded((ArrayList<Calendar>) Arrays.asList(c1,c2));
		
		
		s.addCalendar("holidays", ac, false, false);
		
		JobDetail jd = new JobDetailImpl("job_1", "jgroup_1", SimpleJob.class);
		
		
		SimpleTriggerImpl st = new SimpleTriggerImpl("trigger_1", "tgroup_1",
				new Date(),null,SimpleTrigger.REPEAT_INDEFINITELY,60*60*1000);
		st.setCalendarName("holidays");
		
		s.scheduleJob(jd, st);
		s.start();
	}

	//SimpleTrigger
	private static void test1() throws Exception {
		JobDetail jd = new JobDetailImpl("job_1", "jgroup_1", SimpleJob.class);
		
		SimpleTriggerImpl st = new SimpleTriggerImpl("trigger_1", "tgroup_1");
		st.setStartTime(new Date());
		st.setRepeatCount(10);
		st.setRepeatInterval(2000);
		
		SchedulerFactory sf = new StdSchedulerFactory();
		Scheduler s = sf.getScheduler();
		s.scheduleJob(jd, st);
		
		s.start();
	}
	

}
