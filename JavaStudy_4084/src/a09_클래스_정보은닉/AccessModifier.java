package a09_클래스_정보은닉;
/**
 * 접근지정자(AccessModifier)
 * 
 * default(package private) : 같은 패키지 내에서만 접근이 가능하다. 
 * 							  (앞에 접근지정자 생략)아무런 접근 지정자도 없을 경우 이 옵션이 자동으로 적용된다.
 * 
 * protected : 같은 패키지 내에서 접근이 가능하고 다른 패키지에서도 상속을 받은 클래스 내부에서는 사용 가능하다. 
 * 			   public과 다른 점은 다른 패키지의 자식 클래스 외부에서는 접근할 수 없다는 것이다.
 * 
 * public : 공개 정도가 가장 높고 어디에서든 자유롭게 접근할 수 있다.
 * 
 * private : 동일 클래스 내에서만 접근이 가능한 가장 낮은 단계의 자유도를 갖는다.
 *
 */

public class AccessModifier {
	String name;
	protected int age;
	public String phone;
	private String address;
	
	public AccessModifier() {
		this.address = "부산";
	}
	
}
