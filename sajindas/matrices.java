import java.util.*;

class matrices {
public static void main(String args[]) {
int s1, s2, i, j, k;
int[][] mat1 = new int[5][5];
int[][] mat2 = new int[5][5];
int[][] mat3 = new int[5][5];

Scanner sc = new Scanner(System.in);

System.out.println("Enter number of rows and columns:");
s1 = sc.nextInt();
s2 = sc.nextInt();
System.out.println("Enter the elements of the first matrix:");
for (i = 0; i < s1; i++) {
for (j = 0; j < s2; j++) {
mat1[i][j] = sc.nextInt();
       }
   }

System.out.println("Enter the elements of the second matrix:");
  for (i = 0; i < s1; i++) {
    for (j = 0; j < s2; j++) {
                mat2[i][j] = sc.nextInt();
        }
    }

System.out.println("Sum of the two matrices:");
  for (i = 0; i < s1; i++) {
    for (j = 0; j < s2; j++) {
mat3[i][j] = mat1[i][j] + mat2[i][j];
        }
    }

 for (i = 0; i < s1; i++) {
    for (j = 0; j < s2; j++) {
                System.out.print(mat3[i][j] + " ");
            }
            System.out.println();
        }

 System.out.println("Multiplication of the two matrices:");
    for (i = 0; i < s1; i++) {
      for (j = 0; j < s2; j++) {
          mat3[i][j] = 0; 
             for (k = 0; k < s1; k++) {
mat3[i][j] += mat1[i][k] * mat2[k][j];
       }
     }
  }

 for (i = 0; i < s1; i++) {
     for (j = 0; j < s2; j++) {
System.out.print(mat3[i][j] + " ");
  }
 System.out.println();
        }
    }
}

