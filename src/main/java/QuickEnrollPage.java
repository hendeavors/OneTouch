import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuickEnrollPage {
        private WebDriver driver;

        public QuickEnrollPage (WebDriver driver) {
            this.driver = driver;
        }

        @FindBy(xpath =".//*[@id='first_name']")
        private WebElement firstNameFieldShortForm;
        @FindBy (xpath =".//*[@id='last_name']")
        private WebElement lastNameFieldShortForm;
        @FindBy (xpath =".//*[@id='dob']")
        private WebElement dobFieldShortForm;
        @FindBy (xpath =".//*[@id='gender']")
        private WebElement chooseGenderDropDownShortForm;
        @FindBy (xpath = ".//*[@id='gender']/option[@value='m']")
        private WebElement maleGenderOption;
        @FindBy (xpath =".//*[@id='insurance_number']")
        private WebElement insuranceNumberFieldShortForm;
        @FindBy (xpath =".//*[@id='send_to']")
        private WebElement mobilePhonefieldShortForm;
        @FindBy (xpath =".//*[@id='username-input']")
        private WebElement usernameFieldShortForm;
        @FindBy (xpath =".//*[@id='password-input']")
        private WebElement passwordFieldshortForm;
        @FindBy (xpath =".//*[@id='password-confirmation-input']")
        private WebElement confirmPasswordFieldShortForm;
        @FindBy (xpath ="//input[@name='terms']")
        private WebElement iAcceptTheTermsCheckBoxShortForm;
        @FindBy (xpath ="//button[@type='submit']")
        private WebElement enrollButtonShortForm;
        @FindBy (xpath = "a[@title='login']")
        private WebElement alreadyHaveAnAccount;

        //Methods for the short form

        public QuickEnrollPage typeFirstNameShortForm(String firstnameshortform){
            firstNameFieldShortForm.sendKeys(firstnameshortform);
            return this;
        }
        public QuickEnrollPage typePasswordShortForm(String passwordshortform) {
            passwordFieldshortForm.sendKeys(passwordshortform);
            return this;
        }
        public QuickEnrollPage typeLastNameShortForm(String lastnameshortform){
            lastNameFieldShortForm.sendKeys(lastnameshortform);
            return this;
        }
        public QuickEnrollPage typeDOBShortForm(String dobmeaning){
            dobFieldShortForm.sendKeys(dobmeaning);
            return this;
        }
        public QuickEnrollPage typeInsuranceNumberShortForm(String insurancenumbershortform){
            insuranceNumberFieldShortForm.sendKeys(insurancenumbershortform);
            return this;
        }
        public QuickEnrollPage typeMobilePhoneShortForm(String mobilephoneshortform){
            mobilePhonefieldShortForm.sendKeys(mobilephoneshortform);
            return this;
        }
        public QuickEnrollPage typeUsernameShortForm(String usernameshortform){
            usernameFieldShortForm.sendKeys(usernameshortform);
            return this;
        }
        public QuickEnrollPage typeConfirmPasswordShortForm(String confirmpasswordshortform){
            confirmPasswordFieldShortForm.sendKeys(confirmpasswordshortform);
            return this;
        }
        public QuickEnrollPage chooseMaleGenderShortForm (){
            chooseGenderDropDownShortForm.click();
            maleGenderOption.click();
            return this;
        }
        public QuickEnrollPage acceptTheTerms (){
            iAcceptTheTermsCheckBoxShortForm.click();
            return this;
        }
        public QuickEnrollPage pushEnrollButtonShortForm (){
            enrollButtonShortForm.click();
            return this;
        }

        public QuickEnrollPage alreadyHaveAnAccount(){
            alreadyHaveAnAccount.click();
            return new QuickEnrollPage(driver);
        }





        public QuickEnrollPage completeQuickEnrollAndSubmit (String firstnameshortform, String lastnameshortform,String dobmeaning, String insurancenumbershortform, String mobilephoneshortform, String usernameshortform, String passwordshortform, String confirmpasswordshortform ){
             this.typeFirstNameShortForm(firstnameshortform);
             this.typeLastNameShortForm(lastnameshortform);
             this.typePasswordShortForm(passwordshortform);
             this.typeDOBShortForm(dobmeaning);
             this.typeInsuranceNumberShortForm(insurancenumbershortform);
             this.typeMobilePhoneShortForm(mobilephoneshortform);
             this.typeUsernameShortForm(usernameshortform);
             this.typeConfirmPasswordShortForm(confirmpasswordshortform);
             this.chooseMaleGenderShortForm();
             this.acceptTheTerms();
             this.pushEnrollButtonShortForm();
             return new QuickEnrollPage(driver);

        }

}
