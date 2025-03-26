package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.WelcomePage;

public class CreateSequenceFromScratch extends BaseClass {
	@Test(groups = {"success"})
	public void createManualSequence() throws IOException {
		WelcomePage wp = new WelcomePage();
		wp.verifyTitle()
		.clickNewSequenceButton()
		.clickCreateFromScratch()
		.enterSequenceName()
		.clickAddAction()
		.selectEmailAction()
		.enterSubject()
		.enterEmailBody()
		.clickSaveButton()
		.verifyMissingDataIconIsNotDisplayed()
		.clickLaunchButton()
		.verifyLeadsDashboard();
	}
}
