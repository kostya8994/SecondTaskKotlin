fun main() {
    transfer(100, 10)
    transfer(1000, 50)
    transfer(10301, 50)
    transfer(30000, 80)
    transfer(90005, 50)
}
fun transfer(rub: Int, kop: Int){
    val amount = transferToKopecks(rub, kop)
    println("Перевод суммы: $rub руб. $kop коп.")
    val comission: Double
    if ((amount * 0.0075) < 3500){
        comission = 3500.0
    } else{
        comission = amount * 0.0075
    }
    println("Комиссия составляет: $comission коп.")
}
fun transferToKopecks(rub: Int, kop: Int): Int {
    return rub * 100 + kop
}