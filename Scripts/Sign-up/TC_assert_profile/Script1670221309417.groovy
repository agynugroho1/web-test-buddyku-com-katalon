import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.click(findTestObject('sign-up/btn_profile'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('sign-up/label_profile'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('sign-up/label_profile'), 'Agy Nugroho', FailureHandling.STOP_ON_FAILURE)

