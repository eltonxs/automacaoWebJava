@login
Feature: Teste Automacao

  Aula do modulo 1

  Background:
#    Given realize login no site sauce demo
#    And estou na tela inicial

  Scenario: Validar titulo do pedido na tela de checkout
    Given realize login no site sauce demo
    And estou na tela inicial
    When seleciono a blusa noir jacket
    And escolho o tamanho "L"
    And escolho a cor "Red"
    And clico no botao adicionar ao carrinho
    And clico no botao do menu checkout
    Then verifico se o titulo do pedido esta correto
    