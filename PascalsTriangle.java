class Solution {

    List<Integer> generateRows(int rows){
        int ans = 1;

        List<Integer> list = new ArrayList<>();

        list.add(1);

        for(int col=1; col<rows; col++){
            ans = ans * (rows - col);
            ans  /= col;
            list.add(ans);
        }

        return list;
    }
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();

        for(int i=1; i<=numRows; i++){

                    ans.add(generateRows(i));
        }

        return ans;
        
    }
}
