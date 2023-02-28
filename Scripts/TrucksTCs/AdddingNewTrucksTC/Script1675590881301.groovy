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

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/span_'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_'))

WebUI.setText(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__number'), 'BMW 111')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/select_'), '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/select__1'), '1', true)

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__kamashat_change_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_14'))

WebUI.setText(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__read_now'), '2000')

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__battery_change_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_14'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__ghatas_air_from_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_14'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/div_'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__cover_change_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_15'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__ghatas_air_to_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_14'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__air_condition_change_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_21'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__end_deal_paper_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_15'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__end_insurance_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_21'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__end_work_card_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_21'))

WebUI.setText(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__notes'), 'اضافة شاحنه جديده')

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/button__1'))

WebUI.setText(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__number'), 'BMW 222')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/select_'), '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/select__1'), '1', true)

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__kamashat_change_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_14'))

WebUI.setText(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__read_now'), '2000')

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__battery_change_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_14'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__ghatas_air_from_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_14'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/div_'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__cover_change_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_15'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__ghatas_air_to_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_14'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__air_condition_change_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_21'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__end_deal_paper_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_15'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__end_insurance_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_21'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__end_work_card_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_21'))

WebUI.setText(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__notes'), 'اضافة شاحنه جديده')

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/button__1'))

WebUI.setText(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__number'), 'BMW 333')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/select_'), '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/select__1'), '1', true)

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__kamashat_change_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_14'))

WebUI.setText(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__read_now'), '2000')

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__battery_change_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_14'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__ghatas_air_from_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_14'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/div_'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__cover_change_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_15'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__ghatas_air_to_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_14'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__air_condition_change_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_21'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__end_deal_paper_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_15'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__end_insurance_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_21'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__end_work_card_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_21'))

WebUI.setText(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__notes'), 'اضافة شاحنه جديده')

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/button__1'))

WebUI.setText(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__number'), 'BMW 444')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/select_'), '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/select__1'), '1', true)

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__kamashat_change_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_14'))

WebUI.setText(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__read_now'), '2000')

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__battery_change_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_14'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__ghatas_air_from_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_14'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/div_'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__cover_change_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_15'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__ghatas_air_to_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_14'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__air_condition_change_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_21'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__end_deal_paper_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_15'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__end_insurance_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_21'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__end_work_card_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_21'))

WebUI.setText(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__notes'), 'اضافة شاحنه جديده')

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/button__1'))

WebUI.setText(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__number'), 'BMW 555')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/select_'), '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/select__1'), '1', true)

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__kamashat_change_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_14'))

WebUI.setText(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__read_now'), '2000')

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__battery_change_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_14'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__ghatas_air_from_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_14'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/div_'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__cover_change_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_15'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__ghatas_air_to_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_14'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__air_condition_change_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_21'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__end_deal_paper_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_15'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__end_insurance_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_21'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__end_work_card_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_21'))

WebUI.setText(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__notes'), 'اضافة شاحنه جديده')

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/button__1'))

WebUI.setText(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__number'), 'BMW 666')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/select_'), '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/select__1'), '1', true)

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__kamashat_change_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_14'))

WebUI.setText(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__read_now'), '3000')

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__battery_change_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_14'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__ghatas_air_from_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_21'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__ghatas_air_to_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_21'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__cover_change_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_20'))

WebUI.click(findTestObject('AddNewTruckrepo/Page_Badr Container/input__air_condition_change_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_20'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__end_deal_paper_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_20'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__end_insurance_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_20'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__end_work_card_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_28'))

WebUI.setText(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__notes'), 'اضافة شاحنه جديده')

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/button__1'))

WebUI.setText(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__number'), 'BMW 777')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/select_'), '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/select__1'), '1', true)

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__kamashat_change_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_13'))

WebUI.setText(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__read_now'), '4000')

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__battery_change_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_22'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__ghatas_air_from_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_28'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__ghatas_air_to_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_28'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__cover_change_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_27'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__air_condition_change_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_20'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__end_deal_paper_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_28'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__end_work_card_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_21'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__end_insurance_date'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_7'))

WebUI.setText(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/input__notes'), 'اضافة شاحنه جديده')

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/button__1'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a_admin'))

WebUI.click(findTestObject('Object Repository/AddNewTruckrepo/Page_Badr Container/a__1'))

WebUI.closeBrowser()

