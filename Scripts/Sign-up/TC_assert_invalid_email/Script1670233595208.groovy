import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.verifyElementVisible(findTestObject('sign-up/alert_invalid_email'), FailureHandling.STOP_ON_FAILURE)