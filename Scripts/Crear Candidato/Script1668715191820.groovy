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
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.selectOptionByValue(findTestObject('Object Repository/Crear Candidatos/Page_Inicio de Sesin/select_SENA  InternoUsuario Externo'), 
    'local', true)

WebUI.setText(findTestObject('Object Repository/Crear Candidatos/Page_Inicio de Sesin/input_Iniciar con_vUSERNAME'), GlobalVariable.u_scitech1)

WebUI.setText(findTestObject('Object Repository/Crear Candidatos/Page_Inicio de Sesin/input_Iniciar con_USERPASSWORDContainer_Use_26b53f'), 
    GlobalVariable.p_scitech_1)

WebUI.click(findTestObject('Object Repository/Crear Candidatos/Page_Inicio de Sesin/input_Por favor ingrese en siguiente texto_LOGIN'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Crear Candidatos/Page_Security Backend Home/a_Administracin'))

WebUI.click(findTestObject('Object Repository/Crear Candidatos/Page_Security Backend Home/a_Candidatos'))

WebUI.click(findTestObject('Object Repository/Crear Candidatos/Page_Security Backend Home/a_Candidatos_1'))

WebUI.click(findTestObject('Object Repository/Crear Candidatos/Page_Candidatos/input_Estado_INSERT'))

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/Crear Candidatos/Page_Candidatos/select_Seleccione.CCCEEINTAX IDNITPEPPPTPSTI'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Crear Candidatos/Page_Candidatos/input_Nmero Identificacin_W0026W0007W0012EC_03770d'), 
    '123454321')

WebUI.setText(findTestObject('Object Repository/Crear Candidatos/Page_Candidatos/input_Primer Nombre_W0026W0007W0012ECANNOMPRI'), 
    'Juan')

WebUI.setText(findTestObject('Object Repository/Crear Candidatos/Page_Candidatos/input_Segundo Nombre_W0026W0007W0012ECANNOMSEG'), 
    'Jose')

WebUI.setText(findTestObject('Object Repository/Crear Candidatos/Page_Candidatos/input_Primer Apellido_W0026W0007W0012ECANAPEPRI'), 
    'Pelaez')

WebUI.setText(findTestObject('Object Repository/Crear Candidatos/Page_Candidatos/input_Segundo Apellido_W0026W0007W0012ECANAPESEG'), 
    'Aguirre')

WebUI.setText(findTestObject('Object Repository/Crear Candidatos/Page_Candidatos/input_Fecha Nacimiento_W0026W0007W0012ECANFECNAC'), 
    '18/04/1993')

WebElement fechaNacimiento = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Crear Candidatos/Page_Candidatos/input_Fecha Nacimiento_W0026W0007W0012ECANFECNAC'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'18/04/1993\'', Arrays.asList(fechaNacimiento))

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/Crear Candidatos/Page_Candidatos/select_Seleccione.HombreMujer'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Crear Candidatos/Page_Candidatos/select_Seleccione.ABAB-AA-BB-OO-'), 
    '7', true)

WebUI.selectOptionByValue(findTestObject('Crear Candidatos/Page_Candidatos/select_Seleccione.FEMENINOLGTBIQMASCULINONO DEFINIDO'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Crear Candidatos/Page_Candidatos/select_Seleccione.AMAZONASANTIOQUIAARAUCAAT_c008ef'), 
    '22', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Crear Candidatos/Page_Candidatos/select_Seleccione.AGUADAALBANIAARATOCABARBO_f6a42f'), 
    '848', true)

WebUI.setText(findTestObject('Object Repository/Crear Candidatos/Page_Candidatos/input_Fecha Expedicin_W0026W0007W0012ECANFECEXPDOC'), 
    '19/04/2011')

WebElement fechaExpedicion = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Crear Candidatos/Page_Candidatos/input_Fecha Expedicin_W0026W0007W0012ECANFECEXPDOC'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'19/04/2011\'', Arrays.asList(fechaExpedicion))

WebUI.selectOptionByValue(findTestObject('Object Repository/Crear Candidatos/Page_Candidatos/select_Seleccione.AMAZONASANTIOQUIAARAUCAAT_c008ef_1'), 
    '26', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Crear Candidatos/Page_Candidatos/select_Seleccione.ARAUCAARAUQUITACRAVO NORT_4b0dac'), 
    '1053', true)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Crear Candidatos/Page_Candidatos/input_Libreta Militar_W0026W0007W0012ECANLIBMIL'), 
    '123454321')

WebUI.selectOptionByValue(findTestObject('Object Repository/Crear Candidatos/Page_Candidatos/select_Seleccione.CASADOINDIFERENTESEPARADO_cdd702'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Crear Candidatos/Page_Candidatos/select_Seleccione.NINGUNOPRIMARIAMEDIABACHI_b4fc22'), 
    '6', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Crear Candidatos/Page_Candidatos/select_Seleccione.ABANDONO O DESPOJO FORZAD_e1afd4'), 
    '46', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Crear Candidatos/Page_Candidatos/select_Seleccione.SiNo'), '2', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Crear Candidatos/Page_Candidatos/select_Seleccione.EMPLEADOEN BSQUEDA DE EMP_3a53bd'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Crear Candidatos/Page_Candidatos/select_Seleccione.50.000 A 600.000ALTOSBAJOS'), 
    '1', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Crear Candidatos/Page_Candidatos/select_Seleccione.SiNo_1'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Crear Candidatos/Page_Candidatos/img_Ocupacin(es)_W0026W0007W0012SELCARGOS'))

WebUI.click(findTestObject('Object Repository/Crear Candidatos/Page_Candidatos/input_Clasificacin Nacional de Ocupaciones__a6b682'))

WebUI.click(findTestObject('Object Repository/Crear Candidatos/Page_Candidatos/input_Sin Asignar Profesiones_CONFIRMARSELECCION'))

WebUI.selectOptionByValue(findTestObject('Crear Candidatos/Page_Candidatos/select_Seleccione.SINO_InfAdCan 1'), '2', true)

WebUI.selectOptionByValue(findTestObject('Crear Candidatos/Page_Candidatos/select_Seleccione.SINO_InfAdCan 2'), '2', true)

WebUI.selectOptionByValue(findTestObject('Crear Candidatos/Page_Candidatos/select_Seleccione.SINO_InfAdCan 3'), '2', true)

WebUI.selectOptionByValue(findTestObject('Crear Candidatos/Page_Candidatos/select_Seleccione.SINO_InfAdCan 4'), '2', true)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Crear Candidatos/Page_Candidatos/input_Direccin_W0031W0007W0012ECANDIRDOM'), 'Calle 1 # 2 - 03')

WebUI.setText(findTestObject('Object Repository/Crear Candidatos/Page_Candidatos/input_Barrio_W0026W0007W0012ECANBAR'), 
    'PROVENZA')

WebUI.selectOptionByValue(findTestObject('Object Repository/Crear Candidatos/Page_Candidatos/select_Seleccione.AMAZONASANTIOQUIAARAUCAAT_c008ef_1_2'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Crear Candidatos/Page_Candidatos/select_Seleccione.ABEJORRALABRIAQUALEJANDRA_874242'), 
    '20', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Crear Candidatos/Page_Candidatos/select_Seleccione.TRESCUATROCINCOUNODOSSEIS'), 
    '3', true)

WebUI.setText(findTestObject('Object Repository/Crear Candidatos/Page_Candidatos/input_Telfono_W0026W0007W0012ECANTEL'), 
    '3211111')

WebUI.setText(findTestObject('Object Repository/Crear Candidatos/Page_Candidatos/input_Celular_W0026W0007W0012ECANCEL'), 
    '3211111111')

WebUI.setText(findTestObject('Object Repository/Crear Candidatos/Page_Candidatos/input_E-mail_W0026W0007W0012ECANEMA'), 
    'correoprueba202304_1@gmail.com')

WebUI.setText(findTestObject('Object Repository/Crear Candidatos/Page_Candidatos/input_Nombre_W0026W0007W0012ECAMEMENOM'), 
    'Ana Maria Galviz')

WebUI.setText(findTestObject('Object Repository/Crear Candidatos/Page_Candidatos/input_Celular_W0026W0007W0012ECAMEMETEL'), 
    '3212222222')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Crear Candidatos/Page_Candidatos/img_reas de Inters_W0026W0007W0012SELAREASINTERES'))

WebUI.click(findTestObject('Object Repository/Crear Candidatos/Page_Candidatos/label (1)'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Crear Candidatos/Page_Candidatos/input_reas de Inters_CONFIRMAR'))

WebUI.click(findTestObject('Object Repository/Crear Candidatos/Page_Candidatos/input_-        000000_W0026W0007W0012ENTER'))

WebUI.delay(2)

WebUI.verifyTextPresent('fue creado', true)

WebUI.takeScreenshot()

