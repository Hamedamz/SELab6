import java.util.ArrayList;

public class Sorter {
    private ArrayList<Integer> inputArray;

    public ArrayList<Integer> getSortedArray() {
        sortGivenArray();
        return inputArray;
    }

    public Sorter(ArrayList<Integer> inputArray){
        this.inputArray = inputArray;
    }

    public void sortGivenArray(){
        for (int i = 0; i < inputArray.size() - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < inputArray.size(); j++){
                if (inputArray.get(j) < inputArray.get(index)){
                    index = j;
                }
            }
            int smallerNumber = inputArray.get(index);
            inputArray.set(index, inputArray.get(i));
            inputArray.set(i, smallerNumber);
        }
    }
}
