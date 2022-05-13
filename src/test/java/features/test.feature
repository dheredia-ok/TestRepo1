Feature: Categoría Cómics
  Como usuario, quiero leer chistes de testers para reírme y pasar un buen rato.

  Scenario: Ingresar a la categoría 'Comics' desde la pantalla 'Home'

    Given El usuario se encuentra en la pantalla Home de I'm a Little Tester
    When Hace clic en The Little Testers Comic
    Then Se debe redirigir a la pantalla Comics