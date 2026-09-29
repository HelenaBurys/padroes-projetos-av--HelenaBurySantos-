Questão 1 (1,25 ponto): Emissão de Apólices de Seguro
Entregável: código-fonte Java na pasta questao1/src/. O diagrama de classes não precisa ser entregue
nesta questão.
Contexto de negócio
Uma seguradora emite apólices de três linhas de produto: Auto, Residencial e Vida. Atualmente, a rotina de
emissão fica em uma única classe que usa if e switch para decidir qual apólice criar, e cada nova linha de
produto obriga a alterar e testar novamente esse código.
Nesse contexto, a área de tecnologia decidiu reescrever a rotina. O procedimento de emissão é o mesmo
para todas as linhas: criar a apólice, calcular o prêmio mensal e imprimir o resumo. O que varia de uma
linha para outra é apenas o tipo de apólice criada.
Requisitos funcionais
• RF01 (Apólice Auto): prêmio mensal igual a 8% do valor do veículo, dividido por 12. Documentos    
exigidos: CNH e CRLV.
• RF02 (Apólice Residencial): prêmio mensal igual a 1,5% do valor do imóvel, dividido por 12.
Documentos exigidos: escritura ou contrato de locação.
• RF03 (Apólice Vida): prêmio mensal igual a 3% do capital segurado, dividido por 12. Documentos
exigidos: documento de identidade e CPF.
• RF04 (Resumo): toda emissão imprime a linha de produto, o nome do segurado, o prêmio mensal e
os documentos exigidos.
Requisitos não funcionais
• RNF01: o procedimento de emissão (criar, calcular e imprimir o resumo) deve ser escrito uma única
vez, em um único lugar, e não pode ser alterado quando surgirem novas linhas de produto.
• RNF02: o procedimento de emissão não pode conhecer as classes concretas de apólice; ele trabalha
apenas com a abstração de apólice. A decisão sobre qual apólice concreta criar fica a cargo de um
componente de emissão especializado em cada linha de produto.
• RNF03: a inclusão de uma nova linha de produto (por exemplo, Viagem) deve exigir apenas a criação
de classes novas, sem alteração de nenhuma classe existente.
• RNF04: o código cliente não pode instanciar diretamente nenhuma apólice concreta nem usar if ou
switch para decidir o tipo de apólice.
Tarefa
Assim, identifique o padrão de projeto que atende aos requisitos não funcionais e implemente a solução
em Java. A classe Main deve emitir uma apólice de cada linha de produto e imprimir os três resumos.