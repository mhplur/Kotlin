fun main(args: Array<String>) {
    // AREA AND PERIMETER OF A SQUARE
    val side = 50 // INMUTABLE VAR
    val area = side * 2 
    val perimeter = side * 4
    println("Area's square: $area")
    println("Perimeter's square: $perimeter")
    
    // AVERAGE'S WEIGHTS
    val weight1 = 89.4f
    val weight2 = 67f
    val weight3 = 87.45f
    val average = (weight1 + weight2 + weight3) / 3
    println("The average of three weights is $average")
    
    // APPROVED OR REPROVED
    var score1 = 2
    var score2 = 3
    var score3 = 9
    var average = (score1 + score2 + score3) / 3
    if(average > 7)
    	println("Approved")
    else
    	println("Reproved")

    // DIGIT COUNTER
    val number = 54
    val message = "Number has"
    if(number <10)
    	println("$message 1 digit")
    else
    	println("$message more than 1 digit")
}
