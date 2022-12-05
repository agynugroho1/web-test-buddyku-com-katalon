import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

def imgDir = (RunConfiguration.getProjectDir() + '/Images/profile_image.png')

WebUI.uploadFile(findTestObject('sign-up/upload_image'), imgDir, FailureHandling.STOP_ON_FAILURE)