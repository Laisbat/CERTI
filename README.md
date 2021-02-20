![IS_Horizontal_Colorida_CMYK](https://user-images.githubusercontent.com/20651268/108606815-2b638680-739b-11eb-8239-5514cea1da54.png)

<p align="center">
   <a href="#dart-objetivo">Objetivo</a> •
   <a href="#memo-roadmap">Roadmap</a> •
   <a href="#gear-requisitos">Pré-requisitos</a> •
   <a href="#rocket-como-executar-o-projeto">Como executar o projeto</a> •
   <a href="#woman_technologist-sobre-mim">Sobre mim</a>
</p>

## :dart: **Objetivo**
   Criar um servidor HTTP que, para cada requisição GET, retorne um JSON cuja chave extenso seja a versão por extenso do número inteiro enviado no path. Exemplos: 
   
```bash   
    $ curl http://localhost:3000/1
    # { "extenso": "um" }
    $ curl http://localhost:3000/-1042
    # { "extenso": "menos mil e quarenta e dois" }
    $ curl http://localhost:3000/94587
    # { "extenso": "noventa e quatro mil e quinhentos e oitenta e sete" }
```


## :memo: **Roadmap**
<p>

- [x] Implementar o desfio
- [ ] Implementar testes unitário
- [ ] Ambiente Docker 
- [x] Fazer um bom README

</p>

## :gear: **Requisitos**

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:
[Git](https://git-scm.com), [Maven](https://maven.apache.org/). 
Não é necessário ter uma IDE instalada, porém, caso queira eu recomendo o maravilhoso [InteliJ](https://www.jetbrains.com/idea/promo/?gclid=CjwKCAiAg8OBBhA8EiwAlKw3kiFN_3J8Up-Er7ITBBrvEgDnvQGePPfETugXYLD--GoVJsOVfgjf3hoCv78QAvD_BwE).

## :rocket: **Como executar o projeto**
### 🎲 Rodando o Back End (servidor)

```bash
# Clone este repositório
$ git clone <https://github.com/Laisbat/CERTI.git>

# Acesse a pasta do projeto no terminal/cmd
$ cd CERTI

# Instale as dependências
$ mvn clean install -DskipTests

# Para iniciar o servidor
$ mvn spring-boot:run -DskipTests

# O servidor inciará na porta:8080 - acesse <http://localhost:8080/>
$ Prontinho, só passar o parâmetro. Exemplo: <http://localhost:8080/1984>
```

## :woman_technologist: **Sobre mim**

<p>Formada em Análise e desenvolvimento de sistemas pelo UniCEUB (2018). Apaixonada por:🎮💻🚴‍♀️🏊‍♀️ 🎵🍴</p>

[![Linkedin Badge](https://img.shields.io/badge/-Lais-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/laisbatistapereira/)](https://www.linkedin.com/in/laisbatistapereira/)
[![Gmail Badge](https://img.shields.io/badge/-laisbatistapereira@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:laisbatistapereira@gmail.com)](mailto:laisbatistapereira@gmail.com)




