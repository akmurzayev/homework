public class Task3 {

    public static int result = 0;
    public static void twoDimen(int matrix[][])
    {
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix.length; j++) {
                if (i == j)
                {
                    matrix[i][j] = i;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
            result += i;
        }
        System.out.println(result);
    }
}
