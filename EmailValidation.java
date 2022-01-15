package validationofemail;
import java.util.Scanner;

public class EmailValidation {
	

	
		public static void main(String[] args) {

			String[] emailIds = {"jhgfsjgf@hjg.com" , "siva@hjg.com", "chaitanya@hjg.com"};

			Scanner sc  = new Scanner(System.in);

			while(true) {
				String emailId = sc.next();
				System.out.println(EmailValidation .search(emailIds, emailId));
			}



		}

		static boolean search(String[] emailIds, String emailId) {

			for(String e : emailIds) {
				if(e.equals(emailId))  {
					return true;
				}
			}
			return false;
		}

}
