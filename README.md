# GardenProject
Este projeto é para o treinamento de Java
- Rode a aplicação através do método main na classe Application
- Preencha as informações (Seu nome, número de jardins e por ultimo quantas plantas por jardim)

A intenção do projeto é de mostrar a criação de vários jardins, cada um com um certo número de plantas. O console irá imprimir o seu jardim com o maior número de plantas.

## Classes
### Owner
- Esta classe representa o usuário/dono da "Floresta privada" ou conjunto de jardins, ou seja, cada jardim terá seu respectivo dono, este dono também possui um nome, o método getBiggestGarden irá retornar o jardim que possui o maior número de plantas.
### Garden
- Esta classe representa o jardim, que basicamente é um conjunto de plantas, possui nome próprio  e também possui um dono (classe Owner). Ele possui o método addPlants que pode adicionar uma lista de plantas, assim como uma planta individual. O método getPlantByName retornará uma planta que será filtrada através do nome. O método removePlant usará a pesquisa também através do nome da planta indicado.
### Plant
- Esta classe representa a planta, que possui apenas o seu nome
### UniversalBuilder
- Esta classe é apenas um utilitário para criação de Plantas, Jardins e Usuário.
