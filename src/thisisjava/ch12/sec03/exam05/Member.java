package thisisjava.ch12.sec03.exam05;

import lombok.Data;

// 롬복 어노테이션
@Data
public class Member {

	private String id;
	private String name;
	private int age;

}