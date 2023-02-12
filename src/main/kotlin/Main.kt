fun main(args: Array<String>) {
        println("Payslip Printer")
        printPayslip()
        println("\n")
        printPayslipWithRounding()
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

    println("| \t                           Employee Payslip                                                     |")
    println("| ----------------------------------------------------------------------- |")
    print("| Employee Name:  ${firstName.uppercase()} ${surname.uppercase()} ($gender)")
    println(" \t Employee ID: $employeeId                        |")
    println("| ----------------------------------------------------------------------- |")
    print("| Payment Details ")
    println(" Deduction Details                                      |")
    println("| ----------------------------------------------------------------------- |")
    print("| Gross Salary: $grossSalary \t ")
    println(" PAYE: $payePercentage%                                 |")
    print("| Annual Bonus: $annualBonus \t")
    println("PRSI: $prsiPercentage%                                        |")
    println("| \t\t\t\t\t\t Cycle to work: $cycleToWorkDeduction                             |")
    println("| ----------------------------------------------------------------------- |")
    println("| \t                        Net Salary: $netSalary                                           |")
    println("| ----------------------------------------------------------------------- |")

}

fun printPayslipWithRounding(){
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

    //function returns the formatted string to two decimal places
    fun formatAsTwoDecimalPlaces(value: Double): String {
        return "%.2f".format(value)
    }

    println("""
| ----------------------------------------------------------------------- 
|                           Employee Payslip                                                     
| ----------------------------------------------------------------------- 
| Employee Name:  ${firstName.uppercase()} ${surname.uppercase()} ($gender)                  Employee ID: $employeeId                        
| ----------------------------------------------------------------------- 
| Payment Details                               Deduction Details                                      
| ----------------------------------------------------------------------- 
| Gross Salary: ${formatAsTwoDecimalPlaces(grossSalary)}                        PAYE: ${formatAsTwoDecimalPlaces(payePercentage)}%                                 
| Annual Bonus: ${formatAsTwoDecimalPlaces(annualBonus)}                         PRSI: ${formatAsTwoDecimalPlaces(prsiAmount)}%                                        
|                                               Cycle to work: ${formatAsTwoDecimalPlaces(cycleToWorkDeduction)}                             
| ----------------------------------------------------------------------- 
| Total Deduction: ${formatAsTwoDecimalPlaces(totalDeductions)}                                                
| ----------------------------------------------------------------------- 
|                            Net Salary: ${formatAsTwoDecimalPlaces(netSalary)}                           
| ----------------------------------------------------------------------- 
""")}


