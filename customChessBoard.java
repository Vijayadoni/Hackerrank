    // Complete the solve function below.
    static String solve(List<List<Integer>> board) {
        int j = board.get(0).get(0);
        for(List<Integer> row : board){
            int alt = row.get(0);
            if(j != alt) return "No";
            for(Integer color : row){
                if(color != alt) return "No";
                alt = 1 - alt;
            }
            j = 1 - j;
        }
        return "Yes";
    }