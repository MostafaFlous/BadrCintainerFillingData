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

WebUI.callTestCase(findTestCase('LoginTcs/LoginTC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/a_'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/a__1'))

WebUI.setText(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input__name'), 'سمير')

WebUI.setText(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input__username_1'), 'sameer')

WebUI.setEncryptedText(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input__password_1'), 'tzH6RvlfSTg=')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/select_'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/select__1'), '0', true)

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input__safe_id'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input__safe_id'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/button__1'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input___'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input__'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input___1'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input___1_2'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input___1_2_3'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input___1_2_3_4'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input___1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input___1_2_3_4_5_6'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/label_'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input___1_2_3_4_5_6_7'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input____1'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input___1_2_3_4_5_6_7_8'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input___1_2_3_4_5_6_7_8_9'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input___1_2_3_4_5_6_7_8_9_10'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/div_'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input___1_2_3_4_5_6_7_8_9_10_11'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input___1_2_3_4_5_6_7_8_9_10_11_12'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input___1_2_3_4_5_6_7_8_9_10_11_12_13'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/label_'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input___1_2_3_4_5_6_7_8_9_10_11_12_13_14'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input___1_2_3_4_5_6_7_8_9_10_11_12_13_14_15'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input___1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input___1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input____1_2'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input____1_2_3'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/button__1_2'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/a_'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/a__1'))

WebUI.setText(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input__name'), 'المدير')

WebUI.setText(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input__username_1'), 'Admin')

WebUI.doubleClick(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/div__1'))

WebUI.doubleClick(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input__username_1'))

WebUI.setText(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input__username_1'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input__password_1'), 'tzH6RvlfSTg=')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/select_'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/select__1'), '0', true)

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input__safe_id'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input__safe_id'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/button__1'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input___'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input__'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input___1'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input___1_2'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input___1_2_3'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input___1_2_3_4'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input___1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input___1_2_3_4_5_6'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input___1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/label_'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input____1'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input___1_2_3_4_5_6_7_8'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input___1_2_3_4_5_6_7_8_9'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input___1_2_3_4_5_6_7_8_9_10'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input___1_2_3_4_5_6_7_8_9_10_11'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input___1_2_3_4_5_6_7_8_9_10_11_12'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input___1_2_3_4_5_6_7_8_9_10_11_12_13'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input___1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input___1_2_3_4_5_6_7_8_9_10_11_12_13_14'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/label_'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input___1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/label_'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input____1_2'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/input____1_2_3'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/button__1_2'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/a_admin'))

WebUI.click(findTestObject('Object Repository/AddNewUsersToFirmTc/Page_Badr Container/a__1_2'))

WebUI.closeBrowser()

