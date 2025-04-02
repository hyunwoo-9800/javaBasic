package thisisjava.ch12.sec03.exam05;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//롬복 어노테이션
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member2 {

	private String id;
	private String name;
	private int age;

}