package a11_상속2;

public class DeliveryCompany extends Company {
	public DeliveryCompany() {
		super();
	}
	
	public DeliveryCompany(String companyName) {
		super(companyName + " 배달 대행업체");
		//super.setCompanyName(companyName);
	}
	
	@Override
	public void setCompanyName(String companyName) {
		super.setCompanyName(companyName + "배달 대행업체");
	}
	
	public void addMotorcycle() {
		System.out.println(super.getCompanyName() + " 배달용 오토바이를 추가합니다.");
	}
}
