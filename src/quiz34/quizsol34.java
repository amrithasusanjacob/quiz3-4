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
		//number of times c and p appears in the sentence 
		int pn=0,cn=0;
		for(int i=0;i<l;i++)
		{
			if(s.charAt(i)=='c')
			{
				cn=cn+1;
			}
			else if(s.charAt(i)=='p')
			{
				pn=pn+1;
			}
		}
		System.out.println("Number of times c appears : "+cn);
		System.out.println("Number of times p appears : "+pn);
	}

}
