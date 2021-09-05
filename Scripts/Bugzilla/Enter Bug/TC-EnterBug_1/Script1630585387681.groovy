import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

CustomKeywords.'com.bantuan.login.inputLogin.login'()

WebUI.verifyTextPresent('Show Advanced Fields', false)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Page_Enter Bug TestProduct/Severity'), 1)

WebUI.selectOptionByValue(findTestObject('Page_Enter Bug TestProduct/Hardware'), 'Macintosh', false)

WebUI.selectOptionByIndex(findTestObject('Page_Enter Bug TestProduct/OS'), 2)

WebUI.sendKeys(findTestObject('Page_Enter Bug TestProduct/input_Summary_short_desc'), '')

WebUI.sendKeys(findTestObject('Page_Enter Bug TestProduct/textarea_Description_comment'), 'Submit Bug Description')

WebUI.scrollToElement(findTestObject('Page_Enter Bug TestProduct/Attachment'), 40)

WebUI.delay(2)

WebUI.click(findTestObject('Page_Enter Bug TestProduct/Attachment'))

WebUI.sendKeys(findTestObject('Page_Enter Bug TestProduct/DescriptionFile'), 'add file')

WebUI.uploadFile(findTestObject('Page_Enter Bug TestProduct/add File'), 'D:\\Dirman\\KatalonToyota\\login.txt')

WebUI.click(findTestObject('Page_Enter Bug TestProduct/SubmitBug'))

if (WebUI.verifyTextPresent('You must enter a Summary for this bug.', false) == true) {
    WebUI.delay(2)

    WebUI.takeScreenshot('D:\\Dirman\\KatalonToyota\\Capture\\Enter Bug\\EnterBug_1.png')

    WebUI.delay(2)

    WebUI.click(findTestObject('Page_Bugzilla Main Page/a_New'))
}

