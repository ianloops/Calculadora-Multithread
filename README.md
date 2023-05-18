### Calculadora Multithread
</br>
O software é um calculadora multithread onde na qual um Server A trabalha com as quatro operações básicas: adição, subtração, multiplicação e divisão. Já o Server B trabalha nas operações de raiz quadrada, potenciação e porcetagem.

O usuário manda a operação completa. Ex: 10 + 10, o client identifica a operação através do sinal, determinando para qual servidor estará enviando, instanciando um novo socket com o servidor determinado, o Server A que é o responsável pela operação de adição, recebe e efetua o calculo solicitado retornando o resultado para o client.

--------------- Operações do server B ---------------

//Raiz Quadrada

Exemplo: 

sqrt 81

**9**

//Potenciação

Exemplo: 

2^2

**4**

//Porcentagem

Exemplo: 

15 % 200

**30**

-----------------------------------------------------

O projeto permite executar o server A, quanto o server B simultaneamente, além de permitir que o client seja execultando tanto mesma máquina, quanto em outra máquina que esteja na mesma rede, utilizando-se da host e porta da máquina que o servidor esteja sendo executado. 

Para execução do software, compilar e iniciar os dois arquivos de server, e em seguida um arquivo de client. 
