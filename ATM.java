import java.util.Scanner;
class ATM
{
	public static void main(String[] args) 
	{
	    
	    long mobileNumber = 8106167381L;
		int pin = 7381;
		Double balance = 10000.00;
		int count = 0;
		boolean entered = false;
		System.out.println("Please Enter mobile number");
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		System.out.println("Please Enter your pin");
		int b = sc.nextInt();
		if(mobileNumber == A && pin == b){
			System.out.println("Select Options");
			System.out.println("1.Withdraw");
			System.out.println("2.Deposit");
			System.out.println("3.check Balance");
			int c = sc.nextInt();
			if(c == 1){
				System.out.println("Enter Amount to Withdraw");
				Double d = sc.nextDouble();
				if(d > balance){
					System.out.println("Insuffiencient Balance");
					System.out.println("Your Updated Balance is : " + balance);
				}
				else{
					balance = balance - d;
					System.out.println("Withdrawn Successfull");
					System.out.println("Your Updated Balance is : " + balance);
				}

		    }
			if(c == 2){
				System.out.println("Enter Amount to Deposit");
				Double e = sc.nextDouble();
				balance = balance + e;
				System.out.println("Deposited successfull");
				System.out.println("Your Updated Balance is : " + balance);
			}
			if(c == 3){
				System.out.println("Your Balance : " + balance);
			}
			if(c != 1 && c != 2 && c != 3){
				System.out.println("Please select from the options");
			}
		}
		else{
			while(count < 2 && (mobileNumber != A || pin != b)){
				count++;
				System.out.println("You have entered invalid credentials");
	            System.out.println("Please Enter correct Mobile Number");
				A = sc.nextLong();
				System.out.println("Please Enter Your pin");
				b = sc.nextInt();

				if(A == mobileNumber && b == pin){
					entered = true;

					System.out.println("Select Options");
			System.out.println("1.Withdraw");
			System.out.println("2.Deposit");
			System.out.println("3.check Balance");
			int c = sc.nextInt();
			if(c == 1){
				System.out.println("Enter Amount to Withdraw");
				Double d = sc.nextDouble();
				if(d > balance){
					System.out.println("Insuffiencient Balance");
					System.out.println("Your Updated Balance is : " + balance);
				}
				else{
					balance = balance - d;
					System.out.println("Withdrawn Successfull");
					System.out.println("Your Updated Balance is : " + balance);
				}

		    }
			if(c == 2){
				System.out.println("Enter Amount to Deposit");
				Double e = sc.nextDouble();
				balance = balance + e;
				System.out.println("Deposited successfull");
				System.out.println("Your Updated Balance is : " + balance);
			}
			if(c == 3){
				System.out.println("Your Balance : " + balance);
			}
			if(c != 1 && c != 2 && c != 3){
				System.out.println("Please select from the options");
			}

				}

				
			}
		}
		if(count >= 2 && entered == false){
			System.out.println("You Exceded the limited Attempts");
			System.out.println("Your card is blocked for 24 hours");
		}
			
		
		
  }
}
