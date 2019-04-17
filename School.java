import java.util.List;

class School{

    //an invalid case would be if a mark/percentage is found below 0
    public static boolean isValid(List eleves){

        for(int i = 0; i < eleves.size(); i++){
            if((double) eleves.get(i) < 0.0){
                return false;
            }
        }

        return true;

    }

    public static double ClassMedian(List eleves, int size){

        SortList(eleves);

        if(size % 2 != 0){
            int middle = size / 2;
            return (double) eleves.get(middle);
        }
        
        else{

            double calcMedian;

            calcMedian = (double) eleves.get(size / 2);
            calcMedian += (double) eleves.get((size / 2) + 1);
            return calcMedian / 2;
        }
        
    }

    public static double ClassAvg(List eleves){

        double mean = 0f;

        for(int i = 0; i < eleves.size(); i++){
            mean += (double) eleves.get(i);
        }

        return mean / eleves.size();

    }

    private static void SortList(List e){

        for(int i = 1; i < e.size(); i++){
            double key = (double) e.get(i);
            int j = i - 1;
            while(j>=0 && (double)e.get(j)>key){
                e.set(j+1,e.get(j));
                j--;
            }
            e.set(j+1, key);
        }

    }
}