
public class FolderCommandDemo {

	public static void main(String[] args) {
	 
		FolderDevice mainFolder = new MainFolder();
		
		CreateFolder createMainFolder = new  CreateFolder(mainFolder);
		
		AccessControl createMainFoldercontrol = new AccessControl(createMainFolder);
		createMainFoldercontrol.onclick();
		
        FolderDevice subFolder = new SubFolder();
		
		CreateFolder createSubFolder = new  CreateFolder(subFolder);
		
		AccessControl createSubFoldercontrol = new AccessControl(createSubFolder);
		createSubFoldercontrol.onclick();
		
	System.out.println("\nNow deleting folders \n");
		
		DeleteFolder deleteSubfolder = new DeleteFolder(subFolder);
		AccessControl deleteSubFoldercontrol = new AccessControl(deleteSubfolder);
		deleteSubFoldercontrol.onclick();
		
		DeleteFolder deleteMainFolder = new DeleteFolder(mainFolder);
		
		AccessControl deleteMainFoldercontrol = new AccessControl(deleteMainFolder);
		deleteMainFoldercontrol.onclick();
		
		
		
	}

}
