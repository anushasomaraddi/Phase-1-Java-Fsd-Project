package vkp;

public class MenuOptions {

	public static void printWelcomeScreen(String appName, String developerName) {
		String companyDetails = String.format("-----------------------------------------------------------\n"
				+ "** Welcome to %s.com. \n" + "** This application was developed by %s.\n"
				+ "------------------------------------------------------\n", appName, developerName);
		String appFunction = "Anyone can use this application to :-\n"
				+ "• Retrieve all file names in the \"lock\" folder\n"
				+ "• Search, add, or delete files in \"lock\" folder.\n"
				+ "\n--Please make sure that the correct filename is provided for searching or deleting files.--\n";
		System.out.println(companyDetails);

		System.out.println(appFunction);
	}

	public static void displayMenu() {
		String menu = "\n\n------ Choose any option from below and press Enter --------\n\n"
				+ "1) Retrieve all files inside \"lock\" folder\n" + "2) Display menu for File operations\n"
				+ "3) Exit program\n";
		System.out.println(menu);

	}

	public static void displayFileMenuOptions() {
		String fileMenu = "\n\n-------Select any option from below and press Enter ------\n\n"
				+ "1) Add a file to \"lock\" folder\n" + "2) Delete a file from \"lock\" folder\n"
				+ "3) Search for a file from \"lock\" folder\n" + "4) Show Previous Menu\n" + "5) Exit program\n";

		System.out.println(fileMenu);
	}

}
