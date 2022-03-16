fun main(){
    var product=productofelements(arrayOf(4,2,4,8,1,))
    println(product)
    var result=addition(arrayOf(12,24,34,2.900,34.23F,12.5667,14,12.56F))
    println(result)
    var numbers=vowels(arrayOf('w','a','z','e','i','t','y','o'))
    println(numbers)

}

//Write a function that takes in an array of integers and returns the product of
//all the elements
fun productofelements(num:Array<Int>):Int{
    var multiply=1
    num.forEach { x->
        multiply*=x
    }

    return multiply
}

//Write a function that takes in an array of mixed types and returns the sum of
//all the decimal elements

fun addition(mixed:Array<Any>):Double{
    var sum=0.0
    mixed.forEach { y->
        if (y is Double || y is Float){
            sum+=y.toString().toDouble()}
    }
    return sum
}

//Write a function that takes in an array of characters and returns the number of
//vowels in the array
fun vowels(character:Array<Char>):Int{
    var ch=0
    character.forEach { letter->
        if (letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u')
            ch++
    }
    return ch
}

/*if(word=arrayOf('a','e','i','o','u')){
    println(word)
    var ch=('a','e','o','u','i')
}*/



