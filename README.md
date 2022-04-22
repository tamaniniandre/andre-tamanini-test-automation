# andre-tamanini-test-automation

**How to execute:**
- Download the project: 
  git clone https://github.com/tamaniniandre/andre-tamanini-test-automation.git
- To execute the automated tests, you can run the runner class: "RunTestngFeatureTests"
  - Right-click on the class and RUN.
  - The runner class is configured to run in parallel.
- It is possible to execute using the Maven through the command line too
   - mvn clean test -Dtest=RunTestngFeatureTests
- It is possible to execute by cucumber feature too, the features path is: "src/test/resources/features    
- **The current chrome version supported is 100, so if necessary, update or downgrade your chrome driver here:**
- https://chromedriver.chromium.org/downloads

**- Download the chromedriver according to yout browser and save it at src/main/resources/drivers**

Ps. To execute by Maven is necessary its installation, by the following tutorial:
   https://mkyong.com/maven/how-to-install-maven-in-windows/
   
  **Technologies:**
- Selenium Web Driver
- Cucumber
- Cucumber Picocontainer
- Cucumber courgette
- TestNG.
- JavaFaker
- Linguagem de Programação Java.
- Maven.

**Reports:**
- After the execution of the automated tests, inside the Report folder, in the root of the project, the HTML-report will be generated:
    - cougertte-reports


**Como executar:**
- Para baixar o projeto: 
  https://github.com/tamaniniandre/andre-tamanini-test-automation.git
- Para execução dos testes utilizar o runner: "RunTestngFeatureTests"
  - Clicar com o botão direito e RUN.
  - Está configurado para rodar em paralelo.
- Também é possível executar utilizando o MAVEN através da linha de comando:
   - mvn clean test -Dtest=RunTestngFeatureTests
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
- Após a execução dos testes, dentro da pasta Report na raíz do projeto, será gerado o html reporter:
    - cougertte-reports
