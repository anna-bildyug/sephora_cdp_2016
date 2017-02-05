package com.epam.cdp.volha_ivanova.task2;

public class Runner {
	/**
	 * @author Volha_Ivanova Determine time for add, get and remove object in
	 *         ArrayList/LinkedList, HashSet/TreeSet, HashMap/TreeMap
	 * @param MAX
	 *            Maximum value of elements in the collection
	 */
	public static void main(String[] args) {
		final int MAX = 7500;
		PerformanceArrayLinkedLists arrayLinked = new PerformanceArrayLinkedLists();
		arrayLinked.performanceAddArrayLinkedLists(MAX);
		arrayLinked.performanceGetArrayLinkedLists(MAX);
		arrayLinked.performanceRemoveArrayLinkedLists(MAX);
		System.out.println();
		PerformanceHashTreeSets hashTree = new PerformanceHashTreeSets();
		hashTree.performanceAddAHashTreeSets(MAX);
		hashTree.performanceGetHashTreeSets(MAX);
		hashTree.performanceRemoveHashTreeSets(MAX);
		System.out.println();
		PerformanceHashTreeMaps hashTreeMap = new PerformanceHashTreeMaps();
		hashTreeMap.performanceAddHashTreeMaps(MAX);
		hashTreeMap.performanceGetHashTreeMaps(MAX);
		hashTreeMap.performanceRemoveHashTreeMaps(MAX);
	}
}