package a09_클래스_정보은닉;

public class Car {
	private String model;
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) { // 외부에서 받기에 리턴이 필요없음
		this.model = model;
	}
}
