package Edit.EducacionIT;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Laboratorio2 {
	/*
	 * Método para registrar a un usuario en la página AutomationPractice
	 * */
	@Test
	public void registrarUsuario() {
		// 1. Configurar el driver asociado al navegador
		System.setProperty("webdriver.chrome.driver", "..\\EducacionIT\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// 2. Acceder a la página de AutomationPractice
		String url = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
		driver.get(url);
		
		// 3. Ingresar el correo
		WebElement txtCorreo = driver.findElement(By.xpath("//input[@id='email_create']"));
		txtCorreo.sendKeys("correo20005@mailinator.com");
		
		// 4. Hacer clic en el botón Create an Account
		WebElement btnCreate = driver.findElement(By.cssSelector("#SubmitCreate"));
		btnCreate.click();
			
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("uniform-id_gender2")));
		
		// 5. Completar el formulario
		WebElement radMrs = driver.findElement(By.id("uniform-id_gender2"));
		radMrs.click();
		
		WebElement txtName = driver.findElement(By.name("customer_firstname"));
		txtName.sendKeys("Gonzalo");
		
		WebElement txtLastName = driver.findElement(By.cssSelector("#customer_lastname"));
		txtLastName.sendKeys("Hernandez");
		
		WebElement txtPassword = driver.findElement(By.xpath("//input[@id='passwd']"));
		txtPassword.sendKeys("12345678");
		
		Select selDays = new Select(driver.findElement(By.xpath("//select[@id='days']")));
		selDays.selectByValue("16");
		
		Select selMonth = new Select(driver.findElement(By.id("months")));
		selMonth.selectByValue("6");
		
		Select selYear = new Select(driver.findElement(By.name("years")));
		selYear.selectByValue("1989");
		
		WebElement chkNewsletter = driver.findElement(By.cssSelector("#newsletter"));
		chkNewsletter.click();
		
		WebElement btnCheck = driver.findElement(By.cssSelector("#optin"));
		btnCheck.click();
		
		WebElement txtCompany = driver.findElement(By.cssSelector("#company"));
		txtCompany.sendKeys("ABC C.A.");
		
		WebElement txtAddress = driver.findElement(By.xpath("//input[@id='address1']"));
		txtAddress.sendKeys("MiCalle 456 3B");
		
		WebElement txtAddress2 = driver.findElement(By.id("address2"));
		txtAddress2.sendKeys("Entre MiCalle 32 y Mi Calle 40");
		
		WebElement txtCity = driver.findElement(By.xpath("//input[@id='city']"));
		txtCity.sendKeys("CABA");
		
		Select selState = new Select(driver.findElement(By.id("id_state")));
		selState.selectByValue("4");
		
		WebElement txtPostal = driver.findElement(By.cssSelector("#postcode"));
		txtPostal.sendKeys("10444");
		
		Select selCountry = new Select(driver.findElement(By.xpath("//select[@id='id_country']")));
		selCountry.selectByValue("21");
		
		WebElement txtAdditional = driver.findElement(By.xpath("//textarea[@id='other']"));
		txtAdditional.sendKeys("Otra información");
		
		WebElement txtHome = driver.findElement(By.xpath("//input[@id='phone']"));
		txtHome.sendKeys("1567576576");
		
		WebElement txtMobile= driver.findElement(By.xpath("//input[@id='phone_mobile']"));
		txtMobile.sendKeys("1567576878");
		
		WebElement txtAlias = driver.findElement(By.xpath("//input[@id='alias']"));
		txtAlias.clear();
		txtAlias.sendKeys("Mi Alias");
		
		// 6 . Hacer clic en Register
		WebElement btnRegister = driver.findElement(By.xpath("//button[@id='submitAccount']"));
		btnRegister.click();
	}
}
