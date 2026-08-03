/////////////////////////////////////////////////////////////////////////////
//
//  Description : Sum of digits in a number
//  Author      : Snehal Gholap
//  Date        : 03/08/2026
//
/////////////////////////////////////////////////////////////////////////////

function MultDigit(number)
{
    let mult = 1
    let digit = 0

    while(number > 0)
    {
        digit = number % 10

        mult = mult * digit

        number = Math.floor(number / 10)
    }

    return mult
}

let value = 1234

let result = MultDigit(value)

console.log("Multiplication of digits in number",value,"is",result)