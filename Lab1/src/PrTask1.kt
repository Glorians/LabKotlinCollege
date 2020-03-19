fun Task1 (state: Boolean, name: String) {
    if (state) {
        //Номер задачі
        val tool = Tools()
        tool.printing(1, "Вивести абревіатуру ПІБ")

        fun fio(name: String): String {
            var result: String = ""
            val list = name.split(" ")

            for (name in list) {
                println(name)
                val n1 = name.split("")
                result += n1[1]
            }

            return result.toUpperCase()
        }

        val result: String = fio(name)
        println("Результат: $result")
    }
}