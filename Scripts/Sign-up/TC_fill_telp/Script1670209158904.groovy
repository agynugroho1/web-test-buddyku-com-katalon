import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.sendKeys(findTestObject('sign-up/field_telp'), telp, FailureHandling.STOP_ON_FAILURE)