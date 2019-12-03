package pacck8;

import org.springframework.stereotype.Service;

import paccck8.OfficeInf;

@Service
public class OfficeService {
	public OfficeInf AllService() {
		
		OfficeInf oi = new OfficeInf();
		oi.setName("Appartment Office");
		oi.setAddress("2276 penbury ct. # 204 woodbridge VA");
		oi.setPhoNum("7039620040");
		oi.setMail("hadi286@icloud.com");
		return oi;
		
	}

}
