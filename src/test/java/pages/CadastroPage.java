package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import javax.swing.*;

public class CadastroPage extends BasePage{

    @AndroidFindBy(xpath = "//*[@resource-id='nome']")
    private MobileElement campoNome;

    @AndroidFindBy(xpath = "//*[@resource-id='email']")
    private  MobileElement campoEmail;

    @AndroidFindBy(xpath = "//*[@resource-id='senha']")
    private  MobileElement campoSenha;

    @AndroidFindBy(accessibility = "Cadastrar")
    private MobileElement botaoCadastrar;

    public MobileElement getMensagemDeSucesso() {
        return mensagemDeSucesso;
    }

    @AndroidFindBy(accessibility = "Usuário inserido com sucesso")
    private MobileElement mensagemDeSucesso;

    public MobileElement getBotaoCadastrar() {
        return botaoCadastrar;
    }
    public MobileElement getCampoNome() {
        return campoNome;
    }

    public MobileElement getCampoEmail() {
        return campoEmail;
    }

    public MobileElement getCampoSenha() {
        return campoSenha;
    }
}
