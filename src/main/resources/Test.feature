# new feature
# Tags: optional
# language: pt

 #EXECUTAR o Teste pela Class Runner passando a Tag desejada

Funcionalidade: Executar testes automatizados em uma aplicação de simulação de cotação de veículos

  Contexto: Acessar o sistema de cadastro
    Dado que tenho acesso ao sistema

  @testWeb
  Cenario: Validar realização de preenchimento de cadastro no sistema
    E preecncho os campos do formulario da aba "Enter Vehicle Data"
    Quando clico no botao "Next"
    E preecncho os campos do formulario da aba "Enter Insurant Data"
    Quando clico no botao "Next"
    E preecncho os campos do formulario da aba "Enter Product Data"
    Quando clico no botao "Next"
    E preecncho os campos do formulario da aba "Send Quote"
    Quando clico no botao "Send"
    Entao Visualizo a mensage de sucesso "Sending e-mail success!"

  @test-web
  Cenario: Validar realização de preenchimento de cadastro no sistema
    Quando preencho os campos obrigatorios do formulario de cotacao
    E envio o formulario
    Entao Visualizo a mensage de sucesso "Sending e-mail success!"

  @test-web-E-C
  Esquema do Cenario: Validar realização de preenchimento de cadastro no sistema
    E preencho os campos do "<Campos Vehicle>" obrigatorios do formulario de cotacao
    E preencho os campos do "<Campos Insurant>" obrigatorios do formulario de cotacao
    E preencho os campos do "<Campos Product Data>" obrigatorios do formulario de cotacao
    Quando preencho os campos do "<Campos Quote>" obrigatorios do formulario de cotacao
    E envio o formulario
    Entao Visualizo a mensage de sucesso "Sending e-mail success!"
    Exemplos:
      | Campos Vehicle     | Campos Insurant     | Campos Product Data | Campos Quote |
      | Enter Vehicle Data | Enter Insurant Data | Enter Product Data  | Send Quote   |



