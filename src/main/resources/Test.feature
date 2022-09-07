# new feature
# Tags: optional
# language: pt

Funcionalidade: Executar testes automatizados em uma aplicação de simulação de cotação de veículos

  Contexto: Acessar o sistema de cadastro
    Dado que tenho acesso ao sistema

  @testWeb @step-by-step
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




