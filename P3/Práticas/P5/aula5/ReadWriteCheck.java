package aula5;

import java.io.File;

import aula4.Disciplina;

public interface ReadWriteCheck {

	public void readCont(Disciplina d);
	
	public void writeCont(Disciplina d);
	
	public static boolean checkFile(String file){
		File f=new File(file);
		return f.exists() && f.isFile() && f.canRead() && f.canWrite();
	}
	
}
