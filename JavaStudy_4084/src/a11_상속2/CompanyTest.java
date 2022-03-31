package a11_상속2;

public class CompanyTest {

	public static void main(String[] args) {
		ElectronicsCompany samsung = new ElectronicsCompany("삼성");
		ElectronicsCompany lg = new ElectronicsCompany("LG");
		DeliveryCompany baemin = new DeliveryCompany("배달의 민족");
		DeliveryCompany yogiyo = new DeliveryCompany("요기요");
		
		samsung.setCompanyName("삼숭"); //오버라이딩이 안되어있으면 삼숭만 출력.
		
		Company samsung_company = samsung;
		Company lg_company = lg;
		Company baemin_company = baemin;
		Company yogiyo_company = yogiyo;
		
		samsung_company.setCompanyName("삼성");
		
		
		samsung.showCompanyInfo();
		lg.showCompanyInfo();
		baemin.showCompanyInfo();
		yogiyo.showCompanyInfo();
		
		samsung.addFactory();
		lg.addFactory();
		baemin.addMotorcycle();
		yogiyo.addMotorcycle();
		
		samsung_company.showCompanyInfo();
		ElectronicsCompany down_samsung_company = (ElectronicsCompany)samsung_company;
		down_samsung_company.addFactory();
		
		
		Company c = new Company();
		c.setCompanyName("삼성");
		c.showCompanyInfo(); // 자식객체가 없고 업캐스팅된 객체가 아니여서 오버라이드가된 매체가 없다.

	}

}
