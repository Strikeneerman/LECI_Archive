package aula5;

public class UtilCompare {
	
public static <T> void sortArray(Comparable<T>[] a){
		
		int i=a.length-1;
		boolean troca=true;
		while (troca){
			troca = false;
			for(int j=0;j<i;j++){
				if(a[j].compareTo((T)a[j+1])>0){
					Comparable<T> temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					troca = true;
				}
				
			}
			i--;
		}
		
	}
public static <T> Comparable<T> findMax(Comparable<T>[] a){
	int maxIndex = 0;
	
	for( int i = 1; i < a.length; i++ )
		if( a[i].compareTo((T)a[maxIndex]) > 0 )
			maxIndex = i;
	return a[maxIndex];
}
}

