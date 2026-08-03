/////////////////////////////////////////////////////////////////////////////
//
//  Description : Count digits in a number
//  Author      : Snehal Gholap
//  Date        : 03/08/2026
//
/////////////////////////////////////////////////////////////////////////////


function DisplayCount(Number)
{
    let Digit = 0
    let Count= 0

    while(Number != 0)
    {
        Digit = Number % 10
        Count++

        Number = Math.floor(Number/10)        
    }

    return Count
}

let value = 4563

let Result = DisplayCount(4563)

console.log("Digit ",value)
console.log("Count of Digits : ",Result)

