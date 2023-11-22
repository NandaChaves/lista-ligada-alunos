package exemplo1_1_Listas;

public class ListaAluno {
private Aluno prim;

/**
 * @param prim
 */
public ListaAluno() {//public ListaAluno(Aluno prim) {
	
	prim=null; //this.prim = prim;
}

/**
 * @param novoAl a referencia de um novo objeto Aluno
 * metodo para isnerir um novo aluno no inicio da lista
 */
public void insereInicio(Aluno novoAl)
{ novoAl.setProxAl(prim);
	prim=novoAl;
}// fim inserirInicio

/**
 * @param novoAl a referencia de um novo objeto Aluno
 * metodo para isnerir um novo aluno no fim da lista
 */
public void insereFim(Aluno novoAl)
{ 
	if (prim==null) // a lista está vazia?
		prim=novoAl;
	else {// procurar a referencia do ultimo aluno na lista
		Aluno temp=prim;
		while (temp.getProxAl()!=null)
			{temp = temp.getProxAl();}
		temp.setProxAl(novoAl); // o proximo do ultimo é o novo aluno
	}
}// fim inserirFim

/** 
 * metodo para imprimir a informação da lista
 */
public void imprimeLista()
{Aluno temp=prim;
	while (temp!=null)
	{
		System.out.println(temp.getNome() + " " + temp.getNumero());
		temp = temp.getProxAl();
	}
} // fim imprimir

} // fim classe
