
fun main(){
    var day = ""
    var color = ""
    println("Цвета и дни недели, которые можно использовать:")
    println(Colors.values().asList())
    println(Daysofweek.values().asList())
    while (day !="Monday" && day!= "Tuesday" && day!= "Wednesday"&& day!= "Thurday"&& day!= "Friday"&& day!= "Saturday"&& day!= "Sunday")
    {
        println("Введите день недели (на английском)")
        day = readLine()!!.toString()
        if (day !="Monday" && day!= "Tuesday" && day!= "Wednesday"&& day!= "Thurday"&& day!= "Friday"&& day!= "Saturday"&& day!= "Sunday") println("Неверно введено данное")
    }

    var day1 = Daysofweek.valueOf(day)
    println(DaysStr(day1))
    println(DaysInt(day1))
    println(Holidays(day1))
    println(Next(day1))

    while (color !="Red" && color != "Green" && color != "Blue" && color != "Pink" && color != "Yellow" && color != "Black" && color != "Purple")
    {
        println("Введите цвет (на английском)")
        color = readLine()!!.toString()
        if (color !="Red" && color != "Green" && color != "Blue" && color != "Pink" && color != "Yellow" && color != "Black" && color != "Purple") println("Неверно введено данное")
    }
    var color1 = Colors.valueOf(color)

    println(ColorsStr(color1))
    println(ColorsInt(color1))
    println(Kind(color1))
    println(Rainbow(color1))
}