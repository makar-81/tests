val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
    // Напишите ваш код здесь
    //var str = scan.nextLine()
    //println(str[0]+" "+str[str.length-1])
    //println(str[0]+" "+str[str.length-1])
    //println(str.toInt() / 10)
    //val asa = str[3].toString().toInt() * 1000 + str[2].toString().toInt() * 100 + str[1].toString().toInt() * 10 + str[0].toString().toInt()
    //println("${str.substring(0,1)}F${str.substring(2,str.length-1)}L${str.substring(str.length-1..str.length-1)}")
    val a = scan.nextLine()
    when (a.length){
        in (1..10) -> print("A")
        20 -> print("B")
        15 -> print("C")
        else -> print("D")
    }
}