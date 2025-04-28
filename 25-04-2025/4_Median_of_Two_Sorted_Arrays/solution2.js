// https://leetcode.com/problems/median-of-two-sorted-arrays/?envType=problem-list-v2&envId=array

/*
* Given two sorted arrays nums1 and nums2 of size m and n respectively,
* return the median of the two sorted arrays.
*
* The overall run time complexity should be O(log (m+n)).
*
Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

* */

/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */
var findMedianSortedArrays = function(nums1, nums2) {
    const arr = [];
    for (let i = 0; i < nums1.length; i++) {
        arr.push(nums1[i]);
    }
    for (let i = 0; i < nums2.length; i++) {
        arr.push(nums2[i]);
    }

    for (let i = 0; i < arr.length; i++) {
        for (let j = i; j < arr.length; j++) {
            if (arr[i] > arr[j]) {
                [arr[i], arr[j]] = [arr[j], arr[i]];
            }
        }
    }

    if (arr.length % 2 === 1) {
        return arr[1];
    } else {
        const idx = arr.length / 2;
        return (arr[idx - 1] + arr[idx]) / 2;
    }
};

console.log(findMedianSortedArrays([1, 3], [2])); // 2.00000
console.log(findMedianSortedArrays([1,2], [3,4])); // 2.50000

/*
* [1, 2, 3, 4]
* 1, 1
* 1, 2
* 1, 3
* 1, 4
*
* 2, 2
* 2, 3
* 2, 4
*
* 3, 3
* 3, 4
*
* 4, 4
* */

