import org.openqa.selenium.By;

public class LokatoriVezba {


    By css = By.cssSelector("imetaga[atribut='vrednost']");
    By xpath = By.xpath("//imetaga[@atribut='vrednost']");

    By imeKlase = By.className("bar-notification");
    By id = By.id("bar-notification");

    By cssSkracenoPoKlasi = By.cssSelector(".bar-notification");
    By cssSkracenoPOId = By.cssSelector("#bar-notification");

    By headerMenuComputers = By.linkText("Computers");
    By headerMenuComputersPartial = By.partialLinkText("Computers");



}

