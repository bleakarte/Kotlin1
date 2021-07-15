fun main(args: Array<String>) {
    //IF statement: Age limit system
    var age: Int
    age = 20

    if (age < 18){
        println("You are underage")
    }else{
        println("You have qualified")
    }

    //ELSE IF statement: Grading system
    var marks: Int
    marks = 90

    if (marks < 20){
        println("E")
    }else if(marks < 40){
        println("D")
    }else if(marks < 60){
        println("C")
    }else if(marks < 80){
        println("B")
    }else{
        println("A")
    }

    //WHEN statement
    //Number check
    var number: Int
    number = 0

    when(number){
        1 -> println("One was found")
        2 -> println("Two was found")
        3 -> println("Three was found")
        else -> println("We didn't recognize the number")
    }

    //Calculator
    var x: Float
    var y: Double
    var options: Int

    x = 12.5F
    y = 87.5

    options = 1
    when(options){
        1 ->{
            var answer = x + y
            println(answer)
        }
        2 ->{
            var answer = x - y
            println(answer)
        }
        3 ->{
            var answer = x / y
            println(answer)
        }
        4 ->{
            var answer = x * y
            println(answer)
        }
        else -> println("Sorry we didn't understand your request")
    }

    //Simple interest
    var years: Int

    years = 1

    when(years){
        1 ->{
            var SI = (10000 * 5 * 1)/100
            println(SI)
        }
        2 ->{
            var SI = (10000 * 5 * 2)/100
            println(SI)
        }
        3 ->{
            var SI = (10000 * 5 * 3)/100
            println(SI)
        }
        else -> println("Sorry we couldn't process the interest")
    }

}