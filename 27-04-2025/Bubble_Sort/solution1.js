function bubble(arr) {
    for (let i = 0; i < arr.length; i++) {
        for (let j = 0; j < arr.length; j++) {
            if (arr[i] < arr[j]) {
                [arr[i], arr[j]] = [arr[j], arr[i]];
            }
        }
    }
    return arr;
}

function bubble2(arr) {
    for (let i = 0; i < arr.length - 1; i++) {
        // console.log('i', i, arr[j + 1]);
        console.log('------------');
        for (let j = 0; j < arr.length - 1 - i; j++) {
            console.log('j + 1', i, arr[j + 1]);
            console.log('j', j, arr[j]);
            if (arr[j + 1] < arr[j]) {
                [arr[j + 1], arr[j]] = [arr[j], arr[j + 1]];
            }
            console.log('arr', arr)
        }
    }
    return arr;
}

// console.log(bubble([1, 2, 4, 3]));
console.log(bubble2([1, 2, 4, 3]));

// console.log('i', i, arr[i]);
// console.log('------------');
// console.log('i', i, arr[i]);
// console.log('j', j, arr[j]);
// console.log('arr', arr)
