# Aula de Spring 2: Annotations no Spring Framework

Bem-vindo à nossa aula de Spring 2! Nesta aula, vamos explorar o fascinante mundo das **annotations** (anotações) no contexto do Spring Framework.

## O que são Annotations?

Imagine a seguinte situação: você está lendo um livro e deseja destacar partes importantes com cores diferentes. Para fazer isso, você segue um código de cores, onde cada cor tem um significado específico. Por exemplo, você usa um adesivo amarelo para marcar partes muito importantes e um adesivo vermelho para indicar partes que você quer evitar.

As annotations no contexto do Spring são semelhantes a esses adesivos virtuais. Elas são como etiquetas ou notas que você pode colocar em partes do seu código para fornecer informações extras ou instruções para o compilador e outras ferramentas de desenvolvimento. Assim como os adesivos em um livro, as annotations não são código real, mas comentários especiais que o Java pode entender e usar para realizar ações específicas.

## Principais Annotations do Spring Framework

O Spring Framework oferece uma série de annotations úteis para simplificar o desenvolvimento de aplicativos. Vamos dar uma olhada em algumas delas:

## Core Spring Framework Annotations

#### `@Required`

- Usada em métodos de configuração de beans para garantir que propriedades obrigatórias sejam configuradas.

#### `@Autowired`

- Injeta dependências de objetos de forma implícita em campos, métodos setters e construtores.

#### `@Qualifier`

- Usada em conjunto com `@Autowired` para fornecer mais controle sobre a injeção de dependência.

#### `@Configuration`

- Usada para definir classes de configuração, substituindo a configuração XML.

#### `@ComponentScan`

- Indica ao Spring quais pacotes devem ser escaneados em busca de componentes anotados.

#### `@Bean`

- Usada para criar beans gerenciados pelo Spring, permitindo a injeção deles em outras partes da aplicação.

#### `@Lazy`

- Indica inicialização preguiçosa de um bean, ou seja, ele é carregado apenas quando solicitado.

#### `@Value`

- Usada para criar valores padrão para campos, construtores e métodos, frequentemente utilizada para obter valores de variáveis de ambiente.

## Stereotype Annotations

São usadas para definir o papel das classes em uma aplicação Spring.

#### `@Component`

- Marca uma classe como um componente Spring, permitindo a inversão de controle e injeção de dependência.

#### `@Controller`

- Indica que uma classe é um controlador Spring MVC.

#### `@Service`

- Marca uma classe que fornece algum serviço ou lógica de negócios.

#### `@Repository`

- Usada em classes que acessam o banco de dados, como classes repository ou DAO.

## Spring Boot Annotations

Usadas pelo Spring Boot para configurar projetos e abstrair configurações.

#### `@SpringBootApplication`

- Inclui automaticamente outras anotações como `@Configuration`, `@EnableAutoConfiguration` e `@ComponentScan`.

## Spring MVC and REST Annotations

Usadas para criar aplicativos web Spring.

#### `@Controller`

- Marca uma classe como um controlador Spring MVC.

#### `@RequestMapping`

- Mapeia solicitações HTTP para métodos de controle.

#### `@RequestParam`

- Extrai parâmetros de consulta de uma URL de solicitação.

#### `@PathVariable`

- Extrai valores de modelos de URI.

#### `@ModelAttribute`

- Liga um parâmetro de método ou valor de retorno a um atributo de modelo.

#### `@ResponseBody`

- Indica que o valor de retorno de um método deve ser serializado diretamente no corpo da resposta HTTP.

#### `@RestController`

- Uma versão especializada de `@Controller` usada em serviços web RESTful.

#### `@ResponseStatus`

- Define o código de status HTTP retornado por um método de serviço RESTful.

## Spring Cloud Annotations

Usadas para auxiliar na construção de microservices e integração com provedores de serviços em nuvem.

#### `@EnableDiscoveryClient`

- Ativa a descoberta e registro de serviços em sistemas de registro de serviço como Consul ou Eureka.

#### `@EnableFeignClients`

- Habilita o cliente Feign para fazer chamadas a serviços RESTful de maneira declarativa.

#### `@EnableCircuitBreaker`

- Habilita o circuit breaker para lidar com falhas de serviços externos e tornar a aplicação resiliente.

#### `@RefreshScope`

- Usada em classes ou métodos que precisam ser atualizados dinamicamente quando as configurações do aplicativo são alteradas.

## Spring Framework DataAccess Annotations

Relacionadas à camada de acesso a dados.

#### `@Repository`

- Indica que a classe é um repositório, geralmente usada com classes que acessam dados.

#### `@Transactional`

- Marca um método como transacional, onde todas as operações de banco de dados são tratadas como uma única operação.

#### `@Entity`

- Marca uma classe como uma entidade de banco de dados, comumente usada com JPA.

#### `@Query`

- Usada para construir consultas personalizadas em métodos de repositório.

## Spring Cloud Annotations

Relacionadas à execução de tarefas e agendamento de tarefas.

#### `@Async`

- Indica que um método deve ser executado de forma assíncrona, em segundo plano.

#### `@Scheduled`

- Agenda a execução de métodos em intervalos regulares.

## Spring Framework Testing Annotations

Usadas para configurar testes em aplicativos Spring.

#### `@RunWith(SpringRunner.class)`

- Permite a execução de testes de unidade e integração no contexto do Spring.

#### `@SpringBootTest`

- Indica que a classe de teste requer o ambiente do Spring para ser configurada, usada para testes de integração.

#### `@MockBean`

- Cria um mock de um bean do Spring durante os testes.

#### `@DataJpaTest`

- Usada para testes de acesso a dados.

#### `@AutoConfigureMockMvc`

- Configura controladores do Spring MVC em testes.

Essas são apenas algumas das annotations mais comuns no Spring Framework. Elas desempenham um papel fundamental na simplificação do desenvolvimento de aplicativos Spring e na melhoria da manutenção do código.

Nesta aula, você aprendeu sobre a importância das annotations no Spring Framework e explorou uma variedade delas, desde aquelas relacionadas à configuração e injeção de dependências até aquelas usadas em aplicativos web, testes e muito mais. À medida que você continua sua jornada no desenvolvimento Spring, encontrará e utilizará muitas outras annotations úteis para criar aplicativos robustos e eficientes.

## Documentação com Swagger

Nesta aula, vamos explorar a importância da documentação utilizando o Swagger.

Na vida de um desenvolvedor, é fundamental documentar nossos projetos. Quando se trata de uma API, que é uma interface de comunicação utilizada por outros softwares para integração, é essencial entender o que essa interface oferece e como integrá-la.

Um exemplo cotidiano disso é a API do Spotify. O Spotify disponibiliza uma API de integração que oferece uma série de métodos para integrar com seus recursos. Isso nos permite entender exatamente como implementar os recursos do Spotify em nosso sistema, sem a necessidade de adivinhação.

Para auxiliar nessa documentação, temos ferramentas como o Swagger.

O Swagger é um conjunto de ferramentas de código aberto que nos permite documentar nossas APIs de forma padronizada e interativa. Com o Swagger, podemos validar nossas requisições e obter uma interface gráfica intuitiva.

