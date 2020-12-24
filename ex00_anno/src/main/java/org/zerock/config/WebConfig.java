package org.zerock.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//web.xml대신 모든사용자(controller,servlet)에 적용될 내용
public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
	
		return new Class[] {RootConfig.class};//RootConfig.java 연결사용
				
		
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		return null;
	}

	@Override
	protected String[] getServletMappings() {
		
		return null;
	}

}
