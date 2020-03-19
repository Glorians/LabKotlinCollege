fun Task3 (state: Boolean) {

    if (state) {
        //Номер задачі
        val tool = Tools()
        tool.printing(3, "Шифрування")

        val str: String = "Ще не вмерла Україна, ні слава ні воля"

        //DATA
        val alphabet = mutableListOf<Char>(
            'а', 'б', 'в', 'г', 'ґ', 'д', 'е', 'є', 'ж', 'з',
            'и', 'і', 'ї', 'й', 'к', 'л', 'м', 'н', 'о', 'п',
            'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
            'ь', 'ю', 'я'
        )
        val alphabetReadOnly = alphabet as List<Char> // Защита, вернее костыль
        val alphabetReversed = alphabetReadOnly.asReversed()

        println(alphabet)
        println(alphabetReversed)

        fun encryption(str: String) {
            // Пошук id в алфавіті
            fun searchAlphabetId(char: Char): Int {
                var num = 0
                for (n in alphabet) {
                    if (char == n) {
                        return num
                    }
                    num++
                }
                return 0

            }

            // Змінюємо символи
            fun changeChar(id: Int): Char {
                return alphabetReversed[id]
            }

            val strChar = str.toCharArray()

            var result: String = ""
            for (char in strChar) {

                var uppercase = false
                if (char.isUpperCase()) {
                    char.toLowerCase()
                    uppercase = true
                }
                val id = searchAlphabetId(char)
                val charChange = changeChar(id)

                if (uppercase) {
                    println(charChange.toUpperCase())
                    charChange.toUpperCase()
                }
                result += charChange
            }
            println("Результат $result")

        }

        encryption(str)

    }
}
