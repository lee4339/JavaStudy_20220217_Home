package a11_상속;

public class TestMain {

	public static void main(String[] args) {
		Test test = new Test();
		Test test1 = new Test1();
		Test test2 = new Test2();
		
		
		// 자식 -> 부모 : 업캐스팅
		Test t1 = test1;
		Test t2 = test2; 
		
		Test[] tArray = new Test[2];
		tArray[0] = test1;
		tArray[1] = test2;
		
		
		// 부모 -> 자식 : 다운캐스팅
		Test1 tt1 = (Test1)t1;
		Test2 tt2 = (Test2)t2;
		
		//잘못된 다운캐스팅1
		Test ttt = new Test(); // --> 부모 혼자 존재
		Test ttt1 = (Test1)ttt; // --> 이런 자식을 만든적이 없어서 불가
		
		//잘못된 다운캐스팅2
		Test1 tttt1 = new Test1();
		Test tttt = tttt1; //업캐스팅
		Test2 tttt2 = (Test2)tttt; // --> 다른 자식의 형태로 부모가 다운캐스팅 불가능
		
		// 다운캐스팅은 업캐스팅이 일어났을 경우만 가능하다.
	}

}
