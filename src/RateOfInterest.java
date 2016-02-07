
public class RateOfInterest {
public static void main(String[] args) {
	
	BankRBI bRbi = new BankRBI();
	BankIcIcI icici = new BankIcIcI();
	BankCITI citi = new BankCITI();
	
	System.out.println("RBI ="+ bRbi.returnRateInterest());
	System.out.println("ICICI ="+ icici.returnRateInterest());
	System.out.println("citi ="+citi.returnRateInterest());

}
}
