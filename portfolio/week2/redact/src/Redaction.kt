// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string
fun redact(document : String , hiding : String , cover : Char = 'X'):String{
var count = hiding.length
var replace = cover.toString()
var newrep = replace.repeat(count)
return (document.replace(hiding , newrep)) 

}