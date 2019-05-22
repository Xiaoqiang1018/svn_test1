package com.test.demo1.demo1;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.apache.commons.lang3.builder.ToStringExclude;

/**
 *
 * 从数据源和流程图中，生成一个数据库表（这个就是Activiti流程控制的关键的数据表）
 */
public class ActivitiTable {
    public static void main(String[] args) {
        creatTable();
    }

    public static void creatTable() {

        ProcessEngine processEngine = ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("activiti.cfg.xml")

                .buildProcessEngine();

    }
}
