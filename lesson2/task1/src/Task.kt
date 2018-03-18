data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) {

    operator fun compareTo(date2: MyDate): Int {
        return if (date2.year != this.year) {
            this.year - date2.year
        } else if (this.month != date2.month) {
            this.month - date2.month
        } else {
            this.dayOfMonth - date2.dayOfMonth
        }
    }

}

fun compare(date1: MyDate, date2: MyDate) = date1 < date2
