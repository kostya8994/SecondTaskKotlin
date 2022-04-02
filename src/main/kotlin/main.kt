fun main() {
    println("Перевод суммы: 100.1 руб. Комиссия составит ${transfer(100.1)} руб.")
    println("Перевод суммы: 1000.5 руб. Комиссия составит ${transfer(1000.5)} руб.")
    println("Перевод суммы: 10301.5 руб. Комиссия составит ${transfer(10301.5)} руб.")
    println("Перевод суммы: 30000.8 руб. Комиссия составит ${transfer(30000.8)} руб.")
    println("Перевод суммы: 90005.50 руб. Комиссия составит ${transfer(90005.50)} руб.")
}
fun transfer(rub: Double) : Double{
    val amount = transferToKopecks(rub)
    if ((amount * 0.0075) < 3500){
        return transferToRub(3500.0)
    } else{
        return transferToRub(amount * 0.0075)
    }
}
fun transferToKopecks(rub: Double): Int {
    return (rub * 100).toInt()
}
fun transferToRub(kop: Double): Double{
    //Метод для нормального отображения копеек (двумя цифрами)
    return (kop.toInt()).toDouble() / 100
}