
enum class Daysofweek {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday
}

    fun DaysStr(day: Daysofweek): String {
        return when (day) {
            Daysofweek.Monday -> "Понедельник"
            Daysofweek.Tuesday -> "Вторник"
            Daysofweek.Wednesday -> "Среда"
            Daysofweek.Thursday -> "Четверг"
            Daysofweek.Friday -> "Пятница"
            Daysofweek.Saturday -> "Суббота"
            Daysofweek.Sunday -> "Воскресенье"
        }
    }

    fun DaysInt(day: Daysofweek): Int {
        return when (day) {
            Daysofweek.Monday -> 1
            Daysofweek.Tuesday -> 2
            Daysofweek.Wednesday -> 3
            Daysofweek.Thursday -> 4
            Daysofweek.Friday -> 5
            Daysofweek.Saturday -> 6
            Daysofweek.Sunday -> 7
        }
    }

    fun Holidays(day: Daysofweek): String {
        return if (day == Daysofweek.Monday || day == Daysofweek.Tuesday || day == Daysofweek.Wednesday || day == Daysofweek.Thursday || day == Daysofweek.Friday)
            "Это рабочий день"
        else "В этот день будет выходной"

    }

    fun Next(day: Daysofweek): String {
        return when (day) {
            Daysofweek.Monday -> "Следующий день недели - Вторник"
            Daysofweek.Tuesday -> "Следующий день недели - Среда"
            Daysofweek.Wednesday -> "Следующий день недели - Четверг"
            Daysofweek.Thursday -> "Следующий день недели - Пятница"
            Daysofweek.Friday -> "Следующий день недели - Суббота"
            Daysofweek.Saturday -> "Следующий день недели - Воскресенье"
            Daysofweek.Sunday -> "Следующий день недели - Понедельник"
        }
    }

  /*  fun Event(day: Daysofweek): String {
        return when (day) {
            Daysofweek.Monday -> "В этот день вы хотели встретиться с друзьями"
            Daysofweek.Tuesday -> "В этот день вам нужно сделать отчет о практике"
            Daysofweek.Wednesday -> "В этот день у вас нет никаких планов"
            Daysofweek.Thursday -> "В этот день вам нужно подготовиться к контрольной"
            Daysofweek.Friday -> "В этот день вы хотели пойти на матч"
            Daysofweek.Saturday -> "В этот день вы хотели отдохнуть и ничего не делать"
            Daysofweek.Sunday -> "В этот день вы хотели встретиться с друзьями"
        }
    }*/
