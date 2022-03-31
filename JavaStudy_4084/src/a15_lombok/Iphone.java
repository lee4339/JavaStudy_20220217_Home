package a15_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Args : 매개변수
@AllArgsConstructor // --> 매개변수가 있는 생성자(전체생성자)
@NoArgsConstructor // --> 매개변수가 없는 생성자(기본생성자)
//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
// ----하나로 묶음---->
@Data
public class Iphone {
	private int series;
	private String model;
	private String color;
	private int memorySize;
	private int releaseYear;
	
	
	
}
