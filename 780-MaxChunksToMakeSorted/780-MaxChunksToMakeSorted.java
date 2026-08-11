// Last updated: 11/08/2026, 16:04:16
class Solution {
    public int maxChunksToSorted(int[] arr) {
        SortedSet<Integer> indexSet= new TreeSet<>();
        SortedSet<Integer> elementSet = new TreeSet<>();
        int chunks = 0;
        for(int i=0; i<arr.length; i++){
            indexSet.add(i);
            elementSet.add(arr[i]);
            if(indexSet.equals(elementSet)){
                chunks++;
                indexSet.clear();
                elementSet.clear();
            }
        }
        return chunks;
    }
}