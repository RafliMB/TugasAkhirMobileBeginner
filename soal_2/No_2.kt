package soal_2

fun konversi(kata: String): String {
    return kata.replace('o', 'a')
}

fun main() {
    val kataSebelumnya = "Purwokerto"
    val kataSetelahDiubah = konversi(kataSebelumnya)
    println("Kata sebelumnya: $kataSebelumnya")
    println("Kata setelah diubah: $kataSetelahDiubah")
}
