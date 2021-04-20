package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends BasePage{

    @AndroidFindBy(accessibility = "Novo usuário?")
    private MobileElement abaNovoUsuario;

    @AndroidFindBy(accessibility = "Login?")
    private MobileElement abaLogin;

    public MobileElement getAbaNovoUsuario() {
        return abaNovoUsuario;
    }

    public MobileElement getAbaLogin() {
        return abaLogin;
    }
}
