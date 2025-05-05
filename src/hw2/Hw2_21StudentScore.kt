package hw2

import java.util.Scanner

class Hw2_21StudentScore {
    companion object {
//     @JvmStatic
//     fun main(args: Array<String>){
//      val scanner = Scanner(System.`in`)
//         val grade = scanner.nextInt()
//         val score: String
//         if (90 <= grade && grade <= 100) {
//             score = "A"
//         } else if (grade >= 75 && grade <= 89) {
//             score = "B"
//         } else if (grade >= 50 && grade <= 74) {
//             score = "C"
//         } else if (grade >= 30 && grade <= 49) {
//             score = "D"
//         } else if (grade >= 0 && grade <= 29) {
//             score = "F"
//         } else {
//             score = "Некорректная оценка"
//         }
//         scanner.close()
//         println(score)
//     }
// }

        @JvmStatic
        fun main(args: Array<String>) {
            val scanner = Scanner(System.`in`)
            val grade = scanner.nextInt()
            val score = when {
                90 <= grade && grade <= 100 -> {
                    "A"
                }

                grade >= 75 && grade <= 89 -> {
                    "B"
                }

                grade >= 50 && grade <= 74 -> {
                    "C"
                }

                grade >= 30 && grade <= 49 -> {
                    "D"
                }

                grade >= 0 && grade <= 29 -> {
                    "F"
                }

                else -> {
                    "Некорректная оценка"
                }

            }
            scanner.close()
            println(score)
        }
    }
}