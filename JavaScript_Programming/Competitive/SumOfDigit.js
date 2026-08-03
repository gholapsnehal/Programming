/////////////////////////////////////////////////////////////////////////////
//
//  Description : Sum of digits in a number
//  Author      : Snehal Gholap
//  Date        : 03/08/2026
//
/////////////////////////////////////////////////////////////////////////////

function SumOfDigit(No)
{
    let Sum = 0
    let Digit = 0

    while(No != 0)
    {
        Digit = No % 10

        Sum = Sum + Digit

        No = Math.floor(No / 10)
    }

    return Sum
}

let value = 1234
let result = 0

result = SumOfDigit(value)

console.log(`Sum of digits in a number ${value} is ${result}`)
