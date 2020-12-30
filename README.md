# accenture-test-automation

**Como executar:**
- Para baixar o projeto: 
  git clone https://github.com/tamaniniandre/accenture-test-automation.git
- Para execução dos testes utilizar o runner: "RunTestngFeatureTests"
  - Clicar com o botão direito e RUN.
  - Está configurado para rodar em paralelo.
- Também é possível executar utilizando o MAVEN através da linha de comando:
   - mvn clean test -Dtest=com.accenture.test.automation.runners.RunTestngFeatureTests
- Também é possível executar pelo cucumber feature, as features se encontram em: src/test/resources/features
   
Ps. Para execução pelo Maven, é necessário a sua instalação, tutorial:
   https://mkyong.com/maven/how-to-install-maven-in-windows/
   
   **Tecnologias/APIs utilizadas:**
- Selenium Web Driver
- Cucumber
- Cucumber Picocontainer
- Cucumber courgette
- TestNG.
- JavaFaker
- Linguagem de Programação Java.
- Maven.

**Reports:**
- Após a execução dos testes, dentro da pasta Report na raíz do projeto teremos duas pastas com os respectivos html:
    - cougertte-reports
