/*
 * @lc app=leetcode id=1935 lang=java
 *
 * [1935] Maximum Number of Words You Can Type
 */

// @lc code=start
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] brokenArray = brokenLetters.split("");
        String[] textArray = text.split(" ");
        int count = textArray.length;

        if(brokenLetters.equals("")){
            System.out.println(count);
            return count;
        }
        else {
            for (int i = 0; i < textArray.length; i++) {
                for (int j = 0; j < brokenArray.length; j++) {
                    if (textArray[i].contains(brokenArray[j])){
                        count--;
                        break;
                    }
                }
            }
            System.out.println(count);
            return count;
        }
    }
}
// @lc code=end

