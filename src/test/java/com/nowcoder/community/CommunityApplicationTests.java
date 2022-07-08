package com.nowcoder.community;

import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
class CommunityApplicationTests implements ApplicationContextAware {

//	@Test
//	void contextLoads() {
//	}
	// 创建一个实体类并实现ApplicationContextAware接口(Spring上下文)
	private ApplicationContext applicationContext;

	// 重写接口内的setApplicationContext方法来完成获取ApplicationContext实例的方法
	@Override
	public void setApplicationContext (ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;

	}
	

	@Test
	public void testBeanConfig() {
		SimpleDateFormat simpleDateFormat = applicationContext.getBean(SimpleDateFormat.class);
		System.out.println(simpleDateFormat.format(new Date()));
	}


}
