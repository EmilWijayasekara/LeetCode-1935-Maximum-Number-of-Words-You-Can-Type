# LeetCode Practice  (Day 18)

## Achievements

[![Leetcode-copy.jpg](https://i.postimg.cc/yY1MnWTd/Leetcode-copy.jpg)](https://postimg.cc/WtyY1NCL)

## About the problem
- *Problem Number* : 1935
- *Problem Name* : [Maximum Number of Words You Can Type](https://leetcode.com/problems/maximum-number-of-words-you-can-type/description/ "https://leetcode.com/problems/maximum-number-of-words-you-can-type/description/")
- *Problem difficulty* : Easy 🟢
- *Programming language used* - Java

## Problem


There is a malfunctioning keyboard where some letter keys do not work. All other keys on the keyboard work properly.

Given a string  `text`  of words separated by a single space (no leading or trailing spaces) and a string  `brokenLetters`  of all  **distinct**  letter keys that are broken, return  _the  **number of words**  in_  `text`  _you can fully type using this keyboard_.

**Example 1:**

```
Input: text = "hello world", brokenLetters = "ad"
Output: 1
Explanation: We cannot type "world" because the 'd' key is broken.
```

**Example 2:**

```
Input: text = "leet code", brokenLetters = "lt"
Output: 1
Explanation: We cannot type "leet" because the 'l' and 't' keys are broken.
```

**Example 3:**

```
Input: text = "leet code", brokenLetters = "e"
Output: 0
Explanation: We cannot type either word because the 'e' key is broken.
```

**Constraints:**

-   `1 <= text.length <= 104`
-   `0 <= brokenLetters.length <= 26`
-   `text`  consists of words separated by a single space without any leading or trailing spaces.
-   Each word only consists of lowercase English letters.
-   `brokenLetters`  consists of  **distinct**  lowercase English letters.

## Approach Explanation

I addressed the problem of counting the number of words that can be typed using a malfunctioning keyboard. I parsed the input strings into arrays of letters, considering both the broken letters and the words in the text. I then iterated through the words, checking if any of the broken letters were present in each word. If a broken letter was found, I decremented the count of words that can be typed. The solution also accounted for the case where no letters were broken. This approach aims to efficiently determine the number of typeable words by leveraging string manipulation and iteration through arrays.

### If you have suggestions for improvement or would like to contribute to this solution, feel free to create a pull request. 🙌😇
