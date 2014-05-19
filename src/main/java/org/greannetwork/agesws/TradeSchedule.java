/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.greannetwork.agesws;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

/**
 *
 * @author San
 */
public class TradeSchedule {
    public static void main(String[] args) throws SchedulerException {
        EURUSD();
        GBPJPY();
    }

    private static void EURUSD() throws SchedulerException {
        JobDetail job = JobBuilder
                .newJob(JobTradeUp.class)
                .withIdentity("JobTradeUp")
                .build();
        
        Trigger trigger = TriggerBuilder
                .newTrigger()
                .withIdentity("JobTradeUp")
                .withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(60).repeatForever())
                .build();
        
        Scheduler scheduler = new StdSchedulerFactory().getScheduler();
        scheduler.start();
        scheduler.scheduleJob(job,trigger);
    }
    
    private static void GBPJPY() throws SchedulerException {
        JobDetail job = JobBuilder
                .newJob(JobTradeUpGBPJPY.class)
                .withIdentity("JobTradeUpGBPJPY")
                .build();
        
        Trigger trigger = TriggerBuilder
                .newTrigger()
                .withIdentity("JobTradeUpGBPJPY")
                .withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(60).repeatForever())
                .build();
        
        Scheduler scheduler = new StdSchedulerFactory().getScheduler();
        scheduler.start();
        scheduler.scheduleJob(job,trigger);
    }
}
