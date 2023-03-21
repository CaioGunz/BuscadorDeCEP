# Buscador De Cep

Este projeto foi criado para ser um buscador de CEP (apenas CEP brasileiros) e pode ser aclopado a uma aplicação na qual precise buscar um endereço atravez de um CEP. Foi utilizado o **Swing** para faz o design da aplicação e o WebService [**Republica Virtual**](https://republicavirtual.com.br/) que é o serviço de buscador de CEP. E as seguintes blibiotecas **Atxy2k** e **dom4j**.

## Views

As views ficaram assim: 
A view Principal foi criado na classe **JFrame** e ficou com os dados do *CEP, Endereço, Bairro, Cidade e UF*. Além disso ficou com 3 botões, *um de Buscar, um de Limpar e o outro de Sobre*. Segue imagen: 
![TelaPrincipal](https://user-images.githubusercontent.com/62664817/226195038-86222a87-ecbe-45be-9344-790a5d539027.PNG)

A view Sobre foi criado na classe **Dialog** e ficou com os dados da *versão do projeto, o autor, o link do WebService utilizado e o link do projeto no GitHub*. Segue Imagem:

![TelaSobre](https://user-images.githubusercontent.com/62664817/226195104-c783190e-0181-475d-b43c-4c221ebcfd0b.PNG)

### Como deve mostrar a consulta
Segue a imagem de como é o resultado da consulta no sistema: 

![ExemploPreenchido](https://user-images.githubusercontent.com/62664817/226195142-7e43639f-35f3-4eb5-aaf6-f8c16f5b41db.PNG)

