package com.sts.ex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class S08_ApplicationCTXDev {

	@Bean
	public S08_ServerInfo serverInfo() {
		S08_ServerInfo info = new S08_ServerInfo();
		info.setIpNum("localhost");
		info.setPortNum("8181");
		
		return info;
	}
}
