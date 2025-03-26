package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.DeleteKnowledgeBasePage;

public class DeleteKnowledgeBase extends BaseClass {

	@Test(groups = { "success" })
	public void DeleteKnowledgeBase() throws IOException {
		DeleteKnowledgeBasePage kb = new DeleteKnowledgeBasePage();
		kb.clickKnowledgeBaseMenu()
		.selectnowledgeBase()
		.clickDeleteButton()
		.clickDeleteButtonOnPopup()
		.verifyTheToaster();

	}
}
