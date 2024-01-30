package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements extends Parent{
    public Elements() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

 @FindBy(css = "[class='login']")
    private WebElement login;
    @FindBy(css = "[id='email_create']")
    private WebElement createEmail;
    @FindBy(css = "[id='SubmitCreate']")
    private WebElement createBtn;
    @FindBy(css = "[id='id_gender1']")
    private WebElement gender;
    @FindBy(css = "[id='customer_firstname']")
    public WebElement firstName;
    @FindBy(css = "[id='customer_lastname']")
    public WebElement lastName;
    @FindBy(css = "[id='passwd']")
    public WebElement createPassword;
        @FindBy(css = "[id='submitAccount']")
    private WebElement sumbitBtn;
        @FindBy(xpath = "//*[@id=\"center_column\"]/h1")
        public WebElement registerSuccess;
        @FindBy(css = "[id='authentication']")
        private WebElement link1;
        @FindBy(css = "[class='logout']")
        private WebElement logOut;
    @FindBy(css = "[id='email']")
    private WebElement email;
    @FindBy(css = "[id='passwd']")
    private WebElement password;
    @FindBy(css = "[id='SubmitLogin']")
    private WebElement sumbitLogin;
    @FindBy(xpath = "//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a")
    private WebElement adress;
    @FindBy(xpath = "//*[@id=\"center_column\"]/div/a")
    private WebElement adressAdd;
    @FindBy(css = "[id='address1']")
    private WebElement adress1;
    @FindBy(css = "[id='city']")
    private WebElement city;
    @FindBy(css = "[id='id_state']")
    public WebElement id_state;
    @FindBy(css = "[id='postcode']")
    private WebElement postCode;
    @FindBy(css = "[id='id_country']")
    public WebElement id_country;
    @FindBy(css = "[id='phone']")
    private WebElement phone;
    @FindBy(css = "[id='phone_mobile']")
    private WebElement phoneMobile;
    @FindBy(css = "[id='submitAddress']")
    private WebElement save;
    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
    public WebElement woman;
    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a")
    public WebElement t_shirt;
    @FindBy(xpath = "//*[@id=\"product_list\"]/li/div/div[1]/div/a[1]/img")
    public WebElement selectTsirt;
    @FindBy(css = "[id='fancybox-frame1706644650270']")
    public WebElement iframe;
    @FindBy(xpath = "//*[@id=\"add_to_cart\"]/button")
    public WebElement addTsirt;

    @FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]")
    public WebElement add3Tsirt;
    @FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button")
    public WebElement add4Tsirt;
    @FindBy(xpath = "//*[@id=\"uniform-cgv\"]")
    public WebElement checkBox;
    @FindBy(xpath = "//*[@id=\"form\"]/p/button")
    public WebElement add5Tsirt;
    @FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
    public WebElement pay;
    @FindBy(xpath = "//*[@id=\"cart_navigation\"]/button")
    public WebElement payAcces;
    @FindBy(xpath = "//*[@id=\"contact-link\"]/a")
    public WebElement contact;
    @FindBy(xpath = "//*[@id=\"id_contact\"]")
    public WebElement subject;
    @FindBy(xpath = "//*[@id=\"center_column\"]/form/fieldset/div[1]/div[1]/div[2]/div/select")
    public WebElement order;
    @FindBy(xpath = "//*[@id=\"message\"]")
    public WebElement msg;
    @FindBy(xpath = "//*[@id=\"submitMessage\"]")
    public WebElement msgAccess;





    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "login": return this.login;
            case "createEmail": return this.createEmail;
            case "createBtn": return this.createBtn;
            case "gender": return this.gender;
            case "firstName": return this.firstName;
            case "lastName": return this.lastName;
            case "createPassword": return this.createPassword;
            case "sumbitBtn": return this.sumbitBtn;
            case "link1": return this.link1;
            case "logOut": return this.logOut;
            case "email": return this.email;
            case "password": return this.password;
            case "sumbitLogin": return this.sumbitLogin;
            case "adress": return this.adress;
            case "adressAdd": return this.adressAdd;
            case "adress1": return this.adress1;
            case "city": return this.city;
            case "id_state": return this.id_state;
            case "postCode": return this.postCode;
            case "id_country": return this.id_country;
            case "phone": return this.phone;
            case "phoneMobile": return this.phoneMobile;
            case "save": return this.save;
            case "woman": return this.woman;
            case "t_shirt": return this.t_shirt;
            case "selectTsirt": return this.selectTsirt;
            case "addTsirt": return this.addTsirt;

            case "add3Tsirt": return this.add3Tsirt;
            case "add4Tsirt": return this.add4Tsirt;
            case "checkBox": return this.checkBox;
            case "add5Tsirt": return this.add5Tsirt;
            case "pay": return this.pay;
            case "payAcces": return this.payAcces;
            case "contact": return this.contact;
            case "subject": return this.subject;
            case "order": return this.order;
            case "msg": return this.msg;
            case "msgAccess": return this.msgAccess;

        }

        return null;
    }
}
