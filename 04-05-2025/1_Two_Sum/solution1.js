/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    const hash = {};
    for (let i = 0; i < nums.length; i++) {
        hash[nums[i]] = i;
    }
    console.log(hash)
    for (let i = 0; i < nums.length; i++) {
        let n = target - nums[i];
        console.log(n, hash[n])
        if (hash[n] !== undefined) {
            return [i, hash[n]];
        }
    }
};

console.log(twoSum([2, 7, 11, 15], 9));
console.log(twoSum([3, 2, 4], 6));
console.log(twoSum([3, 3], 6));