package org.zerock.sample;

import org.springframework.stereotype.Component;


import lombok.Getter;
import lombok.ToString;

@Component
@ToString
@Getter
public class SampleHotel {
//Spring 4.3이후 자동으로 @Autowired 주입
	
	private Chef chef;
	
	
	public SampleHotel(Chef chef) {
		this.chef = chef;
	}

}
