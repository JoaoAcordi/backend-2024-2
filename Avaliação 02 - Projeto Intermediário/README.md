# Serviço de Localização

Este projeto é um serviço de localização desenvolvido com Node.js e Express. Ele permite converter coordenadas geográficas de graus decimais para graus, minutos e segundos (DMS) e armazena as últimas coordenadas enviadas.

## Índice

- [Visão Geral](#visão-geral)
- [Executando o Projeto](#executando-o-projeto)
  - [1. Instalando as Dependências](#1-instalando-as-dependências)
  - [2. Executando o Servidor](#2-executando-o-servidor)
- [Descrição das Rotas](#descrição-das-rotas)
  - [POST: /coordenadas](#post-coordenadas)
  - [GET: /coordenadas/ultima](#get-coordenadasultima)
  - [GET: /sobre](#get-sobre)

## Visão Geral

O serviço oferece as seguintes funcionalidades:
- Conversão de coordenadas em graus decimais para graus, minutos e segundos.
- Armazenamento e recuperação das últimas coordenadas enviadas.
- Informações.

## get-coordenadasultima

Armazenamento e recuperação das últimas coordenadas enviadas.

## post-coordenadas

Posta as coordenadas e converte as coordenadas em graus decimais para graus, minutos e segundos.

## get-sobre

Pega as informações do projeto e do aluno.