package com.sts.ex;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
public class S08_ApplicationCTX {

	@Value("${admin.id}")
	private String adminId;
	@Value("${admin.pw}")
	private String adminPw;
	@Value("${sub_admin.id}")
	private String sub_adminId;
	@Value("${sub_admin.pw}")
	private String sub_adminPw;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer Properties() {
		PropertySourcesPlaceholderConfigurer config = new PropertySourcesPlaceholderConfigurer();
		
		Resource[] locations = new Resource[2];
		locations[0] = new ClassPathResource("s08_admin.properties");
		locations[1] = new ClassPathResource("s08_sub_admin.properties");
		config.setLocations(locations);
		
		return config;
	}
	
	@Bean
	public S08_AdminConnection2 adminConfig() {
		S08_AdminConnection2 ac = new S08_AdminConnection2();
		ac.setAdminId(adminId);
		ac.setAdminPw(adminPw);
		ac.setSub_adminId(sub_adminId);
		ac.setSub_adminPw(sub_adminPw);
		
		return ac;
	}
	
}
