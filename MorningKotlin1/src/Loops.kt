fun main(args: Array<String>) {
    //WHILE loop
    var x: Int = 0
    while (x < 5){
        println(x)
        x++
    }

    //DO WHILE loop
    var y: Int = 20
    do {
        println(y)
        y++
    }while (y < 15)

    //REPEAT loop
    repeat(10){
        print("Hello World ")
    }

    //FOR loop
    var names = arrayOf("Jeff","Betty","Wayne","Becky","Sharon")
    for (jina in names){
        println(jina)
    }

    var numbers = 10 downTo 1
    for (nambari in numbers){
        println(nambari)
    }

}