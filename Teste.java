package exemplo1_1_Listas;

public class Teste {

	public static void main(String[] args) {
		// criar a Lista de alunos
		ListaAluno alunosED = new ListaAluno();
		// criar objeto aluno
		Aluno al = new Aluno(5, "maria");
		// inserir a Maria no fim da lista
		alunosED.insereFim(al);
		// criar objeto aluno
		 al = new Aluno(15, "vasco");
		// inserir o Vasco no fim da lista
		alunosED.insereFim(al);
		// criar objeto aluno
		 al = new Aluno(30, "Joel");
		// inserir o Joel no inicio da lista
		alunosED.insereInicio(al);
		// imprimir a lista de alunos
		alunosED.imprimeLista();
		// criar objeto aluno
		 al = new Aluno(38, "Jose");
		// inserir o Jose no inicio da lista
		alunosED.insereInicio(al);
		// imprimir de novo a lista de alunos
		System.out.println("nova lista:");
		alunosED.imprimeLista();
		System.out.println("imprimir o ultimo aluno inserido:");
		System.out.println(al);
		System.out.println("porque é que apareceu a referencia e nao a informação?");
	}

}
