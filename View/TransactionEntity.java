package View;

public class TransactionEntity {
	private double deposite;
	private double withdraw;
	private double bal;

	public TransactionEntity(double deposite, double withdraw, double bal) {
		super();
		this.deposite = deposite;
		this.withdraw = withdraw;
		this.bal = bal;
	}

	public TransactionEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getDeposite() {
		return deposite;
	}

	public void setDeposite(double deposite) {
		this.deposite = deposite;
	}

	public double getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	@Override
	public String toString() {
		return "TransactionEntity [deposite=" + deposite + ", withdraw=" + withdraw + ", bal=" + bal + "]";
	}


}
