package matricesTarea;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Matrices ob1=new Matrices();
		
		int[][] matrix1= {{2,1},{3,6}};
		int[][] matrix2= {{4,5},{5,1}};
		
		System.out.println("************ Actividad 7 matrices ************");
		System.out.println();
		
		ob1.multiplicacion(matrix1, matrix2);
		ob1.transpose(matrix1);
		ob1.sumaDiagonal(matrix2);
		ob1.maximo(matrix2);
		ob1.suma(matrix1, matrix2);
		ob1.multiplicacionXescalar(matrix1, 2);
		
	}

}
