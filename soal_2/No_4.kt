package soal_2

fun main() {
    val lines = 6

    for (i in 0 ..< lines) {
        for (j in 0 ..< lines) {
            if (j >= i) {
                print("* ")
            } else {
                print("  ")
            }
        }
        println()
    }

    for (i in 0 ..< lines) {
        for (j in 0 ..< lines) {
            if (j >= lines - i - 1) {
                print("* ")
            } else {
                print("  ")
            }
        }
        println()
    }
}