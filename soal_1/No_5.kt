package soal_1

data class maba(val nama: String, val umur: Int, val asal: String)

fun <T> pencarian(data: List<T>, nama: String, selector: (T) -> String): List<T> {
    return data.filter { selector(it) == nama }
}

fun main() {
    val daftarMaba = listOf(
        maba("Rafli", 19, "SMA 1 Tegal"),
        maba("Nugi", 21, "SMA 2 Tegal"),
        maba("Bagus", 19, "SMA 3 Tegal")
    )

    val hasilPencarian = pencarian(daftarMaba, "Rafli") { it.nama }
    hasilPencarian.forEach { println(it) }
}
