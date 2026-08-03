/////////////////////////////////////////////////////////////////////////////
//
//  Description : Display digits on the console
//  Author      : Snehal Gholap
//  Date        : 03/08/2026
//
/////////////////////////////////////////////////////////////////////////////


function DisplayDigit(Number)
{
    let Digit = 0

    while(Number > 0)
    {
        Digit = Number % 10
        console.log(Digit)

        Number = Math.floor(Number/10)        
    }
}

let value = 4563

console.log("Digits are : ")
DisplayDigit(4563)

