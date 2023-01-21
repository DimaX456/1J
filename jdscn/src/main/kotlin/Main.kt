import kotlin.math.log
fun main() {
B("AASADDSS".toCharArray())
}
fun B(x:CharArray) {
    for (i in 0..x.size - 2)
        for (j in 0..i)
            if (x[j] > x[j + 1]) {
                var a = x[j]
                x[j] = x[j + 1]
                x[j + 1] = a
            }
    var n: Int = 0;
    var c: Char = x[0];
    x.forEach {
        if (c != it) {
            println("${c}-${n}")
            n = 0
        }
        n++
        c = it
    }
    println("${c}-${n}")
    println(x.concatToString())
}