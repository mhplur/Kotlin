fun main(args: Array<String>) {
    getAreaAndPerimeter(50);
    getAverageWeight(floatArrayOf(89.4f, 67f, 87.45f));
    getApprovedOrReproved(intArrayOf(8,7,6,9,10))
    countNumberDigits(25);
}

fun getAreaAndPerimeter(side : Int){
    val area = side * 2 //INMUTABLE VAR
    val perimeter = side * 4
    println("Area's square: $area")
    println("Perimeter's square: $perimeter")
}

fun getAverageWeight(arrayWeights : FloatArray){
    arrayWeights.sum()
    val average = (arrayWeights.sum()) / 3
    println("The average of three weights is $average")
}

fun getApprovedOrReproved(arrayScores : IntArray){
    val average = (arrayScores.sum()) / 3
    print("The student is ")
    if(average > 7)
    	println("Approved")
    else
    	println("Reproved")
}

fun countNumberDigits(number : Int) : String{
    val message = "Number has"
    return if(number <10)
    	"$message 1 digit"
    else
    	"$message more than 1 digit"
}