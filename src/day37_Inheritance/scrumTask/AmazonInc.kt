package day37_Inheritance.scrumTask

object AmazonInc {
    @JvmStatic
    fun main(args: Array<String>) {
        val company = "Amazon Inc"
        val po = ProductOwner("Suhaib", 29, 'M', "po", 1, 160000, "company")
        val ba = BusinessAnalyst("Cihad", 30, 'M', "bA", 2, 15000, "company")
        val sm = ScrumMaster("Anel", 26, 'F', "sM", 3, 14500, "company")
        val tester1 = Tester("Chinara", 32, 'F', "QA", 1415, 125000, company)
        val tester2 = Tester("Yasaman", 31, 'F', "QE", 1416, 130000, company)
        val tester3 = Tester("Irena", 29, 'F', "SDET", 1417, 128000, company)
        val tester4 = Tester("Cihad", 26, 'M', "QA", 1418, 125000, company)
        val testers: Array<Tester> = arrayOf<Tester>(tester1, tester2, tester3, tester4)
        val developer1 = Developer("Max", 40, 'M', "Senior Java Developer", 3665, 180000, company)
        val scrumTeam = ScrumTeam(po, ba, sm)
        scrumTeam.addDevelopers(developer1)
        scrumTeam.addTesters(testers)
        System.out.println(scrumTeam)
        println("------------------------------------------------")
        for (tester in scrumTeam.testers) {
            println(tester.name + " : " + tester.salary)
        }
        println("------------------------------------------------")
        for (developer in scrumTeam.developers) {
            println(developer.name + " : " + developer.salary)
        }
    }
}