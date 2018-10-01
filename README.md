#Comunicação entre processos com thread pool

<p>
	Nesse trabalho foi implementado o modelo cliente servidor para a comunicação sincrona entre processos distintos. O Cliente manda solicitações com operador e operandos no seguinte modelo "Operador:operando1:operando2". O servidor por sua vez recebe a mensagem, pocessa o calculo matemático e manda a resposta de volta. Porém o servidor suporta multi-threads, dessa forma um cliente não precisa esparar o processamento do outro pois cada um trá seu processamento em uma thread separada. 
</p>
<p>
	com a thread pool é possivel criar um numero de threads em onde essas estao prontas para execucao. Dessa forma é mais rápido do que criar thread sob demanda ou limitar o numero de threads da aplicacao de acordo com o tamanho do pool.
</p>
<p>
	Os tres modelos implementados foram:
	<ol>
		<li>Single thread executor – tamanho do pool = 1</li>
		<li>Fixed thread executor – pool de tamanho fixo.</li>
		<li> Cached thread pool –tamanho ilimitado</li>
	</ol>
</p>
<p>	<pre>
	Exemplo de execução:
	Execute um dos modelos de servidor
		java DateServerSingle
	Execute o cliente com a operação matemática desejada
		Java DateClient "*:8:4"
	</pre>
	Obs: devido à velocidade da execução foi adicionado um sleep na thread para que se possa observar as várias threads.
</p>
