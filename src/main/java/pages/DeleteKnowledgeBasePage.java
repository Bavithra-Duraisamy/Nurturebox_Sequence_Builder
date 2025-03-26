package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class DeleteKnowledgeBasePage extends BaseClass {

	public DeleteKnowledgeBasePage clickKnowledgeBaseMenu() {
		driver.findElement(By.xpath(prop.getProperty("knowledge_base_menu"))).click();
		return this;
	}

	public DeleteKnowledgeBasePage selectnowledgeBase() {
		driver.findElement(By.xpath(prop.getProperty("first_knowledge_base"))).click();
		return this;
	}

	public DeleteKnowledgeBasePage clickDeleteButton() {
		driver.findElement(By.xpath(prop.getProperty("delete_button"))).click();
		return this;
	}

	public DeleteKnowledgeBasePage clickDeleteButtonOnPopup() {
		driver.findElement(By.xpath(prop.getProperty("delete_button_on_popup"))).click();
		return this;
	}

	public DeleteKnowledgeBasePage verifyTheToaster() {
		boolean delete_kb_toaster = driver.findElement(By.xpath(prop.getProperty("delete_kb_toaster"))).isDisplayed();
		if (!delete_kb_toaster) {
			System.err.println("Knowledge base has been deleted successfully!..");
		}
		return this;
	}

}
