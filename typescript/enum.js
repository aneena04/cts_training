// enum Direction{
//     NORTH,
//     SOUTH=7,
//     EAST,
//     WEST
// }
// console.log(Direction);
// enum Direction1{
//     Up = "UP",
//     Down = "DOWN",
//     Left = "LEFT",
//     Right = "RIGHT",
// }
// console.log(Direction1)
function loggingIdentity(arg) {
    console.log(arg); // Error: T doesn't have .length
    return arg;
}
