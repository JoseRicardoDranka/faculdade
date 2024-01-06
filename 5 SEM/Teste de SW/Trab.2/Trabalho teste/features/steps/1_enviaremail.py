from behave import given, when, then
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
import time

base_url="https://hotmail.com/"

@given(u'acesso ao provedor de email')
def step_impl(context):
    context.driver.get(base_url)


@when(u'Realizo o Login no sistema')
def step_impl(context):
    
    WebDriverWait(context.driver, 20).until(EC.element_to_be_clickable((By.XPATH,'/html/body/header/div/aside/div/nav/ul/li[2]/a'))).click()
    WebDriverWait(context.driver, 20).until(EC.element_to_be_clickable((By.ID,'i0116'))).send_keys('j-ricardo14@hotmail.com')
    WebDriverWait(context.driver, 20).until(EC.element_to_be_clickable((By.ID,'idSIButton9'))).click()
    WebDriverWait(context.driver, 20).until(EC.element_to_be_clickable((By.ID,'i0118'))).send_keys('Dranka110*')
    WebDriverWait(context.driver, 20).until(EC.element_to_be_clickable((By.ID,'idSIButton9'))).click()
    WebDriverWait(context.driver, 20).until(EC.element_to_be_clickable((By.ID,'idBtn_Back'))).click()
    
    

@when(u'clicar no botao novo email')
def step_impl(context):
    WebDriverWait(context.driver,20).until(EC.element_to_be_clickable((By.XPATH,'//*[@id="innerRibbonContainer"]/div[1]/div/div/div/div[2]/div/div/span/button[1]/span/span[1]'))).click()

@when(u'inserir email do destino')
def step_impl(context):
    WebDriverWait(context.driver, 20).until(EC.element_to_be_clickable((By.XPATH,'//*[@id="docking_InitVisiblePart_0"]/div/div[3]/div[1]/div/div[3]/div/div/div[2]'))).send_keys('j-ricardo14@proton.me')    
    WebDriverWait(context.driver,20).until(EC.element_to_be_clickable((By.XPATH,'//*[@id="FloatingSuggestionsItemId-0"]/div/button[1]/span/div/div/div/div[2]/span[1]/span'))).click()


@when(u'inserir assunto do email')
def step_impl(context):
    WebDriverWait(context.driver, 20).until(EC.element_to_be_clickable((By.XPATH,'/html/body/div[2]/div/div[2]/div[2]/div[2]/div[1]/div/div/div[3]/div/div[3]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[2]/div/div/div/input'))).send_keys('Trabalho Teste de software')


@when(u'escrever uma mensagem')
def step_impl(context):
    WebDriverWait(context.driver, 20).until(EC.element_to_be_clickable((By.XPATH,'//*[@id="editorParent_1"]/div'))).send_keys('Asdadasdadsad')


@when(u'clicar em enviar email')
def step_impl(context):
    WebDriverWait(context.driver,20).until(EC.element_to_be_clickable((By.XPATH,'/html/body/div[2]/div/div[2]/div[2]/div[2]/div[2]/div/div/div[3]/div/div[3]/div[2]/div[1]/div/div/div/div[2]/div[1]/div/span/button[1]/span/span/span'))).click()

@then(u'desconectar')
def step_impl(context):
    WebDriverWait(context.driver,20).until(EC.element_to_be_clickable((By.XPATH,'/html/body/div[2]/div/div[1]/div/div[1]/div[3]/div[1]/button/div/div[2]'))).click()
    WebDriverWait(context.driver,20).until(EC.element_to_be_clickable((By.XPATH,'/html/body/div[2]/div/div[1]/div/div[1]/div[3]/div[3]/div/div/div/div/div[1]/a'))).click()
