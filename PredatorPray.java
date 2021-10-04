public class PredatorPray {
	public static void main(String[] args) {
        PredatorPray.runSimulation(23,2,100);
	}
    public static void runSimulation (int n , int s , int t ){
        //  n = gridsize of the playingfield.
        //  s = number of steps to move 
        //  t = number of steps ? whatever that means.

        // init and allocating memory. 
        int[] pray_position = new int[2];
        int[] predetor_position = new int[2];

        // delcare start positions
        pray_position[0]=10;
        pray_position[1]=10;
        predetor_position[0]=20;
        predetor_position[1]=20;

        System.out.format("n=%d s=%d t=%d",n,s,t);
        System.out.println("");
        
        int h =0 ;
        while(h<=t){
            pray_position=PredatorPray.new_position_pray(s,pray_position);
            predetor_position = PredatorPray.new_position_predetor(s, predetor_position, pray_position);

            System.out.format("[%d;%d] [%d;%d]",pray_position[0],pray_position[1],predetor_position[0],predetor_position[1]);
            h++;
        }
    }

    public static int[] new_position_pray(int step_size, int[] pray_position){
        int min = -step_size;
        int max = step_size;
        pray_position[0]=((int)Math.floor(Math.random()*(max-min+1)+min))+pray_position[0];
        pray_position[1]=((int)Math.floor(Math.random()*(max-min+1)+min))+pray_position[0];

        return pray_position;
    }
    
    public static int[] new_position_predetor(int step_size, int[] predetor_position, int[] pray_position){
        for (int i = 0; i < step_size; i++) {
            if(pray_position[0] > predetor_position[0]){
                predetor_position[0]++;
            }else if(pray_position[0] < predetor_position[0]){
                predetor_position[0]--;
            }
            if(pray_position[1] > predetor_position[1]){
                predetor_position[1]++;
            }else if(pray_position[1] < predetor_position[1]){
                predetor_position[1]--;
            }
            if((pray_position[0] == predetor_position[0])&&(pray_position[1] == predetor_position[1])){
                System.out.print("Catch!");
                System.exit(0);
            }
        }
        return predetor_position;
    }


}

