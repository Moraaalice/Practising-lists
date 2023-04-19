import kotlin.math.max

fun main(){
    var take = takeInt(listOf(12,23,45,89,76,23))
    println(take)
    //
    var taking = takeStrings(listOf("Alice","Brian","Ann","Joy","Aketch"))
    println(taking)
    //
    var double = doubleList(listOf(4,2,6,4))
    println(double)
    //
    var taken = takeSorted(listOf("Nakuru","Kisumu","Mombasa","Diani"))
    println(taken)
    //
    var multiplication = takeProduct(listOf(4,3,2,5))
    println(multiplication)
    //
    var numing = pair(listOf(23,5,56,78,12,10))
    println(numing)
    //

}
//Write a function that takes a list of integers and returns the sum of all the even numbers in the list.
fun takeInt(num:List<Int>):Int{
    var sum = 0
    for (n in num){
        if (n%2==0){
            sum+=n
        }
    }
    return sum
}
//Write a function that takes a list of strings and returns a new list with all the strings that start with the letter "A".
fun takeStrings(str:List<String>):List<String>{
    var x = mutableListOf<String>()
    for (s in str){
        if (s.startsWith('A')){
            x.addAll(listOf(s))
        }
    }
    return x
}
//Write a function that takes a list of integers and returns a new list with all the elements doubled.
fun doubleList(numbs:List<Int>):List<Int>{
    var product = 1
    for (n in numbs)
        product*=n*2
    return numbs
}
//Write a function that takes two lists of integers and returns a new list with all the elements that are present in both lists.
//Write a function that takes a list of strings and returns a new list with all the strings sorted in alphabetical order.
fun takeSorted(listStr:List<String>):List<String>{
    var listStr2 = mutableListOf<String>()
    listStr2.addAll(listStr.sorted())
    return listStr2
}
//Write a function that takes a list of integers and returns the product of all the numbers in the list
fun takeProduct(listInt:List<Int>):Int{
    var multply = 1
    for (l in listInt){
        multply*=l
    }
    return multply
}
//Write a function that takes a list of strings and returns the length of the longest string in the list.
fun longestString(long:List<String>){
    for (l in long){

    }
}
//Write a function that takes a list of integers and returns the maximum and minimum values in the list as a Pair.
fun pair(num:List<Int>):Pair<Int,Int>{
    var num3 = num.max()
    var num4 = num.min()
    return Pair(num3,num4)

}