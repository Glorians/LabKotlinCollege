
fun task1 (state: Boolean) {
    if (state) {

        //Номер задачі
        val tool = Tools()
        tool.printing(1, "Коротко про мене")

        val name: String = "Олексій"
        val age: Int = 19
        val studyNum: Int = 4
        val study: String = "программиста"
        val city: String = "Черкаси"

        println("Привіт, мене звати $name і мені $age років," +
                " вчусь чутка на $studyNum курсе $study." +
                "\nЖиву в місті $city...")
        println("PS: Дужее коротка біография :)")
        println()

    }
}

