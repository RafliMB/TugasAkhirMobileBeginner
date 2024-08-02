package soal_2

fun main() {
    println("Masukkan nilai Bahasa Indonesia: ")
    val nilaiBahasaIndonesia = readLine()?.toIntOrNull() ?: return println("Nilai Bahasa Indonesia tidak valid")

    println("Masukkan nilai Bahasa Inggris: ")
    val nilaiBahasaInggris = readLine()?.toIntOrNull() ?: return println("Nilai Bahasa Inggris tidak valid")

    println("Masukkan nilai Matematika: ")
    val nilaiMatematika = readLine()?.toIntOrNull() ?: return println("Nilai Matematika tidak valid")

    println("Masukkan nilai IPA: ")
    val nilaiIPA = readLine()?.toIntOrNull() ?: return println("Nilai IPA tidak valid")

    if (nilaiBahasaIndonesia !in 0..100 ||
        nilaiBahasaInggris !in 0..100 ||
        nilaiMatematika !in 0..100 ||
        nilaiIPA !in 0..100) {
        return println("Nilai harus diantara 0 hingga 100")
    }

    val rataRata = (nilaiBahasaIndonesia + nilaiBahasaInggris + nilaiMatematika + nilaiIPA) / 4.0

    val grade = when {
        rataRata >= 90 -> "A"
        rataRata >= 80 -> "B"
        rataRata >= 70 -> "C"
        rataRata >= 60 -> "D"
        else -> "E"
    }

    println("Rata-rata nilai: %.2f".format(rataRata))
    println("Grade: $grade")
}