let a=85
let b=90
let c=78

let total=a+b+c
let percentage=(total/300)*100

console.log("Total Marks: "+total)
console.log("Percentage: "+percentage+"%")

if(percentage>=90)
{
    console.log("Grade: A")
}
else if(percentage>=80)
{
    console.log("Grade: B")
}
else
{
    console.log("Grade: C")
}