// https://leetcode.com/problems/container-with-most-water/?envType=problem-list-v2&envId=array

/*
* You are given an integer array height of length n.
* There are n vertical lines drawn such that
* the two endpoints of the ith line are (i, 0) and (i, height[i]).
*
* Find two lines that together with the x-axis form a container,
* such that the container contains the most water.
*
* Return the maximum amount of water a container can store.
*
* Notice that you may not slant the container.
* */

/*
* n == height.length
* 2 <= n <= 105
* 0 <= height[i] <= 104
* */

/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function(height) {
    const countArray = [];
    for (let i = 0; i < height.length; i++) {
        let width = 0;
        let firstRun = true;
        for (let j = i + 1; j < height.length; j++) {
            width += 1;
            if (firstRun && height[i] < height[j]) {
                width = 0;
                break;
            } else if (height[i] < height[j]) {
                break;
            }
        }

    }
    return countArray;
};

console.log(maxArea([1,8,6,2,5,4,8,3,7])); // 49
console.log(maxArea([1, 1])); // 1
console.log(maxArea([1, 2, 2])) // 2

console.log(maxArea([1, 2, 1])); // 2
console.log(maxArea([8, 7, 6, 8])); // 15