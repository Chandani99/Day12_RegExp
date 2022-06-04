package CitizenPackage;
import java.util.*;
import java.util.regex.Pattern;
public class Demo {
	public boolean validate(String name, String mobileNum, String aadharCard) {
		
	    int flag=0;
		if(Pattern.matches("[A-Za-z]{3,9}", name)){
			flag++;	
			
			}
		
		if(Pattern.matches("[6789]{1}[0-9]{9}", mobileNum)) {
		  flag++;	
		  
		}
		
		if(Pattern.matches("[0-9]{4}[0-9]{4}[0-9]{4}", aadharCard)) {
		  flag++;
		}
		
		if(flag==3) {
		    return true;
		}
		
		return false;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the name");
		String name=sc.next();
		
		System.out.println("Enter the aadharNumber");
		String adhar=sc.next();
		
		System.out.println("Enter the mobileNumber");
		String mobile=sc.next();
		
		Demo d1=new Demo();
		boolean check=d1.validate(name,mobile,adhar);
		
		Citizen ci=new Citizen();
		
		if(check==true) {
			ci.setName(name);
			ci.setMobileNumber(mobile);
			ci.setAadharNumber(adhar);

			System.out.println("name: "+ ci.getName());
			System.out.println("Mobile: "+ ci.getMobileNumber());
			System.out.println("Adhar: "+ ci.getAadharNumber());
		}
		else {
			System.out.println("Enter valid input !!! ");
		}
		

	}

}
