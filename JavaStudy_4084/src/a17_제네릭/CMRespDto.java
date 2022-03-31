package a17_제네릭;

<<<<<<< HEAD
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

=======
>>>>>>> 02201352d113ea97d366337115d599e7e532ce19
// DAO(Data Access Object) : 데이터베이스의 data에 접근하기 위한 객체
// DTO(Data Transfer Object) : 계층 간 데이터 교환을 하기 위해 사용하는 객체 ----> 로직을 가지지 않는 순수한 데이터 객체
// VO(Value Object) : 값 오브젝트로써 값을 위해 쓰임, read - Only특징

<<<<<<< HEAD
@NoArgsConstructor
@AllArgsConstructor
@Data

=======
>>>>>>> 02201352d113ea97d366337115d599e7e532ce19
public class CMRespDto<T> {
	private int code; // 1(성공), -1(실패)
	private String message;
	private T data;
}
