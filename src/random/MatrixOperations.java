/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package random;

/**
 *
 * @author Abhi
 */
public class MatrixOperations {
    public static void main(String[] args) {
        int[][] A={{3,5,9},{7,6,2},{4,3,5}};
        int[][] B={{1,5,2},{6,8,4},{3,9,7}};
        int[][] C = new int[3][3];
        
        System.out.println("Matrix A: ");
        for(int[] x:A){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        System.out.println("Matrix B:");
        for(int[] x:B){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        //addition of two matrices.
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                C[i][j]=A[i][j]+B[i][j];
            }
        }
        System.out.println("Addition of Matrix A and B is:");
        //printing output matrix.
        for(int[] x:C){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println("");
        }

        System.out.println("\n--EXAMPLE OVER--\n");
        
        //subtraction of two matrices.
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                C[i][j]=A[i][j]-B[i][j];
            }
        }
        System.out.println("Subtraction of Matrix A and B is:");
        //printing output matrix.
        for(int[] x:C){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println("");
        }
        
        System.out.println("\n--EXAMPLE OVER--\n");
        
        //multiplication of matrix. -> matrix multiplication(3x3) needs 3 for loops.
        //here we are multiplying matrix A with identity matrix D so that it will give same output as A.
        int[][]D={{1,0,0},{0,1,0},{0,0,1}};
        //for output of multiplication.
        int[][]E=new int[3][3];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                for(int k=0;k<A[0].length;k++){
                    E[i][j]=E[i][j]+A[i][k]*D[k][j];
                }
            }
        }
        //printing output matrix.
        System.out.println("Multiplication of Matrix A and Matrix D:");
        for(int[] x:E){
            for(int y:x){
                System.out.print(y + " ");
            }
            System.out.println("");
        }
        System.out.println("\n--EXAMPLE OVER--\n");
    }
}
