function main () {
    console.log("피라미드 만들기");
    console.log("");

    height = 5;
    width = 9;
    side = 4;

    for (let i = 0; i < height; i++) {
        for (let j = 0; j < side; j++) {
            console.log(" ");
        }
        for (let j = 0; j < width - side * 2; j++) {
            console.log("*");
        }
        for (let j = 0; j < side.length; j++) {
            console.log(" ");
        }
        side -= 1;
    }
}

main();
