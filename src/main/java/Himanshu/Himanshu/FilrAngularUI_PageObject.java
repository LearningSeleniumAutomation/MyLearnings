package Himanshu.Himanshu;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

//import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

public class FilrAngularUI_PageObject {
	
	public FilrAngularUI_PageObject(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	/***
	 * ----- Login page Web Elements.
	 */
	@FindBy(id = "username")
	private WebElement login_UserName;

	@FindBy(id = "password")
	private WebElement login_password;

	@FindBy(xpath = "//label[text()='User ID']")
	WebElement checkUserID;

	@FindBy(xpath = "//button[@type = 'submit']")
	WebElement login_Btn;

	@FindBy(xpath = "//div[@class='loggedin-username-header limit-text']")
	WebElement getUserName;

	@FindBy(xpath = "//span[text()=' Invalid credentials ']")
	private WebElement loginFailMessage;

	public WebElement verifyLogin_Fail_Message() {
		return loginFailMessage;
	}

	public WebElement getUserName() {
		return getUserName;
	}

	public WebElement login_Btn() {
		return login_Btn;
	}

	public WebElement loginUsername() {
		return login_UserName;
	}

	public WebElement loginPassword() {
		return login_password;
	}

	public WebElement checkUserID() {
		return checkUserID;
	}

	/***
	 * Login page Web Elements. -----
	 */

	@FindBy(xpath = "//div[contains(text(), 'Product Improvement')]")
	WebElement verifyProductImprovement;

	public WebElement verifyProductImprovement() {
		return verifyProductImprovement;
	}

	/***
	 * Logout Elements
	 */

	@FindBy(xpath = "//span[@class='hpe-icon hpe-down']")
	WebElement dropDown;

	@FindBy(xpath = "//span[text()='Sign out']")
	WebElement logout;

	public WebElement logout() {
		return logout;
	}

	public WebElement dropDown() {
		return dropDown;
	}

	/***
	 * Home Page Web element. -----
	 */
	// To Do!
	/***
	 * ----- Home Page Web element.
	 */

	/***
	 * Left Pane Web Elements. -----
	 */
	// To Do!
	@FindBy(xpath = "//a[span[@class='nav-title' and text()='Shared With Me']]")
	WebElement shared_With_Me_Tab;

	public WebElement Shared_With_Me_Tab() {
		return shared_With_Me_Tab;
	}

	/***
	 * ----- Left Pane Web Elements.
	 */

	/**
	 * ------- Create File and Folder.
	 */
	@FindBy(xpath = "//span[text()='My Files']")
	WebElement myFiles;

	@FindBy(xpath = "//span[text()='Home']")
	WebElement home;

	@FindBy(xpath = "//span[text()='Netfolders']")
	WebElement netFolders;

	@FindBy(xpath = "//span[text()='Shared With Me']")
	WebElement sharedWithMe;

	@FindBy(xpath = "//span[text()='Shared By Me']")
	WebElement sharedByMe;

	@FindBy(xpath = "//span[@class='filr-toolbar-create-folder']/button")
	WebElement createNewFolder;

	@FindBy(xpath = "//input[@name='folderName']")
	WebElement folderName;

	@FindBy(xpath = "//span[text()='Create']")
	WebElement createButton;

	@FindBy(xpath = "//span[text()=' CREATE FOLDER FAILED ']")
	WebElement createFailedMessage;

	@FindBy(xpath = "//span[contains(text(),'There is already a file or folder')]")
	WebElement createErrorMessage;

	@FindBy(xpath = "//span[text()='OK']")
	WebElement okButton;

	@FindBy(xpath = "//button[@class='btn btn-link btn-icon']")
	WebElement searchButton;

	@FindBy(xpath = "//input[@class='form-control ng-valid ng-dirty ng-touched']")
	WebElement searchInput;

	public WebElement My_Files() {
		return myFiles;
	}

	public WebElement Home() {
		return home;
	}

	public WebElement Net_Folders() {
		return netFolders;
	}

	public WebElement Shared_With_Me() {
		return sharedWithMe;
	}

	public WebElement Shared_By_Me() {
		return sharedByMe;
	}

	public WebElement createNewFolder() {
		return createNewFolder;
	}

	public WebElement folderName() {
		return folderName;
	}

	public WebElement createButton() {
		return createButton;
	}

	public WebElement createFailedMessage() {
		return createFailedMessage;
	}

	public WebElement createErrorMessage() {
		return createErrorMessage;
	}

	public WebElement okButton() {
		return okButton;
	}

	public WebElement searchButton() {
		return searchButton;
	}

	public WebElement searchInput() {
		return searchInput;
	}

	/**
	 * Upload File Element
	 */

	@FindBy(xpath = "//span[@class='filr-toolbar-upload ng-star-inserted']")
	WebElement uploadFileButton;

	@FindBy(xpath = "//button[@class='ux-focus-indicator ux-menu-item open']/span[text()='file']")
	WebElement uploadFile;

	@FindBy(xpath = "//span[contains(text(),'Failed to upload')]")
	WebElement failToUpload;

	@FindBy(xpath = "//button[@class='dismiss upload-cancel-button']")
	WebElement failToUploadCancel;

	@FindBy(xpath = "//ux-circular-progress[@aria-label='Upload progress']")
	WebElement fileUploadProgressBar;

	@FindBy(xpath = "//span[@class='notification-progress ng-star-inserted']")
	WebElement uploadingNotification;

	@FindBy(xpath = "//span[text()='Show details']")
	WebElement showDetail;

	public WebElement uploadFileButton() {
		return uploadFileButton;
	}

	public WebElement uploadFile() {
		return uploadFile;
	}

	public WebElement failToUploadMessage() {
		return failToUpload;
	}

	public WebElement uploadFailCancelButton() {
		return failToUploadCancel;
	}

	public WebElement fileUploadProgressBar() {
		return fileUploadProgressBar;
	}

	public WebElement uploadingNotification() {
		return uploadingNotification;
	}

	public WebElement showDetail() {
		return showDetail;
	}

	/***
	 * Listing the Folder
	 */
	@FindBy(xpath = "//span[contains(text(),'Items')]")
	WebElement numOfItems;

	@FindBy(xpath = "//div[@class='virtual-scroll-content']/div/div[3]")
	WebElement elementsOfPage;

	public WebElement numOfItems() {
		return numOfItems;
	}

	public WebElement elementsOfPage() {
		return elementsOfPage;
	}
	
	/***
	 * Delete File and Folder.
	 */
	
	@FindBy(xpath = "//span[text()='Delete']")
	WebElement deleteButton;
	
	public WebElement deleteButton() {
		return deleteButton;
	}

	@FindBy(xpath="//span[text()=' DELETE FAILED ']")
    WebElement deleteFailed;
	
	public WebElement deleteFailed() {
		return deleteFailed;
	}
	
	@FindBy(xpath="//div[@class='modal-body']")
    WebElement getDeleteErrorText;
	
	public WebElement getDeleteErrorText() {
		return getDeleteErrorText;
	}
	
	/***
	 * Rename File and Folder
	 */
	
	@FindBy(xpath = "//span[text()='Rename']")
	WebElement renameButton;
	
	public WebElement renameButton() {
		return renameButton;
	}
	
	
	@FindBy(xpath="//input[@name='renameEntity']")
       WebElement renameTextField;
	
	public WebElement renameTextField() {
		return renameTextField;
	}
	
	@FindBy(xpath="//span[text()=' RENAME FAILED ']")
    WebElement renameFailed;
	
	public WebElement renameFailed() {
		return renameFailed;
	}
	
	@FindBy(xpath="//div[@class='modal-body']")
    WebElement getRenameErrorText;
	
	public WebElement getRenameErrorText() {
		return getRenameErrorText;
	}
	
	
	@FindBy(xpath="//div[@class='virtual-scroll-content']/div/div[7]")
	WebElement getFileSize;
	
	public WebElement getFileSize() {
		return getFileSize;
	}
	
	/***
	 * Share File and Folder
	 */
	
	@FindBy(xpath = "//span[text()='Share']")
	WebElement shareButton;
	
	public WebElement shareButton() {
		return shareButton;
	}
	
	@FindBy(xpath="//div[@class='access-title']")
       WebElement accessTitle;
	
	public WebElement accessTitle() {
		return accessTitle;
	}
	
	
	@FindBy(xpath="//span[text()='Permissions']")
    WebElement verifyPermissonAlert;
	
	public WebElement verifyPermissonAlert() {
		return verifyPermissonAlert;
	}
	
	@FindBy(xpath="//button[@class='expires-button']")
    WebElement expireOnButton;
	
	public WebElement expireOnButton() {
		return expireOnButton;
	}
	
	@FindBy(xpath="//input[@class='ux-tag-input ng-pristine ng-valid ng-touched']")
    WebElement userOrGroupName;
	
	public WebElement userOrGroupName() {
		return userOrGroupName;
	}
	
	@FindBy(xpath="//input[@class='ux-tag-input ng-untouched ng-pristine ng-valid']")
    WebElement userOrGroupNameField;
	
	public WebElement userOrGroupNameField() {
		return userOrGroupNameField;
	}
	
	
	@FindBy(xpath="//div[@class='ux-toggleswitch-nub']")
    WebElement makePublicShareSwitch;
	
	public WebElement makePublicShareSwitch() {
		return makePublicShareSwitch;
	}

	
	@FindBy(xpath="//span[text()='Public share']")
    WebElement makePublicShareButton;
	
	public WebElement makePublicShareButton() {
		return makePublicShareButton;
	}
	
	
	@FindBy(xpath="//textarea[@class='share-note ng-untouched ng-pristine ng-valid']")
    WebElement commentOnShare;
	
	public WebElement commentOnShare() {
		return commentOnShare;
	}
	//select[@name='notifyOption']
	
	@FindBy(xpath="//select[@name='notifyOption']")
    WebElement notifyOption;
	
	public WebElement notifyOption() {
		return notifyOption;
	}
	
	@FindBy(xpath="//span[text()='Invite']")
    WebElement inviteButton;
	
	public WebElement inviteButton() {
		return inviteButton;
	}

	@FindBy(xpath="//span[text()='Allow re-share with']")
    WebElement AllowReshare;
	
	public WebElement AllowReshare() {
		return AllowReshare;
	}
	
	
	@FindBy(xpath="//span[text()='Editor']")
    WebElement Editor;
	
	public WebElement editor() {
		return Editor;
	}
	
	@FindBy(xpath="//span[text()='Viewer']")
    WebElement Viewer;
	
	public WebElement Viewer() {
		return Viewer;
	}
	
	@FindBy(xpath="//span[text()='Contributor']")
    WebElement Contributor;
	
	public WebElement Contributor() {
		return Contributor;
	}
	
	@FindBy(xpath="//span[text()='Internal users']")
    WebElement internalUser;
	
	public WebElement internalUser() {
		return internalUser;
	}
	
	@FindBy(xpath="//span[text()='External users']")
    WebElement externalUsers;
	
	public WebElement externalUsers() {
		return externalUsers;
	}
	
	@FindBy(xpath="//span[text()='Public']")
    WebElement Public;
	
	public WebElement Public() {
		return Public;
	}
	
	@FindBy(xpath="//span[text()='File link']")
    WebElement fileLink;
	
	public WebElement fileLink() {
		return fileLink;
	}
	
	@FindBy(xpath="//span[text()='In 7 days']")
    WebElement in7DaysButton;
	
	public WebElement in7DaysButton() {
		return in7DaysButton;
		
	}
	
	
	@FindBy(xpath="//span[text()='In 30 days']")
    WebElement in30DaysButton;
	
	public WebElement in30DaysButton() {
		return in30DaysButton;
		
	}
	
	@FindBy(xpath="//span[text()='On']")
    WebElement onButton;
	
	public WebElement onButton() {
		return onButton;
		
	}

	@FindBy(xpath="//span[text()='After']")
    WebElement afterButton;
	
	public WebElement afterButton() {
		return afterButton;
		
	}
	
	@FindBy(xpath="//span[text()='Before']")
    WebElement beforeButton;
	
	public WebElement beforeButton() {
		return beforeButton;
		
	}
	
	@FindBy(xpath="//span[text()='Never']")
    WebElement neverButton;
	
	public WebElement neverButton() {
		return neverButton;
		
	}
	
	@FindBy(xpath="//input[@class='number-picker-field ng-untouched ng-pristine ng-valid']")
    WebElement noOfDays;
	
	public WebElement noOfDays() {
		return noOfDays;
		
	}
	
	@FindBy(xpath="//input[@class='number-picker-field ng-pristine ng-valid ng-touched']")
    WebElement noOfDaysFill;
	
	public WebElement noOfDaysFill() {
		return noOfDaysFill;
		
	}
	
	
	
	@FindBy(xpath="//input[@class='form-control ng-pristine ng-valid ng-touched']")
    WebElement DateButton;
	
	public WebElement DateButton() {
		return DateButton;
		
	}
	
	@FindBy(xpath="//option[@name='new']")
    WebElement notifyWithNew;
	
	public WebElement notifyWithNew() {
		return notifyWithNew;
		
	}
	
	@FindBy(xpath="//option[@name='all']")
    WebElement notifyWithAll;
	
	public WebElement notifyWithAll() {
		return notifyWithAll;
		
	}
	
	@FindBy(xpath="//option[@name='none']")
    WebElement notifyWithNone;
	
	public WebElement notifyWithNone() {
		return notifyWithNone;
		
	}
	
	@FindBy(xpath="//span[text()='Cancel']")
    WebElement cancelButton;
	
	public WebElement cancelButton() {
		return cancelButton;
		
	}
	

/***	
 * Online Edit 
 */
	
	@FindBy(xpath="//span[text()='Edit']")
    WebElement EditButton;
	
	public WebElement EditButton() {
		return EditButton;
	}
	
	
	
	/***
	 * Admin Console Validation
	 */
	
	@FindBy(xpath="//span[text()='Administration Console']")
    WebElement adminConsole;
	
	public WebElement adminConsole() {
		return adminConsole;
	}
	
	@FindBy(xpath="//div[text()='Administration']")
    WebElement administrationPage;
	
	public WebElement administrationPage() {
		return administrationPage;
	}
	
	@FindBy(xpath="//span[@class='gwt-InlineLabel adminControl_CloseLabel']")
    WebElement adminCloseButton;
	
	public WebElement adminCloseButton() {
		return adminCloseButton;
	}

	
	@FindBy(xpath="//div[text()='Administration Information']")
    WebElement administrationInfo;
	
	public WebElement administrationInfo() {
		return administrationInfo;
	}

	@FindBy(xpath="//button[text()='Close']")
    WebElement administrationInfoClose;
	
	public WebElement administrationInfoClose() {
		return administrationInfoClose;
	}
	
	@FindBy(xpath="//button[text()='Sign In']")
    WebElement oldSignButton;
	
	public WebElement oldSignButton() {
		return oldSignButton;
	}
	
}
