package com.samplespringboot.bo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.samplespringboot.bo.api.IHello;
import com.samplespringboot.model.PPC;

@Service
public class HelloWorldManager implements IHello {

	@Value("${environment.name}")
	private String environmentName;
	
	@Value("${localhost}")
	private String localhost;

	@Value("${database}")
	private String database;

	@Value("${userid}")
	private String userid;

	@Value("${password}")
	private String password;	
	
	@Override
	public String getHelloWorld() {
		return "Hello World";
	}

	
	@Override
	public List<PPC> getList() {
		List<PPC> list = new ArrayList<>();
		list.add(new PPC("Environment name",getEnvironmentName()));
		list.add(new PPC("localhost",getLocalhost()));
		list.add(new PPC("database",getDatabase()));
		list.add(new PPC("userid",getUserid()));
		list.add(new PPC("password",getPassword()));
		
		return list;
	}

	public String getEnvironmentName() {
		return environmentName;
	}

	public void setEnvironmentName(String environmentName) {
		this.environmentName = environmentName;
	}

	public String getLocalhost() {
		return localhost;
	}

	public void setLocalhost(String localhost) {
		this.localhost = localhost;
	}

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
