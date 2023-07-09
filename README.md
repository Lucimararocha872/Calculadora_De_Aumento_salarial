# Calculadora de Aumento Salarial :moneybag:

Para otimizar o processo de aumento salarial de uma empresa, o setor de recursos humanos solicitou ao setor de TI que desenvolvesse um programa para realizar o cálculo do aumento de salário dos funcionários baseados em determinada porcentagem.

O programa deve ser os seguintes dados:

:file_folder: Id (deve ser único, e é utilizado para localizar o funcionário que terá o salário aumentado;

:file_folder: Nome;

:file_folder: $alário.

O setor responsável, sabiamente utilizando a querida linguagem java :coffee:, desenvolveu o sistema que, funciona solicitando os dados do funcionário ao usuário do RH e os armazena em listas com os respctivos dados de cada um dos funcionários. 

Para tanto foi crianda a classe **Employee** que guarda esses dados como atributos encapsulados, e o método **salaryIncrease** para realizar o cálculo de aumento do salário baseado em uma determinada porcentagem:

 ![Diagrama classes lista](https://github.com/Lucimararocha872/Calculadora_De_Aumento_salarial/assets/96544129/e42d8354-4359-40ad-8c5f-7b5177783c31)

## Demo

- O programa lê os dados dos funcionários, instacia na classe **Employee** e esses novos objetos são adicionados na lista(list) do tipo Employee.
Então, solicita que seja digitado um id para saber quem funcionário da lista deve aumentar, em seguida solicita a porcentagem e através do método **salaryIncrease** faz o cálculo seguido da impressão na tela a lista com todos os funcionários através do método **toString**, com o devido salário aumentado.

![demo salary increase calculator](https://github.com/Lucimararocha872/Calculadora_De_Aumento_salarial/assets/96544129/081b312f-66db-4135-90ca-5360d7bbeb9a)

- Neste caso, O programa faz a verificação do id, e ao constar que ele não existe na lista através do método auxiliar **positionId**, ele exibe a mensagem que o Id não foi encontrado seguido pelos dados dos funcionários da lista, sem aumentar nenhum salário. 

![demo2 salary increase calculator](https://github.com/Lucimararocha872/Calculadora_De_Aumento_salarial/assets/96544129/23438c24-4732-48d3-bad5-524ba0bc4a11)

## Para testar o programa:

Clone o repositório ou extraia os arquivos e posteriormente abra o projeto em uma IDE (eu utilizei o eclipse para desenvolver), compile o projeto e aumente o salário dos seus funcionários fictícios (ou não rs) que merecem! :dollar::smiley:
