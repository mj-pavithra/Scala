object question04 {
        
    def attendance(price: Int):Int = {
        return 120 - (price - 15)/5 * 20
    }

    def attendaceCost(price: Int):Int = {
        return attendance(price)*3
    }

    def totalCost(price: Int):Int = {
        return 500 + attendaceCost(price)
    }

    def revenue(price: Int):Int = {
        return price * attendance(price)
    } 
    
    def profit(price:Int):Int = {
        return revenue(price) - totalCost(price)
    } 

    def main(args: Array[String]) = {
        println(profit(25))
    }

}