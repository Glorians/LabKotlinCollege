fun task1 (state: Boolean) {
    if (state) {

        //Номер задачі
        val tool = Tools()
        tool.printing(1, "Перевести список температур Фаренгейта -> Цельсія")

        val listTempFarg = mutableListOf<Double>()

        for (x in -25..40) {
            listTempFarg.add(x.toDouble())
        }

        val convert = (it - 32)/1.8


        fun convertTemperature (listTempF: MutableList<Double>): MutableList<Double> {

            val resultList = mutableListOf<Double>()
            for (x in listTempF) {
                val num = (x-32) / 1.8
                resultList.add(num)
            }
            return resultList
        }

        val listTempCel = convertTemperature(listTempFarg)


        fun printingResult (listF: MutableList<Double>, listC: MutableList<Double>) {

            val temperature = listTempFarg.zip(listTempCel)

            for (temp in temperature) {
                println("${temp.first} --> ${temp.second}")
            }
        }

        printingResult(listTempFarg, listTempCel)

    }
}

