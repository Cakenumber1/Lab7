package gr

class MainClass {
    public static void main(String[] args) {
        FirstClass firstClass = new FirstClass(1, 2.9f, "name")

        println "Old date"
        println firstClass.getProperty("intNumber")
        println firstClass.getProperty("floatNumber")
        println firstClass.getProperty("string")

        firstClass.setProperty("intNumber", 3)
        firstClass.setProperty("floatNumber", 4.5f)
        firstClass.setProperty("string", "hello")

        println "New date"
        println firstClass.getProperty("intNumber")
        println firstClass.getProperty("floatNumber")
        println firstClass.getProperty("string")

        try {
            // Не знаю надо было оставлять тот, что выдает ошибку или нет, но вот
            // Создайте два метода, один из которых возвращает тип Integer,
            // а второй – тип int. В обоих методах должен быть один параметр
            // тип Integer. Попытайтесь выполнить эти методы, передав в
            // качестве параметра значение null. Какой из методов выполнится?
            println ReturnClass.returnInt(null)
        }
        catch (NullPointerException e) {
            e.printStackTrace()
        }


        println "Возвращение метода return Integer: "
        println ReturnClass.returnInteger(null)

        BigDecimal bigDecimalOne = new BigDecimal(3)
        BigDecimal bigDecimalTwo = new BigDecimal(3)
        println "Сравнение двух экземпляров класс BigDecimal: "
        println bigDecimalOne == bigDecimalTwo

        BigDecimal resultMethod = bigDecimalOne.add(bigDecimalTwo)
        BigDecimal resultOperator = bigDecimalOne + bigDecimalTwo
        println "Сравнение метода add и оператора +: "
        println resultMethod == resultOperator

        def a = 10
        println "Def переменная: "
        println a.getClass()
        a = "First"
        println a.getClass()

        Date dateOne = new Date(2015, 2, 28)
        Date dateTwo = new Date(2015, 1, 31)
        println "Date переменные"
        println(dateOne - dateTwo)
        dateOne.month += 1 + 1
        dateOne.date += 1
        println(dateOne)
    }
}
