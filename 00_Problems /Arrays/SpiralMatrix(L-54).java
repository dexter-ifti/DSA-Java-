class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> list = new ArrayList<Integer>();
        int startRow = 0, startCol = 0, endRow = n-1, endCol = m-1;
        while(startRow <= endRow && startCol <= endCol){
            for(int j = startCol; j <= endCol; j++){
                list.add(matrix[startRow][j]);
            }
            for(int i = startRow+1; i <= endRow; i++){
                list.add(matrix[i][endCol]);
            }
            for(int j = endCol-1; j >= startCol; j--){
                if(startRow == endRow){
                    break;
                }
                list.add(matrix[endRow][j]);
            }
            for(int i = endRow-1; i >= startRow+1; i--){
                if(startCol == endCol){
                    break;
                }
                list.add(matrix[i][startCol]);
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return list;
    }
}
