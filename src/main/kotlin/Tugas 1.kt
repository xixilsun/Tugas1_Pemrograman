val multiplication: (Int, Int)->Int = {valueA, valueB -> valueA * valueB}

fun main(){
    print("Masukkan value A : ")
    val valueA = readLine()!!.toInt()
    print("Masukkan value B : ")
    val valueB = readLine()!!.toInt()

    println("Hasil perkalian dari Value A dan value B : "+ multiplication.invoke(valueA,valueB))
}