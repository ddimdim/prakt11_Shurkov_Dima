
enum class Colors {
    Red,
    Green,
    Blue,
    Purple,
    Pink,
    Yellow,
    Black
}

    fun ColorsStr(colors: Colors): String {
        return when (colors) {
            Colors.Red -> "Красный"
            Colors.Green -> "Зеленый"
            Colors.Blue -> "Синий"
            Colors.Purple -> "Фиолетовый"
            Colors.Pink -> "Розовый"
            Colors.Yellow -> "Желтый"
            Colors.Black -> "Черный"
        }

    }

    fun ColorsInt(colors: Colors): Int {
        return when (colors) {
            Colors.Red -> 1
            Colors.Green -> 2
            Colors.Blue -> 3
            Colors.Purple -> 4
            Colors.Pink -> 5
            Colors.Yellow -> 6
            Colors.Black -> 7
        }
    }

    fun Kind(colors: Colors): String {
        return if (colors == Colors.Red || colors == Colors.Green || colors == Colors.Blue) "Это 1 из 3 стандартных цветов"
        else if (colors == Colors.Pink || colors == Colors.Yellow) "Это яркий цвет"
        else "Это темный цвет"
    }

    fun Rainbow(colors: Colors): String {
        return if (colors == Colors.Red || colors == Colors.Green || colors == Colors.Blue || colors == Colors.Purple || colors == Colors.Yellow) "Это один из цветов радуги"
        else "Этого цвета нет на радуге"
    }
