package aula4;

import aula3.Estudante;

public class Disciplina {
	
	private String nomeD;
	private String areaC;
	private int ect;
	private Professor docente;
	private Estudante[] alunos = new Estudante[0];
	
	public Disciplina(String nomeD, String areaC, int ect, Professor docente) {
		
		this.nomeD = nomeD;
		this.areaC = areaC;
		this.ect = ect;
		this.docente = docente;
	}
	
	public String getnomeD() {
		return this.nomeD;
	}
	
	public String getareaC() {
		return this.areaC;
	}
	
	
	public int getect() {
	    return this.ect;
	}
	
	public Professor getdocente() {
	    return this.docente;
	}
	
	public Estudante[] getAlunos() {
		return alunos;
	}
	
	public boolean addAluno (Estudante est) {
		Estudante[] stu = new Estudante[alunos.length+1];
		
		if(alunoInscrito(est.nMec())) return false;
		
		for(int i=0;i<alunos.length;i++) {
			stu[i] = alunos[i];
		}
			
		stu[alunos.length] = est;
		alunos = stu;
		return true;
	}
	
	public boolean delAluno(int nmec) {
		
		if(!alunoInscrito(nmec)) return false;
		
		Estudante[] stu = new Estudante[alunos.length-1];
		int j = 0;
		for(int i=0; i<alunos.length;i++) {
			if(!(alunos[i].nMec()==nmec))
				stu[j++] = alunos[i];
		}
		alunos = stu;
		
		return true;
	}
	
	public boolean alunoInscrito(int nmec) {
		
		for(int i=0;i<alunos.length;i++) 
			
			if(alunos[i].nMec()==nmec) 
				
				return true;
			
		return false;
			
	}
	public int numAlunos() {
		return alunos.length;
	}
	
	public Estudante[] getAlunos(String tipo){
		Estudante altipo[] = new Estudante[0];
		
		for(int i=0;i<alunos.length;i++){
			if(alunos[i].getClass().getSimpleName().equals(tipo)){
				altipo=addEst(altipo, alunos[i]);
			}
		}
		
		return altipo;
	}
	
	private Estudante[] addEst(Estudante[] est, Estudante novo){
		Estudante[] stu=new Estudante[est.length+1];
		
		for(int i=0;i<est.length;i++){
			stu[i]=est[i];
		}
		stu[est.length] = novo;
		return stu;
	}
	
	
	@Override
	public String toString() {
		return "Disciplina: " + this.nomeD + "(" + this.ect +" ECTS) da Area da" + this.areaC+ "\nResponsavel: "+ this.docente +"\nExistem " + numAlunos()+ " aluno(s) inscrito(s).";
	}
	
	
	
	
}
