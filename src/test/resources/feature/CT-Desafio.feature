# language: pt
@tag
Funcionalidade: Comprar produtos
 

  @tag1
  Cenario: Comprar produtos
    Dado que eu esteja no site "https://www.saucedemo.com/"
    Quando logar com username e senha
    E adicionar o produto ao carrinho 
    E preencher as informações necessarias 
    Então será exibida a seguintr mensagem: Obrigado pelo seu pedido