package vkp;
import vkp.FileOperations;
import vkp.HandleOptions;
import vkp.MenuOptions;
public class LockedMeMain {

	public static void main(String[] args) {
		
		// Create "lock" folder if not present in current folder structure
		FileOperations.createMainFolderIfNotPresent("lock");
		
		MenuOptions.printWelcomeScreen("myapp", "AnushaSomaraddi");
		
		HandleOptions.handleWelcomeScreenInput();
	}

	
}
