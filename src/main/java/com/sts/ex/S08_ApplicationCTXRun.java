package com.sts.ex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("run")
public class S08_ApplicationCTXRun {

	@Bean
	public S08_ServerInfo serverInfo() {
		S08_ServerInfo info = new S08_ServerInfo();
		info.setIpNum("213.186.229.29");
		info.setPortNum("80");
		
		return info;
	}
}
