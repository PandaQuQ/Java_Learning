import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.Scanner;

public class Tutorial010824 {
    public static void main(String[] args) {
        //Q1();
        //Q2();
        //Q3();
        //Q4();
        //Q5();
        //Q5_multiplication();
        //Q5_division();
        
    }

    public static void Q1(){
        int[] intArray = new Random().ints(5,0,99).toArray();
        for (int i : intArray){
            System.out.print(i + " ");
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element which you want to insert: ");
        int e = sc.nextInt();
        System.out.println();

        System.out.print("Enter the index that where you want to insert the element: ");
        int ind = sc.nextInt();
        System.out.println();

        int [] newIntArray = new int[intArray.length + 1];

        for (int i = 0; i < ind + 1; i++){
            newIntArray[i] = intArray[i];
        }
        newIntArray[ind] = e;
        for (int i = ind + 1; i < intArray.length + 1; i++){
            newIntArray[i] = intArray[i - 1];
        }


        for (int i : newIntArray){
            System.out.print(i + " ");
        }
    }

    public static void Q2() {
        // Read integer values from an array and display it in reverse order.
        int[] intArray = new Random().ints(5,0,99).toArray();
        for (int i : intArray){
            System.out.print(i + " ");
        }
        System.out.println();

        int[] newIntArray = new int[intArray.length];
        for (int i = 0; i < intArray.length; i++){
            newIntArray[i] = intArray[intArray.length - 1 - i];
        }

        for (int i : newIntArray){
            System.out.print(i + " ");
        }

        



    }
    
    public static void Q3() {
        String[] strArray = {"bcd","abd","jude","bcd","oiu"};
        ArrayList dupList = new ArrayList<String>();
        for (int i = 0; i < strArray.length-1; i++){

            for(int j = i + 1; j < strArray.length;j++){
                if (strArray[i] == strArray[j]) {
                    dupList.add(strArray[i]);
                }
            }
        }
        System.out.println(dupList);
    }

    public static void Q4() {
        String[] strArray1 = {"Python","JAVA","PHP"};
        String[] strArray2 = {"MYSQL","Oracle","PHP"};
        ArrayList commonElement = new ArrayList<String>();

        for(int i = 0; i < strArray1.length;i++){
            for(int j = 0; j < strArray2.length;j++){
                if (strArray1[i]==strArray2[j]) {
                    commonElement.add(strArray1[i]);
                }
            }
        }
        
        System.out.println(commonElement);

    }

    public static int[][] matrixGen(int size_row,int size_col){
        int[][] matrix = new int[size_row][size_col];
        for(int i =0;i<size_row;i++){
            matrix[i] = new Random().ints(size_col,0,9).toArray();
        }
        return matrix;
    }

    public static void matrixDisplay(int[][] matrix){
        for (int i=0;i<matrix.length;i++){
            for(int j = 0; j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
            
        }
        System.out.println();
    }

    public static void Q5(){
        
        int [][] matrix1 = matrixGen(3,3);
        matrixDisplay(matrix1);
        int [][] matrix2 = matrixGen(3, 3);
        matrixDisplay(matrix2);
        int [][] matrix_sum = new int[3][3];
        for(int i = 0; i<3;i++){
            for(int j = 0; j<3;j++){
                matrix_sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        matrixDisplay(matrix_sum);
        
    }
    
    public static void Q5_multiplication(){
        
        int [][] matrix1 = matrixGen(3,3);
        matrixDisplay(matrix1);
        int [][] matrix2 = matrixGen(3, 3);
        matrixDisplay(matrix2);
        int [][] matrix_sum = new int[3][3];
        for(int i = 0; i<3;i++){
            for(int j = 0; j<3;j++){
                matrix_sum[i][j] = (int)(matrix1[i][j] * matrix2[i][j]);
            }
        }
        matrixDisplay(matrix_sum);
        
    }

    public static void Q5_division(){
        
        int [][] matrix1 = matrixGen(3,3);
        matrixDisplay(matrix1);
        int [][] matrix2 = matrixGen(3, 3);
        matrixDisplay(matrix2);
        double [][] matrix_sum = new double[3][3];
        for(int i = 0; i<3;i++){
            for(int j = 0; j<3;j++){
                if(matrix2[i][j] == 0){
                    matrix_sum[i][j] = Double.NaN;
                }else{
                    matrix_sum[i][j] = matrix1[i][j] / matrix2[i][j];
                }
            }
        }
        for (int i=0;i<matrix_sum.length;i++){
            for(int j = 0; j<matrix_sum[i].length;j++){
                System.out.print(matrix_sum[i][j]+" ");
            }
            System.out.println();
            
        }
        System.out.println();
    }
    

}




