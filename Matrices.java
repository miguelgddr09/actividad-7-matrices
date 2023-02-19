package matricesTarea;

public class Matrices {
	
	int columns1st, columns2nd;
	int rows1st, rows2nd;
	
	public void multiplicacion(int[][] matrix1, int[][] matrix2) {
		
		
		int col1=matrix1[0].length; //columns of 1
		int rows2=matrix2.length; //rows of 2
		//number of columns 1st M == number of rows 2nd M
		
		if(col1==rows2) {
			
			System.out.println("The matrices are valid for multiplication...");
			System.out.println();
			int rowsR=matrix1.length;
			int colR=matrix2[0].length;
			
			//result has same number of rows 1st M and columns as 2nd M
			int[][] resulting=new int[rowsR][colR];
			
			//rows of 1st
			for(int i=0; i<rowsR; i++) {
				//col of 2nd
				for(int j=0; j<colR; j++) {
					//col of 1
					for(int k=0; k<col1; k++) {
						//i and j are the measures for result, ik are rows and colums of 1
						//k j are columns of 1==rows 2 and col of 2
						resulting[i][j]+=matrix1[i][k]*matrix2[k][j];
					}
					
				}
			}
			
			//print
			System.out.println("The result is...");
			for(int i=0; i<resulting.length; i++) {
				for(int j=0; j<resulting[0].length; j++) {
					System.out.print(resulting[i][j] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		else {
			System.out.println("These are not valid for the multiplication process....;");
		}	
	}
	
	public void transpose(int[][] matrix ){
		
		//[b]= mxn [b]t= nxm
		int col=matrix[0].length;
		int row=matrix.length;
		
		int[][] resulting = new int[col][row];
		
		//swap rows and columns
		//first row into first column
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				
				resulting[j][i]+=matrix[i][j];
				
			}
		}
		
		System.out.println("The resulting matrix is ");
		for(int i=0; i<resulting.length; i++) {
			for(int j=0; j<resulting[0].length; j++) {
				System.out.print(resulting[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void sumaDiagonal(int[][] matrix) {
		
		//matriz cuadrada como entrada
		//suma de los elementos de la diagonal principal 
		int col=matrix[0].length;
		int rows=matrix.length;
		
		//result
		int resulting=0;
		
		if(col!=rows) {
			System.out.println("Not a squared matrix.....");
		}
		else {
			
			/*	  i
			 * [1][][]
			 * [][2][]
			 *j[][][3]*/
			
			for(int i=0; i<rows; i++) {
				for(int j=0; j<col; j++) {
					//ex. 0,0;1,1;2,2 etc sums diagonally
					if(i==j) {
						resulting+=matrix[i][j];
					}
				}
			}
			
			System.out.println("The diagonal sum is equal to " + resulting);
		}
		System.out.println();
	}
	
	public void maximo(int[][] matrix) {
		
		int rows=matrix.length;
		int col=matrix[0].length;
		
		int max=0;
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<col; j++) {
				if(matrix[i][j]>max) {
					max=matrix[i][j];
				}
			}
		}
		
		System.out.println("The maximmum in this matrix is " + max);
		System.out.println();
		
	}
	
	public void suma(int[][] matrix1, int[][] matrix2) {
	
		//same size rows=rows col=col
		
		int rows1, rows2;
		int col1,col2;
		
		rows1=matrix1.length;
		rows2=matrix2.length;
		col1=matrix1[0].length;
		col2=matrix2[0].length;
		
		int[][] resulting=new int[rows1][col1];
		
		if(rows1==rows2 && col1==col2) {
			
			for(int i=0; i<rows1; i++) {
				
				for(int j=0; j<col1; j++) {
					resulting[i][j]+=matrix1[i][j]+matrix2[i][j];
				}
			}
			System.out.println("The resulting matrix is ");
			for(int i=0; i<resulting.length; i++) {
				for(int j=0; j<resulting[0].length; j++) {
					System.out.print(resulting[i][j] + "\t");
				}
				System.out.println();
			}
			
			System.out.println();
			
		}
		else {
			System.out.println("The matrices are not the same size...");
		}		
	}
	
	public void multiplicacionXescalar(int[][] matrix, int escalar) {
		
		int rows=matrix.length;
		int col=matrix[0].length;
		
		int[][] resulting=new int[rows][col];
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<col; j++) {
				resulting[i][j]+=matrix[i][j]*escalar;
			}
		}
		System.out.println("The resulting matrix is ");
		for(int i=0; i<resulting.length; i++) {
			for(int j=0; j<resulting[0].length; j++) {
				System.out.print(resulting[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
	}
	
}
