
public class Asda {

	int fifty, twenty, ten, five, two, one;
	int balance;

	public void showDetails(int bill, int paid) {
		balance = paid - bill;

		System.out.println("Init " + balance);
		calcBalance();
		printResults();

	}

	private void calcBalance() {

		if (balance >= 50) {
			fifty = balance / 50;
			balance %= 50;
		}

		if (balance >= 20) {
			twenty = balance / 20;
			balance %= 20;
		}

		if (balance >= 10) {
			ten = balance / 10;
			balance %= 10;
		}

		if (balance >= 5) {
			five = balance / 5;
			balance %= 5;
		}

		if (balance >= 2) {
			two = balance / 2;
			balance %= 2;
		}

		if (balance >= 1) {
			one = balance / 1;
			balance %= 1;
		}
	}

	private void printResults() {
		String ans = "";

		if (fifty > 0) {
			ans += "50 = " + fifty + "\n";
		}

		if (twenty > 0) {
			ans += "20 = " + twenty + "\n";
		}

		if (ten > 0) {
			ans += "10 = " + ten + "\n";
		}

		if (five > 0) {
			ans += "5  = " + five + "\n";
		}

		if (two > 0) {
			ans += "2  = " + two + "\n";
		}

		if (one > 0) {
			ans += "1  = " + one + "\n";
		}

		System.out.println(ans);
	}

}
