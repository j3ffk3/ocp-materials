package com.cas.ho.repository;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.cas.ho.bo.HelloBo;

@Component
public class HelloRepository {
	private static final List<HelloBo> hellos=new ArrayList<>();
	
	
	@PostConstruct
	public void initData() {
		HelloBo hb1=new HelloBo("Jeff Ke1", "Hello!");
		HelloBo hb2=new HelloBo("Jeff Ke2","Hey!");
		HelloBo hb3=new HelloBo("Jeff Ke3","What'up man?");
		hellos.add(hb1);
		hellos.add(hb2);
		hellos.add(hb3);
	}
	
	public List<HelloBo> findHello() {
		return hellos;
	}

}
