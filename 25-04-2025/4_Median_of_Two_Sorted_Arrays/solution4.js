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

    for (let i = 0; i < arr.length - 1; i++) {
        for (let j = 0; j < arr.length - i - 1; j++) {
            if (arr[j + 1] < arr[j]) {
                [arr[j + 1], arr[j]] = [arr[j], arr[j + 1]];
            }
        }
    }


    if (arr.length === 1) {
        return arr[0];
    } else if (arr.length % 2 === 1) {
        return arr[Math.ceil((arr.length / 2) - 1)];
    } else {
        const idx = arr.length / 2;
        return (arr[idx - 1] + arr[idx]) / 2;
    }
};

console.log(findMedianSortedArrays([1, 3], [2])); // 2.00000
console.log(findMedianSortedArrays([1,2], [3,4])); // 2.50000

console.log(findMedianSortedArrays([], [1]));

console.log(findMedianSortedArrays([1,2,3,4,5], [6,7,8,9,10,11,12,13,14,15,16,17]));


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

