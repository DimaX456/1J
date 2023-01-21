fun main() {
var a:String = String()
    var out = ""
    a = readln()
    var c: Char = a[0];
    var n:Int = 0;
    a.forEach { Char
    if (c!=it){
        out+=c+if (n.toString()!="1") n.toString() else ""
            n = 0
    }
        n++;
        c = it
    }
    out+=c+if (n.toString()!="1")n.toString() else ""
    println(out)
}
