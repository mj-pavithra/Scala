object question03 {

    def normalWorkingHourPay(x:Double):Double = {
        return x*250
    }

    def OTWorkingHourPay(x:Double):Double = {
        return x*85
    }

    def payBeforeTax(x:Double,y:Double):Double = {
        return normalWorkingHourPay(x) + OTWorkingHourPay(y)
    }

    def tax(x:Double):Double = {
        return x*.12
    }

    def finalPay(x:Double,y:Double):Double = {
        return payBeforeTax(x,y) + tax(payBeforeTax(x,y))
    }

    def main(args: Array[String]) = {
        
        println("Normal worker salary : " + finalPay(40,30))
    }
}