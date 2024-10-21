package Group18;
import java.util.Scanner;
import java.util.Timer;
import static java.lang.System.exit;


public class Group18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        MatrixCalculator calculator = new MatrixCalculator();

        while (true) {
            System.out.println("Matrix Operations Menu:");
            System.out.println("Choose one of the options below");
            System.out.println("1. Matrix Addition");
            System.out.println("2. Matrix Subtraction");
            System.out.println("3. Matrix Multiplication");
            System.out.println("4. Scalar Division of the Matrix");
            System.out.println("5. Scalar Multiplication of the Matrix");
            System.out.println("6. Transpose of the Matrix");
            System.out.println("7. Inverse of the Matrix");
            System.out.println("8. Trace of the Matrix");
            System.out.println("9. Adjoint of the Matrix");
            System.out.println("10. Check the Matrix for Orthogonality");
            System.out.println("11. Terminate");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    calculator.performMatrixAddition();
                    break;
                case 2:
                    calculator.performMatrixSubtraction();
                    break;
                case 3:
                    calculator.performMatrixMultiplication();
                    break;
                case 4:
                    calculator.performScalarDivision();
                    break;
                case 5:
                    calculator.performScalarMultiplication();
                    break;
                case 6:
                    calculator.performTranspose();
                    break;
                case 7:
                    calculator.performMatrixInverse();
                    break;
                case 8:
                    calculator.performMatrixTrace();
                    break;
                case 9:
                    calculator.performMatrixAdjoint();
                    break;
                case 10:
                    calculator.performMatrixOrthogonality();
                    break;
                case 11:
                    System.out.println("Terminating the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
class MatrixCalculator {


    public void performMatrixAddition() {
    	Scanner scanner = new Scanner(System.in);

		boolean error = false;
		
		
		while(!error){
			
		
			System.out.println("The size of the matricies should be between 2 and 5.");
			System.out.println("You need to leave a space between each of the elements of the matrix.");
			System.out.println("First Matrix's Row: ");
			int rows = scanner.nextInt();
			System.out.println("First Matrix's Column: ");
			int columns = scanner.nextInt();
			System.out.println("Second Matrix's Row: ");
			int rows2 = scanner.nextInt();
			System.out.println("Second Matrix's Column: ");
			int columns2 = scanner.nextInt();
			
			if((rows == columns) && (rows == rows2) && (columns == columns2) && (rows2 == columns2)){
				error = true;

				float[][] matrix1 = new float[rows][columns];
				float[][] matrix2 = new float[rows2][columns2];

				System.out.println("Enter elements for the first matrix:");
				for (int i = 0; i < rows; i++) {
					for (int j = 0; j < columns; j++) {
						matrix1[i][j] = scanner.nextFloat();
					}
				}

				System.out.println("Enter elements for the second matrix:");
				for (int i = 0; i < rows2; i++) {
					for (int j = 0; j < columns2; j++) {
						matrix2[i][j] = scanner.nextFloat();
					}
				}

				float[][] result = add(matrix1, matrix2);

				System.out.println("Result Matrix:");
				for (int i = 0; i < rows; i++) {
					for (int j = 0; j < columns2; j++) {
						System.out.print(result[i][j] + " ");
					}
					System.out.println();
				}
			}else{
				System.out.println("The values aren't equal. Try again!");
			}
		}
	}

    public static float[][] add(float[][] matrix1, float[][] matrix2) {
        int rows1 = matrix1.length;
        int columns2 = matrix2[0].length;
        float[][] result = new float[rows1][columns2];

        for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < columns2; j++) {
                    result[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }

        return result;
        
    }


    public void performMatrixSubtraction() {

        Scanner scanner = new Scanner(System.in);
		
		boolean error = false;
		
		while(!error){

			System.out.println("The size of the matricies should be between 2 and 5.");
			System.out.println("You need to leave a space between each of the elements of the matrix.");
			System.out.println("First Matrix's Row: ");
			int rows = scanner.nextInt();
			System.out.println("First Matrix's Column: ");
			int columns = scanner.nextInt();
			System.out.println("Second Matrix's Row: ");
			int rows2 = scanner.nextInt();
			System.out.println("Second Matrix's Column: ");
			int columns2 = scanner.nextInt();
		
			if((rows == columns) && (rows == rows2) && (columns == columns2) && (rows2 == columns2)){
				error = true;

				float[][] matrix1 = new float[rows][columns];
				float[][] matrix2 = new float[rows2][columns2];

				System.out.println("Enter elements for the first matrix:");
				for (int i = 0; i < rows; i++) {
					for (int j = 0; j < columns; j++) {
						matrix1[i][j] = scanner.nextFloat();
					}
				}

				System.out.println("Enter elements for the second matrix:");
				for (int i = 0; i < rows2; i++) {
					for (int j = 0; j < columns2; j++) {
						matrix2[i][j] = scanner.nextFloat();
					}
				}

				float[][] result = substract(matrix1, matrix2);

				System.out.println("Result Matrix:");
				for (int i = 0; i < rows; i++) {
					for (int j = 0; j < columns2; j++) {
						System.out.print(result[i][j] + " ");
					}
					System.out.println();
				}
			}
			else{
				System.out.println("The values aren't equal. Try again!");
			}
		}
	}

    public static float[][] substract(float[][] matrix1, float[][] matrix2) {
        int rows1 = matrix1.length;
        int columns2 = matrix2[0].length;
        float[][] result = new float[rows1][columns2];

        for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < columns2; j++) {
                    result[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }

        return result;
        
    }


    public void performMatrixMultiplication() {

        Scanner scanner = new Scanner(System.in);
		
		System.out.println("According to the rules of matrix multiplaction the column size of the first matrix and the row size of the second matrix must be same.");
		System.out.println("The size of the matricies should be between 2 and 5.");
        System.out.println("First Matrix's Row: ");
        int rows = scanner.nextInt();
        System.out.println("First Matrix's Column and Second Matrix's Row: ");
        int columns = scanner.nextInt();
        System.out.println("Second Matrix's Column: ");
        int columns2 = scanner.nextInt();
		
	

        float[][] matrix1 = new float[rows][columns];
        float[][] matrix2 = new float[columns][columns2];

        System.out.println("Enter elements for the first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix1[i][j] = scanner.nextFloat();
            }
        }

        System.out.println("Enter elements for the second matrix:");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < columns2; j++) {
                matrix2[i][j] = scanner.nextFloat();
            }
        }

        float[][] result = multiply(matrix1, matrix2);

        System.out.println("Resultant Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
	
    }

    public static float[][] multiply(float[][] matrix1, float[][] matrix2) {
        int rows1 = matrix1.length;
        int columns1 = matrix1[0].length;
        int columns2 = matrix2[0].length;
        float[][] result = new float[rows1][columns2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < columns1; k++) {
                    result[i][j] += (matrix1[i][k]) * (matrix2[k][j]);
                }
            }
        }

        return result;
        
    }

    public void performScalarDivision() {

    	Scanner scanner = new Scanner(System.in);
		
    	System.out.println("The size of the matrix should be between 2 and 5.");
        System.out.println("Matrix's Row: ");
        int rows = scanner.nextInt();
        System.out.println("Matrix's Column: ");
        int columns = scanner.nextInt();
        System.out.println("The number that you want to divide: ");
        float scalar = scanner.nextFloat();

        float[][] matrix1 = new float[rows][columns];

        System.out.println("Enter elements for the first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix1[i][j] = scanner.nextFloat();
            }
        }

        float[][] result = divide(matrix1, scalar);

        System.out.println("Resultant Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static float[][] divide(float[][] matrix1, float scalar) {
        int rows1 = matrix1.length;
        int columns1 = matrix1[0].length;
        float[][] result = new float[rows1][columns1];

        for (int i = 0; i < rows1; i++) {
          for (int j = 0; j < columns1; j++) {
              result[i][j] += (matrix1[i][j]) / (scalar);
                
          }
        }

        return result;
        
    }

    public void performScalarMultiplication() {
        
        Scanner scanner = new Scanner(System.in);
		
        System.out.println("The size of the matrix should be between 2 and 5.");
        System.out.println("Matrix's Row: ");
        int rows = scanner.nextInt();
        System.out.println("Matrix's Column: ");
        int columns = scanner.nextInt();
        System.out.println("The number that you want to multiply: ");
        float scalar = scanner.nextFloat();

        float[][] matrix1 = new float[rows][columns];

        System.out.println("Enter elements for the first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix1[i][j] = scanner.nextFloat();
            }
        }

        float[][] result = smultiply(matrix1, scalar);

        System.out.println("Resultant Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static float[][] smultiply(float[][] matrix1, float scalar) {
        int rows1 = matrix1.length;
        int columns1 = matrix1[0].length;
        float[][] result = new float[rows1][columns1];

        for (int i = 0; i < rows1; i++) {
          for (int j = 0; j < columns1; j++) {
              result[i][j] += (matrix1[i][j]) * (scalar);
                
          }
        }

        return result;
        
    }


    public void performTranspose() {
        
        Scanner scanner = new Scanner(System.in);
		System.out.println("The size of the matrix's should be between 2 and 5.");
        System.out.print("Matrix's Row: ");
        int rows = scanner.nextInt();
        System.out.print("Matrix's Columns: ");
        int columns = scanner.nextInt();

        float[][] matrix = new float[rows][columns];

        System.out.println("Enter elements for the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextFloat();
            }
        }
    
        float[][] result = transpose(matrix);

        System.out.println("Result Matrix:");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
	
    }

    public static float[][] transpose(float[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        float[][] result = new float[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
        
    }
    

    public void performMatrixInverse() {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("The size of the matrix's should be between 2 and 5.");
        System.out.println("Matrix's Row: ");
        int rows = scanner.nextInt();
        System.out.println("Matrix's Column: ");
        int columns = scanner.nextInt();
        
        float[][] matrix = new float[rows][columns];
		
		if (rows != columns) {
            System.out.println("Only square matrix allowed for inverse calculation. Please enter a square matrix.");
        }else{
			
			System.out.println("Enter elements for the first matrix:");
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					matrix[i][j] = scanner.nextFloat();
				}
			}
        
			float[][] adjointMatrix = adjoint(matrix); 
			float determinantMatrix = determinant(matrix, rows);
			float[][] inverseMatrix = divide(adjointMatrix,determinantMatrix);
			System.out.println("Inverse Matrix:");
			for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(inverseMatrix[i][j] + " ");
                }
                System.out.println();
            }
		}
    }
	
	public static float[][] adjoint(float[][] matrix) {
        float[][] adjoint = new float[matrix.length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                adjoint[i][j] = determinant(cofactor(matrix, i, j), (matrix.length) -1);
                if ((i + j) % 2 == 1) {
                    adjoint[i][j] = -adjoint[i][j];
                    }
                }
            }
        return transpose(adjoint);
    }

    public static float[][] cofactor(float matrix[][], int row, int column) {
        float[][] temp = new float[matrix.length - 1][matrix.length - 1];
        int i = 0, j = 0;

        for (int r = 0; r < matrix.length; r++) {
            if (r == row) continue;
            for (int c = 0; c < matrix.length; c++) {
                if (c == column) continue;
                temp[i][j++] = matrix[r][c];
                if (j == matrix.length - 1) {
                    j = 0;
                    i++;
                }
            }
        }
        return temp;
    }

    public static float determinant(float matrix[][], int d) {
        if (d == 1) {
            return matrix[0][0];
            }
        float determinantResult = 0;
        int sign = 1;

        for (int i = 0; i < d; i++) {
            float[][] temp = new float[d - 1][d - 1];
            determinantResult += sign * matrix[0][i] * determinant(cofactor(matrix, 0, i), d - 1);
            sign = -sign;
        }
        return determinantResult;
    }
    	
    public void performMatrixTrace() {

        Scanner scanner = new Scanner(System.in);
		System.out.println("The size of the matrix's should be between 2 and 5.");
        System.out.print("Matrix's Row: ");
        int rows = scanner.nextInt();
        System.out.print("Matrix's Columns: ");
        int columns = scanner.nextInt();

        float[][] matrix = new float[rows][columns];
		
		if (rows != columns) {
            System.out.println("Only square matrix allowed for trace calculation. Please enter a square matrix.");
        }else{
			
			System.out.println("Enter elements for the matrix:");
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					matrix[i][j] = scanner.nextFloat();
				}
			}
            float trace = trace(matrix);
            System.out.println("Trace of the matrix is: " + trace);
        }
    }

    public static float trace(float[][] matrix) {
        float sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }

        return sum;
    }

    public void performMatrixAdjoint() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("The size of the matricies should be between 2 and 5.");
        System.out.print("Matrix's Row: ");
        int rows = scanner.nextInt();
        System.out.print("Matrix's Columns: ");
        int columns = scanner.nextInt();

        float[][] matrix = new float[rows][columns];
		
		if (rows != columns) {
            System.out.println("Only square matrix allowed for adjoint calculation. Please enter a square matrix.");
        }else{
			
			System.out.println("Enter elements for the matrix:");
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					matrix[i][j] = scanner.nextInt();
				}
			}
			
			float[][] adjointMatrix = adjoint(matrix);

			System.out.println("Adjoint Matrix:");
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					System.out.print(adjointMatrix[i][j] + " ");
				}
				System.out.println();
			}
		}
    }

    public void performMatrixOrthogonality() {

        Scanner scanner = new Scanner(System.in);
		
		System.out.println("The size of the matrix's should be between 2 and 5.");
        System.out.print("Matrix's Row: ");
        int rows = scanner.nextInt();
        System.out.print("Matrix's Columns: ");
        int columns = scanner.nextInt();

        float[][] matrix = new float[rows][columns];
		
		if (rows != columns) {
            System.out.println("Only square matrix allowed for orthogonality calculation. Please enter a square matrix.");
        }else{
			
			System.out.println("Enter elements for the matrix:");
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					matrix[i][j] = scanner.nextInt();
				}
			}

			float[][] transposeMatrix = transpose(matrix);

			System.out.println("Transpose Matrix:");
			printMatrix(transposeMatrix);

			if (isOrthogonal(matrix, transposeMatrix)) {
				System.out.println("The matrix is orthogonal.");
			} 
			else {
				System.out.println("The matrix is not orthogonal.");
			}
		}
	}
	
    public static boolean isOrthogonal(float[][] matrix, float[][] transposeMatrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        if (rows != columns) {
            return false; 
        }

        float[][] product = multiply(matrix, transposeMatrix);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == j) {
                    if (product[i][j] != 1) {
                        return false; 
                    }
                } 
		else {
                    if (product[i][j] != 0) {
                        return false; 
                    }
                }
            }
        }

        return true;
    }

    public static void printMatrix(float[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
            
        }
        
    }

}