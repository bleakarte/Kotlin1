fun main(args: Array<String>) {
    var x: Int
    x = 120

    var y = if (x < 10){
       "x is less that 10"
    }else{
        "x is greater than 10"
    }
    println(y)


    var marks = 58
    var grade = if (marks < 40){
        "E"
    }else if (marks < 50){
        "D"
    }else if (marks < 60){
        "C"
    }else if (marks < 70){
        "B"
    }else{
        "A"
    }
    println(grade)

    var guessedNumber = 3
    var result = when(guessedNumber){
        1 -> "Oops!!! You Lost"
        2 -> "Oops!!! You Lost"
        3 -> "Congratulation! You Won"
        4 -> "Oops!!! You Lost"
        5 -> "Oops!!! You Lost"
        else -> "Enter a number between 1 to 5"
    }
    println(result)

    var years = 2
    var SI = when(years){
        1 -> {
            var SI = (48000 * 4 * 1)/100
            println(SI)
        }
        2 -> {
            var SI = (48000 * 4 * 2)/100
            println(SI)
        }
        3 -> {
            var SI = (48000 * 4 * 3)/100
            println(SI)
        }
        else -> "SI could not be calculated"
    }

}