/**
    Write a function to find the longest common prefix string amongst an array of strings.

    If there is no common prefix, return an empty string "".

    

    Example 1:

    Input: strs = ["flower","flow","flight"]
    Output: "fl"

    Example 2:

    Input: strs = ["dog","racecar","car"]
    Output: ""
    Explanation: There is no common prefix among the input strings.

    

    Constraints:

        1 <= strs.length <= 200
        0 <= strs[i].length <= 200
        strs[i] consists of only lower-case English letters.
 */
import java.util.Arrays;

public class longestCommonPrefix {
    public String longestCommonPrefi(String[] strs)
    {
                if (strs == null || strs.length == 0)
                return "";
            
            Arrays.sort(strs);
            String first = strs[0];
            String last = strs[strs.length - 1];
            int c = 0;
            while(c < first.length())
            {
                if (first.charAt(c) == last.charAt(c))
                    c++;
                else
                    break;
            }
            return c == 0 ? "" : first.substring(0, c);
    }
}
