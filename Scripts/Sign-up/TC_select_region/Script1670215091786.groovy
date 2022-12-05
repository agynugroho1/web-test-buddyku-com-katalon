import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.selectOptionByValue(findTestObject('sign-up/select_region'), 'Jakarta', false, FailureHandling.STOP_ON_FAILURE)