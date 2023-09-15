import java.util.Scanner;
public class part1 {
    public static void main(String[] args){
    
        int row;
        int col;
        int matrix[][];
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the number of row: ");
        row = sc.nextInt();
        System.out.print("Enter the number of col: ");
        col = sc.nextInt();
        matrix = new int[row][col];
        System.out.println("Enter the matrix: ");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print("m["+i+"]["+j+"]=");
                matrix[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Matrix inputted:");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.format("%3d",matrix[i][j]);
            }
            System.out.print("\n");
        }
        
        int sum=0;
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                sum += matrix[i][j];
            }
        }
        System.out.println("Sum:" + sum);
        
        float average = (float)sum/(row*col);
        System.out.println("Average:" + average);
    }
    
}
