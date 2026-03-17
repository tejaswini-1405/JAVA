// N Queens
package Assignment4.Module9;
import java.util.*;
public class LeetCode51 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter value of n:");
            int n = sc.nextInt();

            List<List<String>> result = new ArrayList<>();
            char[][] board = new char[n][n];

            for (char[] row : board) Arrays.fill(row, '.');

            solve(0, board, result);

            System.out.println("Solutions are:");

            for (List<String> solution : result) {
                for (String row : solution) {
                    System.out.println(row);
                }
                System.out.println(); // space between solutions
            }
        }

        static void solve(int col, char[][] board, List<List<String>> result) {
            if (col == board.length) {
                List<String> temp = new ArrayList<>();
                for (char[] row : board) temp.add(new String(row));
                result.add(temp);
                return;
            }

            for (int row = 0; row < board.length; row++) {
                if (isSafe(board, row, col)) {
                    board[row][col] = 'Q';

                    solve(col + 1, board, result);

                    board[row][col] = '.'; // backtrack
                }
            }
        }

        static boolean isSafe(char[][] board, int r, int c) {
            // check row
            for (int i = 0; i < c; i++)
                if (board[r][i] == 'Q') return false;

            // upper diagonal
            for (int i = r, j = c; i >= 0 && j >= 0; i--, j--)
                if (board[i][j] == 'Q') return false;

            // lower diagonal
            for (int i = r, j = c; i < board.length && j >= 0; i++, j--)
                if (board[i][j] == 'Q') return false;

            return true;
        }
    }

