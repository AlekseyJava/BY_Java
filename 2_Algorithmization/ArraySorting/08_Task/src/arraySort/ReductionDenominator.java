package arraySort;

public class ReductionDenominator {

    public double[] sorting(int[] p, int[] q, int n){

        double[] k = new double[n];
        double[] pq = new double[n];
        for(int i = 0; i < n; i++){
            k[i] = 1;
            for(int j = 0; j < n; j++){
                if(i!=j){
                    k[i]=k[i]*q[j];
                }
            }
        }
        //return

        for (int i = 0; i < n; i++){
            //pq[i] = (double)(p[i]*k[i])/q[i];
            pq[i] = (double)(p[i]*k[i]/q[i]);
        }
        return pq;
        //return k;

    }
}
