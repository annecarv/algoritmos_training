## Anotações

### Static
Por exemplo, a classe Casa possui o atributo estático porta, pois todas as Casas possuem portas.

Entendendo static em Java pode ser um pouco complicado no início, mas vamos quebrá-lo em pedaços menores.

O que significa static?
Em Java, quando um membro (pode ser uma variável, método, bloco de código ou classe interna) é declarado como static, ele pertence à classe em vez de qualquer instância específica (objeto) da classe. Isso significa que você pode acessar o membro estático sem criar um objeto da classe.

Características:
Memória: Membros estáticos são armazenados em uma área de memória específica chamada área de métodos, e não no heap. Eles são carregados na memória uma vez que a classe é carregada, independentemente de qualquer objeto ser criado ou não.

Compartilhado: Como membros estáticos não pertencem a um objeto específico, eles são compartilhados por todas as instâncias da classe. Se uma instância modificar uma variável estática, todas as outras instâncias verão a modificação.

Acesso: Membros estáticos são acessíveis usando o nome da classe (sem a necessidade de criar um objeto). Por exemplo, se tivermos uma variável estática count na classe MyClass, podemos acessá-la como MyClass.count.

Quando usar static?
Contadores: Se você deseja contar quantas vezes uma determinada ação ocorreu, quantos objetos de uma classe foram criados, etc. Por exemplo, você pode usar uma variável estática para contar quantos objetos de uma classe foram criados.

Utilitários: Funções que não dependem dos valores dos campos de objeto. Por exemplo, Math.min() ou Math.max() são funções estáticas porque não faz sentido ter diferentes versões dessas funções para diferentes objetos.

Configurações Constantes: Se uma determinada propriedade é comum a todos os objetos e não muda, ela pode ser declarada como static final. Por exemplo, uma taxa de juros que é comum a todas as contas em um banco.

Singleton Pattern: Se você quiser garantir que apenas uma instância de uma classe seja criada durante a execução do programa.

Quando não usar static?
Valores específicos de instância: Se um valor deve ser diferente de um objeto para outro, ele não deve ser estático. Por exemplo, o nome de um Student ou o saldo de uma BankAccount.

Polimorfismo: Métodos estáticos não podem ser sobrescritos (embora possam ser ocultados), então se você precisa de polimorfismo, não use static.

Membros que operam em membros não estáticos: Se um método opera em membros não estáticos da classe, ele não deve ser estático.

Em resumo, static é útil quando algo deve ser compartilhado por todos os objetos ou é independente dos objetos. No entanto, se algo está associado a um objeto específico, ele deve ser um membro não estático.