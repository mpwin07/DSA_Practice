class Solution {
    public boolean checkMove(char[][] board, int rMove, int cMove, char color) {
        int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dc = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int d = 0; d < 8; d++) {
            int r = rMove + dr[d];
            int c = cMove + dc[d];
            int count = 0;

            while (r >= 0 && r < 8 && c >= 0 && c < 8
                    && board[r][c] != '.') {

                if (board[r][c] == color) {
                    if (count > 0) {
                        return true;
                    }
                    break;
                }

                count++;
                r += dr[d];
                c += dc[d];
            }
        }

        return false;
    }
}