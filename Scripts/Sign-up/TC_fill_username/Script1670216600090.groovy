import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

String testagy = 'test' + System.currentTimeSeconds()

WebUI.sendKeys(findTestObject('sign-up/field_username'), testagy, FailureHandling.STOP_ON_FAILURE)

