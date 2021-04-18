package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.text.Normalizer;

public class FormularioPage extends BasePage {


    @AndroidFindBy(xpath = "//*[@text=\"Formulário\"]")
    private MobileElement elementoFormulario;

    @AndroidFindBy(xpath = "//*[@content-desc=\"nome\"]")
    private MobileElement campoNome;

    @AndroidFindBy(accessibility = "console")
    private MobileElement botaoConsole;

    @AndroidFindBy(xpath = "//*[@text=\"Nintendo Switch\"]")
    private MobileElement selectOpcao;

    @AndroidFindBy(accessibility = "check")
    private  MobileElement checkBox;

    @AndroidFindBy(accessibility = "switch")
    private MobileElement botaoSwitch;

    @AndroidFindBy(xpath = "//*[@text=\"SALVAR\"]")
    private MobileElement botaoSalvar;

    @AndroidFindBy(xpath = "//*[@text=\"Console: switch\"]" )
    private MobileElement display;


    public FormularioPage() {
        PageFactory.initElements(new AppiumFieldDecorator(mobDriver), this);
    }



    public MobileElement getElementoFormulario() {
        return elementoFormulario;
    }

    public MobileElement getCampoNome() {
        return campoNome;
    }

    public MobileElement getBotaoConsole() {
        return botaoConsole;
    }

    public MobileElement getSelectOpcao() {
        return selectOpcao;
    }

    public MobileElement getCheckBox() {
        return checkBox;
    }

    public MobileElement getBotaoSwitch() {
        return botaoSwitch;
    }

    public MobileElement getBotaoSalvar() {
        return botaoSalvar;
    }

    public MobileElement getDisplay() {
        return display;
    }





}
