fun main(args: Array<String>) {
        println("Payslip Printer")

    val firstName= "Joe"
    val surname= "Soap"
    val gender = 'm'
    val fullName = getFullName(firstName, surname, gender).toUpperCase()
    println("$fullName")
        printPayslip()
        println("\n")
        }

//function returns the formatted string to two decimal places
fun twoDecimalPlaces(value: Double): String {
    return "%.2f".format(value)
}

//function takes in two parameters fName and sName and returns full name in the format of fName sName with uppercase
fun getFullName(firstName: String, surname: String, gender: Char): String {
    return if (gender == 'm') {
        "Mr $firstName $surname"
    } else if (gender == 'f') {
        "Ms $firstName $surname"
    } else {
        "$firstName $surname"
    }
}
fun printPayslip(){
    val firstName = "joe"
    val surname = "soap"
    val gender = 'm'
    val employeeId = 6143
    val grossSalary = 67543.21
    val payePercentage = 38.5
    val prsiPercentage = 5.2
    val annualBonus = 1450.50
    val cycleToWorkDeduction = 54.33

    val monthlySalary = grossSalary / 12
    val payeAmount = monthlySalary * payePercentage / 100
    val prsiAmount = monthlySalary * prsiPercentage / 100
    val totalDeductions = payeAmount + prsiAmount + cycleToWorkDeduction
    val netSalary = monthlySalary + annualBonus - totalDeductions

    val fullName = getFullName(firstName, surname, gender).toUpperCase()


    println("""
| ----------------------------------------------------------------------- 
|                           Employee Payslip                                                     
| ----------------------------------------------------------------------- 
| Employee Name:  $fullName                      Employee ID: $employeeId                        
| ----------------------------------------------------------------------- 
| Payment Details                               Deduction Details                                      
| ----------------------------------------------------------------------- 
| Gross Salary: ${twoDecimalPlaces(grossSalary)}                        PAYE: ${twoDecimalPlaces(payePercentage)}%                                 
| Annual Bonus: ${twoDecimalPlaces(annualBonus)}                         PRSI: ${twoDecimalPlaces(prsiAmount)}%                                        
|                                               Cycle to work: ${twoDecimalPlaces(cycleToWorkDeduction)}                             
| ----------------------------------------------------------------------- 
| Total Deduction: ${twoDecimalPlaces(totalDeductions)}                                                
| ----------------------------------------------------------------------- 
|                            Net Salary: ${twoDecimalPlaces(netSalary)}                           
| ----------------------------------------------------------------------- 
""")}


