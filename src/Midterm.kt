fun main() {
    // Write your code below 📝

    var testGrades = mutableSetOf(65,50,72,80,53,84)

    var sum = testGrades.sum()

    var numStudents = testGrades.size

    var average = sum/numStudents

    if(average < 65){
        println("Failed")
    }else{
        println("Passed")
    }
}