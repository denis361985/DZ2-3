fun main () {
    val summ = 10000
    val totalSales = 3
    val regularCustomer = totalSales > 2

    var totalTax = if (summ > 0 && summ <= 1000) 0 else if (summ > 1000 && summ <= 10000) 100 else summ * 5 / 100
    if (regularCustomer) totalTax += (summ - totalTax) * 1 / 100
    val totalSumm = summ - totalTax
    println("""Покупка на сумму: $summ руб.
        |Скидка составляет: $totalTax руб.
        |Итоговая сумма со скидкой: $totalSumm руб.
    """.trimMargin())

}