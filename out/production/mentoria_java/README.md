### Zero or One

Everyone probably knows the game Zero or One (in some regions in Brazil also known as Two or One ), used to determine a winner among three or more players. For those who are unfamiliar, the game works as follows. Each player chooses a value between zero or one; prompted by a command (usually one of the contestants announces “Zero or... One!”), all participants show the value chosen using a hand: if the value chosen is one, the contestant shows a hand with an extended index finger; if the value chosen is zero, the contestant shows a hand with all fingers closed. The winner is the one who has chosen a value different from all others. If there is no player with a value different from all others (e.g. all players choose zero, or some players choose zero and some players choose one), there is no winner. Alice, Bob and Clara are great friends and play Zerinho all the time: to determine who will buy popcorn during the movie session, who will enter the swimming pool first, etc.. They play so much that they decided make a plugin to play Zerinho on Facebook. But since they don’t know how to program computers, they divided the tasks among friends who do know, including you. Given the three values chosen by Alice, Bob and Clara, each value zero or one, write a program that determines if there is a winner, and in that case determines who is the winner.

Input
TThe input contains several test cases. Each test case contains a single line, with three integers A , B and C (each one can be 0 or 1),indicating respectively the values chosen by Alice, Beto and Clara. The end of input is determined by EOF.

Output
For each test case your program must output a single line, containing a single character. If Alice is the winner the character must be ‘ A ’, if Beto is the winner the character must be ‘ B ’, if Clara is the winner the character must be ‘ C ’, and if there is no winner the character must be ‘ * ’ (asterisc).

### Gangorra

Joãozinho acaba de mudar de escola e a primeira coisa que percebeu na nova escola é que a gangorra do parquinho não é simétrica, uma das extremidades é mais longa que a outra. Após brincar algumas vezes com um amigo de mesmo peso, ele percebeu que quando está em uma extremidade, a gangorra se desequilibra para o lado dele (ou seja, ele fica na parte de baixo, e o amigo na parte de cima), mas quando eles trocam de lado, a gangorra se desequilibra para o lado do amigo. Sem entender a situação, Joãozinho pediu ajuda a outro amigo de outra série, que explicou que o comprimento do lado interfere no equilíbrio da gangorra, pois a gangorra estará equilibrada quando

P1 ∗ C1 = P2 ∗ C2

onde P1 e P2 são os pesos da criança no lado esquerdo e direito, respectivamente, e C1 e C2 são os comprimentos da gangorra do lado esquerdo e direito, respectivamente.

Entrada
A primeira e única linha da entrada contém 4 inteiros, P1, C1, P2 e C2, (10 ≤ P1, C1, P2 e C2 ≤ 100) nesta ordem.

Saída
Se a gangorra estiver equilibrada, imprima ‘0’. Se ela estiver desequilibrada de modo que a criança esquerda esteja na parte de baixo, imprima ‘-1’, senão, imprima ‘1’.