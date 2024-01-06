#language: pt

Funcionalidade: Enviar Email
    
    '''
    Eu como usuario quero acessar um provedor de Email e envair um email para outra pessoa
    '''

    Cenario: enviar email
    Dado acesso ao provedor de email
    Quando Realizo o Login no sistema
    E clicar no botao novo email
    E inserir email do destino 
    E inserir assunto do email
    E escrever uma mensagem
    E clicar em enviar email
    Entao desconectar