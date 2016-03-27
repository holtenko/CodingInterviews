public class Q3_FindMatrix{
  public static boolean Find(int[][] matrix,int number){
    boolean found=false;
    int rows=matrix.length;
    int columns=matrix[0].length;
    if(matrix!=null && rows>0 && columns>0){
      int row=0;
      int column=columns-1;
      while(row<rows && column>=0){
        if(matrix[row][column]==number){
          found=true;
	  break;
        }else if(matrix[row][column]>number){
          column--;
        }else{
          row++;
        }
      }
    }
    return found;
  }

  public static void main(String[] args){
    int[][] matrix={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
    int number=20;
    System.out.println("Is there "+number+" in the Matrix?");
    System.out.println(Find(matrix,number));
  }
}
