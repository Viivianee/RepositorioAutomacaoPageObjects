package Elementos;

import org.openqa.selenium.By;

public class ElementosDesafio {

	private By Username = By.id("user-name");
	private By Password = By.id("password");
	private By BtnLogin = By.id("login-button");
	private By AddToCart = By.id("id=\"add-to-cart-sauce-labs-backpack\"");
	private By Carrinho = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
	private By Checkout = By.id("//*[@id=\"shopp;ing_cart_container\"]/a");
	private By FirtsName = By.id("first-name");
	private By LastName = By.id("last-name");
	private By CodigoPostal = By.id("postal-code");
	private By BtnContinue = By.xpath("//*[@id=\"postal-code\"]");
	private By Finish = By.id("finish");
	
	public By getUsername() {
		return Username;
	}
	public By getPassword() {
		return Password;
	}
	public By getBtnLogin() {
		return BtnLogin;
	}
	public By getAddToCart() {
		return AddToCart;
	}
	public By getCarrinho() {
		return Carrinho;
	}
	public By getCheckout() {
		return Checkout;
	}
	public By getFirtsName() {
		return FirtsName;
	}
	public By getLastName() {
		return LastName;
	}
	public By getCodigoPostal() {
		return CodigoPostal;
	}
	public By getBtnContinue() {
		return BtnContinue;
	}
	public By getFinish() {
		return Finish;
	}


	
	
	
	
	
	
}

