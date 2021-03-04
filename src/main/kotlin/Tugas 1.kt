val substract: (Int, Int)->Int = {valueA, valueB -> valueA - valueB}

fun main(){
    print("Masukkan value A : ")
    val valueA = readLine()!!.toInt()
    print("Masukkan value B : ")
    val valueB = readLine()!!.toInt()

    println("Hasil pengurangan dari Value A dan value B : "+ substract.invoke(valueA,valueB))
}