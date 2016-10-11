package ValidSudoku;

public class Solution {
public boolean isValidSudoku(char[][] board) {
for(int i=0;i<9;i++){
int[] a = new int[9];
for(int j=0;j<9;j++){
if(board[i][j]!='.')
{
a[board[i][j]-'1'] ++;
if(a[board[i][j]-'1']>1){
return false;
}
}

        }
    }
    for(int i=0;i<9;i++){
        int[] a = new int[9];
        for(int j=0;j<9;j++){
            if(board[j][i]!='.')
            {
                a[board[j][i]-'1'] ++;
                if(a[board[j][i]-'1']>1){
                    return false;
                }
            }
        }
    }
    
    for(int m=0;m<3;m++){
        for(int n=0;n<3;n++){
            int[] a = new int[9];
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(board[i+3*m][j+3*n] != '.'){
                        a[board[i+3*m][j+3*n]-'1']++;
                        if(a[board[i+3*m][j+3*n]-'1']>1){
                            return false;
                        }
                    }
                }
            }
        }
    }
    return true;
}
}