package thisisjava.ch12.sec03.exam05;

import lombok.Data;
import lombok.NonNull;

//롬복 어노테이션
@Data
public class Member3 {

	private final String id;
	@NonNull
	private String name;
	private int age;

}