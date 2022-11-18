package Banking;

public class HDFCBank extends Banks implements IndiaBanking,UKBanking,USBanking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HDFCBank hobj = new HDFCBank();
		
		IndiaBanking hobj1 = new HDFCBank();
	  // hobj1.common
		UKBanking hobj2 = new HDFCBank();
		
		USBanking hobj3 = new HDFCBank();
		
		USBanking.commonStaticMethod();
		//USBanking.super.defaultMethod();
		hobj2.defaultMethod();
		hobj3.passBookServices();
	}

	@Override
	public void PersonalNoServices() {
		// TODO Auto-generated method stub
		System.out.println("US banking method");
	}

	@Override
	public void VisitServices() {
		// TODO Auto-generated method stub
		System.out.println("UK banking method");
	}

	@Override
	public void aadharServices() {
		// TODO Auto-generated method stub
		System.out.println("India banking method");
	//	  USBanking.super.defaultMethod();
		
	}

	@Override
	public void passBookServices() {
		// TODO Auto-generated method stub
		System.out.print("India banking method");
		// USBanking.super.passBookServices();
	}
	
	@Override
  public void defaultMethod()
	  {
		  USBanking.super.defaultMethod();
		  UKBanking.super.defaultMethod();
	  }



}
