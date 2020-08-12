package org.mak.easy

import spock.lang.Specification

class TwoNumberSumTest extends Specification {
    def "get an empty result for empty input"() {
        setup:
            def app = new TwoNumberSum()
            def inputArray = [] as Integer[]
            def targetSum = 0
        when:
            def result = app.findCouplets(inputArray,targetSum)
        then:
            null != result && 0 == result.length
    }
    def "get an empty result for input with less 2 items"() {
        setup:
            def app = new TwoNumberSum()
            def inputArray = [1] as Integer[]
            def targetSum = 0
        when:
            def result = app.findCouplets(inputArray,targetSum)
        then:
            null != result && 0 == result.length
    }

    def "get a proper result for input with proper items"() {
        setup:
            def app = new TwoNumberSum()
            def inputArray = [3, 5, -4, 8, 11, 1, -1, 6] as Integer[]
            def targetSum = 10
        when:
            def result = app.findCouplets(inputArray,targetSum)
        then:
            null != result && result[0] == 11 && result[1] == -1
    }
}
