package quiz34;

public class quizsol34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "copyandpastecopyandpastecopyandpastecopyandpastecopyandpastecopyandpastecommitandpushcommitandpushcommitandpushcommitandpushpushcccccommmitttsss";
		//Number of characters
		int l = s.length();
		System.out.println("Length of the sentence is : "+l);
		//last 15 characters of the string
		System.out.println("Last 15 characters are :"+ s.substring(l-15, l));
	}

}
