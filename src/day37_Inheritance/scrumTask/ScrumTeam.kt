package day37_Inheritance.scrumTask

import java.util.*
import java.util.function.Predicate

class ScrumTeam(PO: ProductOwner, BA: BusinessAnalyst, SM: ScrumMaster) {
    var PO: ProductOwner
    var BA: BusinessAnalyst
    var SM: ScrumMaster
    var testers: ArrayList<Tester> = ArrayList<Tester>()
    var developers: ArrayList<Developer> = ArrayList<Developer>()

    init {
        this.PO = PO
        this.BA = BA
        this.SM = SM
    }

    fun addTester(tester: Tester) {
        testers.add(tester)
    }

    fun addTesters(testers: Array<Tester>) {
        this.testers.addAll(Arrays.asList<Array<Tester>>(*testers))
    }

    fun removeTester(id: Int) {
        testers.removeIf(Predicate<Tester> { p: Tester -> p.id === id })
    }

    fun addDeveloper(developer: Developer) {
        developers.add(developer)
    }

    fun addDevelopers(developers: Developer?) {
        this.developers.addAll(Arrays.asList(developers))
    }

    fun removeDeveloper(id: Int) {
        developers.removeIf(Predicate<Developer> { p: Developer -> p.id === id })
    }

    override fun toString(): String {
        return "ScrumTeam{" +
                "PO=" + PO.name +
                ", BA=" + BA.name +
                ", SM=" + SM.name +
                ", number of testers=" + testers.size +
                ", number of developers=" + developers.size +
                '}'
    }
}