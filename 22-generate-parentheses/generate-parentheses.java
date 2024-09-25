class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> strset = new ArrayList<>();
        parenthesismaker(0, 0, "", n, strset);
        return strset;
    }

    private void parenthesismaker(int openp, int closep, String s, int n, List<String> strset) {
        if (openp == n && closep == n) {
            strset.add(s);
            return;
        }

        if (openp < n) {
            parenthesismaker(openp + 1, closep, s + "(", n, strset);
        }

        if (closep < openp) {
            parenthesismaker(openp, closep + 1, s + ")", n, strset);
        }
    }
}
