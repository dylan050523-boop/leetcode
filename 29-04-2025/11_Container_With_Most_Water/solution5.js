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
    let maxHeight = 0;
    for (let i = 0; i < height.length; i++) {
        let count = 0;
        for (let j = i + 1; j < height.length; j++) {
            if (height[i] < height[j]) {
                if (count !== 0) {
                    count += 1;
                }
                break;
            }

            count += 1;
        }
        countArray.push(count);
    }
    // console.log(countArray)
    maxHeight = Math.max(...countArray);
    return maxHeight ** 2
};

console.log(maxArea([1,8,6,2,5,4,8,3,7])); // 49
console.log(maxArea([1, 1])); // 1
console.log(maxArea([1, 2, 2]))
