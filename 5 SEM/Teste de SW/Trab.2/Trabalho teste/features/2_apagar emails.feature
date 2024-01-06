#language: pt

Funcionalidade: Responder email
    '''
    Eu como usuario quero acessar um provedor de Email e apagar uns email
    '''

    Cenario: apagar emails 
    Dado acesso ao provedor de email
    Quando Realizar o Login no sistema
    E clicar no seletor de emails
    E clicar no botao para apagar emails
    E clicar em confirmar
    E clicar em outros
    E clicar no seletor de emails
    E clicar no botao para apagar emails
    E clicar em confirmar1
    E clicar em lixeira eletrenica
    E clicar em esvaziar
    E clicar em confirmar2
    Entao desconectar