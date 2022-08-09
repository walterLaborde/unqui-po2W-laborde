package ar.unqui.po2W.tp4;

public class Income {

	private Month month;
	private Motive payFor;
	private double amount;
	private double overtimeHoursAmount;
	
	// monthly salary constructor
	public Income(Month month, Motive payFor, double amount) {
		super();
		this.setMonth(month);
		this.setPayFor(payFor);
		this.setAmount(amount);
	}
	
	// overtime payment constructor
		public Income(Month month, Motive payFor, double amount, double overtimeHoursAmount) {
			super();
			this.setMonth(month);
			this.setPayFor(payFor);
			this.setAmount(amount);
			this.setOvertimeHoursAmount(overtimeHoursAmount);
		}

	private Month getMonth() {
		return month;
	}

	private void setMonth(Month month) {
		this.month = month;
	}

	private Motive getPayFor() {
		return payFor;
	}

	private void setPayFor(Motive payFor) {
		this.payFor = payFor;
	}

	private double getAmount() {
		return amount;
	}

	private void setAmount(double amount) {
		this.amount = amount;
	}
	
	private double getOvertimeHoursAmount() {
		return overtimeHoursAmount;
	}
	
	private void setOvertimeHoursAmount(double overtimeHoursAmount) {
		this.overtimeHoursAmount = overtimeHoursAmount;
	}
	
	
	//public methods
	

	double amount() {
		return this.getAmount();
	}
	
	Motive payFor() {
		return this.getPayFor();
	}
}
