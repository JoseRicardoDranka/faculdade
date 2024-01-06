from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.by import By
from bs4 import BeautifulSoup
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.common.action_chains import ActionChains
import time

options = webdriver.ChromeOptions()
options.add_argument("--log-level=3")
#options.add_argument("--headless")
driver = webdriver.Chrome(options=options)
login_url = 'https://www.pichau.com.br/'

print('Passo 1: Acessar o site')
try:
    driver.get(login_url)
    driver.maximize_window()
    driver.implicitly_wait(10)
except:
    driver.quit()
    print('Erro ao acessar o site')
    quit()

print('Passo 2: Acessa o menu Departamentos/Computadores/Notebooks/Dell')
try:
    action = ActionChains(driver)
    #Menu
    menu = WebDriverWait(driver,20).until(EC.element_to_be_clickable((By.XPATH,'//*[@id="__next"]/header/div[2]/div/div[1]/button'))).click()
    #Hardware
    menu = WebDriverWait(driver,5).until(EC.element_to_be_clickable((By.PARTIAL_LINK_TEXT,'Hardware'))).click()
    #Placa de video
    menu = WebDriverWait(driver,5).until(EC.element_to_be_clickable((By.PARTIAL_LINK_TEXT,'Placa de Vídeo'))).click()
    
    time.sleep(2)
except:
    driver.quit()
    print('Erro ao acessar o menu...')
    quit()

print('Passo 3: Ordenar em ordem crescente de preços')
try:
    WebDriverWait(driver,10).until(EC.element_to_be_clickable((By.XPATH,'//*[@id="__next"]/main/div[2]/div/div[1]/div[1]/div/div/div[2]/div'))).click()
    WebDriverWait(driver,5).until(EC.element_to_be_clickable((By.XPATH,'//*[@id="menu-"]/div[3]/ul/li[4]'))).click()
    time.sleep(3)
    
except:
    driver.quit()
    print('Erro ao ordenar os produtos')
    quit()
    

print('Passo 4: Procurar conteudo HTML')
try:
    elemento = driver.find_element(By.XPATH,'//*[@id="__next"]/main/div[2]/div/div[1]/div[2]')
    conteudo_html = elemento.get_attribute('outerHTML')
    soup = BeautifulSoup(conteudo_html, 'html.parser')
    tabela = soup.find(name='div')
    print(tabela)
    #Salva como html
    with open('lista.html', 'w') as arquivo:
        arquivo.write(str(tabela))
    arquivo.close()
    

    #Salva como csv
    try:
        with open('lista.csv', 'w') as arquivo:
            for row in soup.find_all('div'):
                line = ''
                for col in row.find_all('div'):
                    line = line + col.text.lstrip("\n").rstrip("\n") +';'
                arquivo.write(line+'\n')
        arquivo.close
    except:
        print('Erro ao salvar arquivo csv')

except:
    driver.quit()
    print('Erro ao acessar a tabela de ex-prefeitos')
    quit()
print('Teste realizado com sucesso')
driver.quit()