
/////////////////////////////////////////////////////////////////////////////
//
//  Description : Addition of Two Numbers using function
//  Author      : Snehal Gholap
//  Date        : 03/08/2026
//
/////////////////////////////////////////////////////////////////////////////


function Addition(No1, No2)
{
    Ans = No1 + No2

    return Ans;
}

let Number1 = 11
let Number2 = 12

let Result = Addition(11,12);

// Template literal way: 
console.log(`Addition of ${Number1} and ${Number2} is ${Result}`);

// String concatenation way
console.log("Addition of "+ Number1 + " and " + Number2 + " is " +Result);

// using comma
console.log("Addition of",Number1,"and",Number2,"is",Result);