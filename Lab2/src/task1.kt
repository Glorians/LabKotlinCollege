fun task1 (state: Boolean) {
    if (state) {

        //Номер задачі
        val tool = Tools()
        tool.printing(1, "Перевести список температур Фаренгейта -> Цельсія")

        val listTempFarg = mutableListOf<Double>()

        // Генеруємо температуру Фарангейта
        for (x in -25..40) {
            listTempFarg.add(x.toDouble())
        }

        // Не до кінця зрозумів...
        val convert = {num: Double -> (num - 32)/1.8}

        val list = mutableListOf<Double>()

        val list2 = list.map {num: Double -> convert(num)}
        

        // Метод конвернутавння темеператури повертає список температури в цельсії
        fun convertTemperature (listTempF: MutableList<Double>): MutableList<Double> {

            val resultList = mutableListOf<Double>()
            for (x in listTempF) {
                val num = (x-32) / 1.8
                resultList.add(num)
            }
            return resultList
        }

        val listTempCel = convertTemperature(listTempFarg)


        // Метод виведення результату
        fun printingResult (listF: MutableList<Double>, listC: MutableList<Double>) {

            val temperature = listTempFarg.zip(listTempCel) //ключ Фарангейт -> значення Цельсій

            for (temp in temperature) {
                println("${temp.first} --> ${temp.second}")
            }
        }

        printingResult(listTempFarg, listTempCel)

    }
}

