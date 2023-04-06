
public class InverteString {
	public static void main(String[] args) {
		InverteString teste = new InverteString();
		System.out.println(teste.inverter("Abacate"));
	}
	public String inverter(String s) {
		String reverse="";
		for(int i =(s.length()-1);i>=0;i--) {
			reverse+=s.charAt(i);
		}
		return reverse;
	}
}
