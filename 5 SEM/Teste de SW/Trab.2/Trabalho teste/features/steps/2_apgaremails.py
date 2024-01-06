from behave import given, when, then
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
import time


@when(u'Realizar o Login no sistema')
def step_impl(context):
    WebDriverWait(context.driver, 20).until(EC.element_to_be_clickable((By.XPATH,'/html/body/header/div/aside/div/nav/ul/li[2]/a'))).click()
    WebDriverWait(context.driver, 20).until(EC.element_to_be_clickable((By.ID,'i0116'))).send_keys('j-ricardo14@hotmail.com')
    WebDriverWait(context.driver, 20).until(EC.element_to_be_clickable((By.ID,'idSIButton9'))).click()
    WebDriverWait(context.driver, 20).until(EC.element_to_be_clickable((By.ID,'i0118'))).send_keys('Dranka110*')
    WebDriverWait(context.driver, 20).until(EC.element_to_be_clickable((By.ID,'idSIButton9'))).click()
    WebDriverWait(context.driver, 20).until(EC.element_to_be_clickable((By.ID,'idBtn_Back'))).click()
    


@when(u'clicar no seletor de emails')
def step_impl(context):
    WebDriverWait(context.driver, 20).until(EC.element_to_be_clickable((By.XPATH,'//*[@id="MainModule"]/div/div/div[3]/div/div[3]/div[1]/div[1]/div[1]/div/div[1]/div/div/i[2]'))).click()

@when(u'clicar no botao para apagar emails')
def step_impl(context):
    WebDriverWait(context.driver, 20).until(EC.element_to_be_clickable((By.XPATH,'//*[@id="innerRibbonContainer"]/div[1]/div/div/div/div[3]/div/div/span/button[1]/span/span[1]'))).click()


@when(u'clicar em confirmar')
def step_impl(context):
    WebDriverWait(context.driver, 20).until(EC.element_to_be_clickable((By.ID,'ok-1'))).click()



@when(u'clicar em outros')
def step_impl(context):
    WebDriverWait(context.driver, 20).until(EC.element_to_be_clickable((By.XPATH,'/html/body/div[2]/div/div[2]/div[2]/div[2]/div[1]/div/div/div[3]/div/div[3]/div[1]/div[1]/div[1]/div/div[1]/div/div/div[1]/button[2]/span/div'))).click()
    
    
@when(u'clicar em confirmar1')
def step_impl(context):
    WebDriverWait(context.driver, 20).until(EC.element_to_be_clickable((By.XPATH,'/html/body/div[3]/div[3]/div/div/div/div[2]/div[2]/div/div[2]/div[2]/div/span[1]/button'))).click()


@when(u'clicar em lixeira eletrenica')
def step_impl(context):
    WebDriverWait(context.driver, 20).until(EC.element_to_be_clickable((By.XPATH,'//*[@id="MainModule"]/div/div/div[1]/div/div/div[1]/div/div[2]/div[2]/div'))).click()



@when(u'clicar em esvaziar')
def step_impl(context):
    WebDriverWait(context.driver, 20).until(EC.element_to_be_clickable((By.XPATH,'//*[@id="innerRibbonContainer"]/div[1]/div/div/div/div[3]/div/div/span/button[1]/span/span[1]'))).click()
    
@when(u'clicar em confirmar2')
def step_impl(context):
    WebDriverWait(context.driver, 20).until(EC.element_to_be_clickable((By.XPATH,'/html/body/div[3]/div[3]/div/div/div/div[2]/div[2]/div/div[2]/div[2]/div/span[1]/button'))).click()
