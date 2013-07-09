package ch1;

public class Main {
	public static void main(String[] args) {
		Business business;
		try {
			business = BusinessFactory.getInstance().getBusiness();
			business.save();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
