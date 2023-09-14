### 1. Mean Median Problem
The mean of three integers A, B and C is (A + B + C)/3. The median of three integers is the one that would be in the middle if they are sorted in non-decreasing order. Given two integers A and B, return the minimum possible integer C such that the mean and the median of A, B and C are equal.

Input
Each test case is given in a single line that contains two integers A and B (1 ≤ A ≤ B ≤ 109). The last test case is followed by a line containing two zeros.

Output
For each test case output one line containing the minimum possible integer C such that the mean and the median of A, B and C are equal.


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

### Top N
The regional phase of the SBC Programming Contest happened recently, where more than 600 teams participated in more than 40 cities around Brazil. Your friend competed, and when asked about his position he told you: “I got placed in the top 10”.

You were happy for your friend, but you could not stop asking yourself about what was his real position. “Top 10” could mean any position between first and tenth placed, however if he had placed first he would have said “Top 1”, if he had placed second or third he would have said “Top 3”, and if he had placed fourth or fifth he would have said “Top 5”. Therefore, his real position was between sixth and tenth, because people tend to put themselves in the lowest category they belong.

You gathered all the categories people most use: 1, 3, 5, 10, 25, 50 and 100. Given a position K, write an algorithm that says the number of the lowest category this position belongs.

Input
Each test case has one integer K, representing a position (1 ≤ K ≤ 100).

Output
For each test case you should print one line with the sentence “Top N”, and replace N by the number of the lowest category the position K belongs.

### Chocolate Factory
One factory produces chocolate bars in cubes and parallelepipeds with the same volume. However, since the machine that produces chocolate cubes has been showing some problems, the owners asked you for help to fix this problems.

Your task is, given the size of the edges of the parallelepipeds chocolate, inform the size the edge of the cube form should have.

Input
The input contains several test cases. The first line of each test case contains three integers A, B and C (1 ≤ A, B, C ≤ 103), indicating the size of the edges of the parallelepiped. The input ends when A = B = C = 0, and should not be processed.

Output
For each input, you must print an integer that should be truncated, representing the size that the edge in cube form should have.
